package com.ultrapower.service;

import com.ultrapower.dao.AmAssetPropMapper;
import com.ultrapower.dao.AmAssetTypeMapper;
import com.ultrapower.dao.AmAssetTypePropMapper;
import com.ultrapower.dao.AmUserMapper;
import com.ultrapower.dto.AssetTypeDTO;
import com.ultrapower.dto.AssetTypeQueryVO;
import com.ultrapower.dto.Nodoea;
import com.ultrapower.pojo.*;
import com.ultrapower.utils.DateTimeUtils;
import com.ultrapower.utils.PkUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AmAssetTypeServiceimpl implements AmAssetTypeService{

    @Autowired
    AmAssetTypeMapper amAssetTypeMapper;

    @Autowired
    AmUserMapper userMapper;

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    AmAssetPropMapper amAssetPropMapper;

    @Autowired
    AmAssetTypePropMapper assetTypePropMapper;

    /**
     * 查询所有可以显示的数据  IS_VIEW=1  IS_DELETED=0
     * @return
     */
    /*public List<AmAssetType> findseleteAmAssetType() {
        AmAssetTypeExample amAssetTypeExample = new AmAssetTypeExample();
        AmAssetTypeExample.Criteria criteria = amAssetTypeExample.createCriteria();
        short IS_DELETED=0;
        short IS_VIEW=1;
        criteria.andIsDeletedEqualTo(IS_DELETED);
        criteria.andIsViewEqualTo(IS_VIEW);

        List<AmAssetType> amAssetTypes = amAssetTypeMapper.selectByExample(amAssetTypeExample);
        for (AmAssetType amAssetType:amAssetTypes){
            String pkCreator = amAssetType.getPkCreator();//创建人
            String pkMender = amAssetType.getPkMender();//最后修改人

            //根据ID查姓名
            String Creator = userMapper.selectByPrimaryKey(pkCreator).getUserAccount();
            String Mender = userMapper.selectByPrimaryKey(pkMender).getUserAccount();

            //把ID换成姓名
            amAssetType.setPkCreator(Creator);
            amAssetType.setPkMender(Mender);
        }
        return amAssetTypes;
    }*/
    //重新写了一条SQL语句大幅的简化代码
    public List<AmAssetType> findseleteAmAssetType() {
        List<AmAssetType> amAssetTypes = amAssetTypeMapper.selectTypeUserPkToAccount();
        return amAssetTypes;
    }

    /**
     * 根据用户名查询
     * @return
     */
    public AmAssetType findAmAssetTypeByName(String name) {
        AmAssetTypeExample amAssetTypeExample = new AmAssetTypeExample();
        AmAssetTypeExample.Criteria criteria = amAssetTypeExample.createCriteria();
        criteria.andTypeNameEqualTo(name);
        List<AmAssetType> amAssetTypes = amAssetTypeMapper.selectByExample(amAssetTypeExample);
        //用户名唯一不能重复
        return amAssetTypes.get(0);
    }

    /**
     * 查询数据树节点
     * @return
     */
    public List<Nodoea> assetTypes() {
        List<AssetTypeDTO> assetTypeDTOS = amAssetTypeMapper.assetTypes();//获取所有的一级二级节点

        List<Nodoea> nodes=new ArrayList<Nodoea>();

        for(int i=0;i<assetTypeDTOS.size();i++){
            //获取所有的数据（一级二级节点）
            AssetTypeDTO assetTypeDTO = assetTypeDTOS.get(i);

            //获取二级节点
            List<AssetTypeDTO> secondTypes = assetTypeDTO.getSecondTypes();

            //获取所有的一级节点
            Nodoea one = new Nodoea();
            one.setId((i+1)+"");
            one.setName(assetTypeDTO.getName());
            one.setpId(0+"");

            for(int j=0;j<secondTypes.size();j++){
                AssetTypeDTO assetTypeDTO1 = secondTypes.get(j);
                Nodoea two = new Nodoea();
                two.setId((100*(i+1)+j)+"");
                two.setName(assetTypeDTO1.getName());
                two.setpId((i+1)+"");
                nodes.add(two);
            }
            if(secondTypes.size()==0){
                Nodoea two = new Nodoea();
                two.setId((100*(i+1))+"");
                two.setName("暂无子分类");
                two.setpId((i+1)+"");
                nodes.add(two);
            }
            nodes.add(one);
        }
        return nodes;
    }

    /**
     * 根据资产创建时间来查询资产信息
     * @param queryVO
     * @return
     */
    public List<AmAssetType> findAmAssetTypeByCreateTime(AssetTypeQueryVO queryVO) {
        AmAssetTypeExample amAssetTypeExample = new AmAssetTypeExample();
        AmAssetTypeExample.Criteria criteria = amAssetTypeExample.createCriteria();
        criteria.andCreateTimeBetween(DateTimeUtils.stringToDate(queryVO.getBeginTime()),DateTimeUtils.stringToDate(queryVO.getEndTime()));
        criteria.andTypeNameLike("%"+queryVO.getKeywords()+"%");
        List<AmAssetType> amAssetTypes = amAssetTypeMapper.selectByExample(amAssetTypeExample);
        return amAssetTypes;

    }

    /**
     * 获取所有的一级节点（跟添加有间接关系）
     * @return
     */
    public List<AmAssetType> findAmAssetTypebypkAssetType() {
        //条件1：IS_DELETED=0  and IS_VIEW=1
        //条件2：必须一级分类节点
        AmAssetTypeExample amAssetTypeExample = new AmAssetTypeExample();
        AmAssetTypeExample.Criteria criteria = amAssetTypeExample.createCriteria();
        Short IS_DELETED=0;
        Short IS_VIEW=1;
        criteria.andIsDeletedEqualTo(IS_DELETED);
        criteria.andIsViewEqualTo(IS_VIEW);
        criteria.andPkTypeParentIsNull();
        List<AmAssetType> amAssetTypes = amAssetTypeMapper.selectByExample(amAssetTypeExample);
        return amAssetTypes;
    }

    /**
     * 添加资产信息
     * @param assetType
     * @param pkCreator
     * @return
     */
    public int addAssetType(AmAssetType assetType, String pkCreator) {
        //typeName类型名称  typeCode类型编码  pkTypeParent上级ID  typeDesc类型描述

        //检验用户名是否已存在
        String typeName = assetType.getTypeName();
        AmAssetTypeExample amAssetTypeExample = new AmAssetTypeExample();
        AmAssetTypeExample.Criteria criteria = amAssetTypeExample.createCriteria();
        criteria.andTypeNameEqualTo(typeName);
        List<AmAssetType> amAssetTypes = amAssetTypeMapper.selectByExample(amAssetTypeExample);
        if(amAssetTypes !=null&&amAssetTypes.size()>0){
            return -1;
        }
        assetType.setPkAssetType(PkUtils.getPrimaryKey());
        assetType.setPkTypeParent(assetType.getPkAssetType().equals("root")?null:assetType.getPkAssetType());
        Short IS_DELETED=0;
        Short IS_VIEW=1;
        assetType.setIsDeleted(IS_DELETED);
        assetType.setIsView(IS_VIEW);

        //创建人
        assetType.setPkCreator(pkCreator);
        //最后修改人
        assetType.setPkMender(pkCreator);

        //创建时间
        Date date = new Date();
        assetType.setCreateTime(date);
        assetType.setMendTimeLast(date);

        int insert = amAssetTypeMapper.insert(assetType);

        return insert;
    }

    /**
     * 通过id来查找数据（编辑ID的回显）
     * @param id
     * @return
     */
    public AmAssetType findAmAssetTypeById(String id) {
        AmAssetType amAssetType = amAssetTypeMapper.selectByPrimaryKey(id);
        return amAssetType;
    }

    /**
     * 编辑修改资产信息
     * @param amAssetType
     * @param token
     */
    public void saveAssetType(AmAssetType amAssetType, String token) {
        String pkAssetType = amAssetType.getPkAssetType();
        AmAssetType db_amAssetType = findAmAssetTypeById(pkAssetType);

        //表中的修改之后的数据
        String typeName = amAssetType.getTypeName();
        String typeCode = amAssetType.getTypeCode();
        String typeDesc = amAssetType.getTypeDesc();
        String pkTypeParent = amAssetType.getPkTypeParent();//如果选择“根节点” pkTypeParent==root  ， 数据库(NULL)

        db_amAssetType.setTypeName(typeName);
        db_amAssetType.setTypeCode(typeCode);
        db_amAssetType.setTypeDesc(typeDesc);
        db_amAssetType.setPkTypeParent(pkTypeParent.equals("root")?null:pkTypeParent);

        //最后修改人 cookie  redis  中有最后修改人的id
        //根据token（token）去redis中把当前用户id取出来
        String currentUid = redisTemplate.boundHashOps("session").get("token"+token)+"";

        db_amAssetType.setPkMender(currentUid);
        db_amAssetType.setMendTimeLast(new Date());

        int i = amAssetTypeMapper.updateByPrimaryKey(db_amAssetType);

    }

    /**
     * 删除资产信息
     * @param id
     * @return
     */
    public Map<String, Object> deleteAssetTypeById(String id) {
        Map<String, Object> result = new HashMap<String, Object>();

        AmAssetType amAssetTypeById = findAmAssetTypeById(id);
        Short ids=1;
        amAssetTypeById.setIsDeleted(ids);
        int i = amAssetTypeMapper.updateByPrimaryKey(amAssetTypeById);
        if(i>0){
            result.put("code","1");
        }else {
            result.put("code","0");
        }
        return result;
    }

    /**
     * 批量删除资产信息
     * @param ids
     * @return
     */
    public Map<String, Object> assetTypeBatchDel(String ids) {
        Map<String, Object> result = new HashMap<String, Object>();

        try {
            String[] split = ids.split(",");
            for(String id:split){
                deleteAssetTypeById(id);
                result.put("code","1");
            }
        } catch (Exception e) {
            result.put("code","0");
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 资产类型树页面，选中资产类型，加载两部分数据（详情，属性列表）
     * @param name
     * @return
     */
    public Map<String, Object> findAmAssetTypeAndPropListByName(String name) {
        //查询所有节点的分类详情
        AmAssetType amAssetTypeByName = findAmAssetTypeByName(name);

        //最后修改人的ID----》最后修改人的名字
        String pkMender = amAssetTypeByName.getPkMender();
        String userAccount = userMapper.selectByPrimaryKey(pkMender).getUserAccount();
        amAssetTypeByName.setPkMender(userAccount);

        //属性列表
        List<AmAssetProp> propListByAssetTypeId = amAssetPropMapper.findPropListByAssetTypeId(amAssetTypeByName.getPkAssetType());

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("amAssetTypeByName",amAssetTypeByName);
        map.put("propListByAssetTypeId",propListByAssetTypeId);
        return map;
    }

    /**
     * 配置资产属性后并保存（修改资产属性）
     * @param assetTypeProp
     * @return
     */
    public Map<String, Object> updateSaveConfigProp(AmAssetTypeProp assetTypeProp) {
        Map<String, Object> map = new HashMap<String, Object>();

        //传2个主键来唯一定义要修改的列表
        AmAssetTypePropExample example = new AmAssetTypePropExample();
        AmAssetTypePropExample.Criteria criteria = example.createCriteria();
        criteria.andPkAssetPropEqualTo(assetTypeProp.getPkAssetProp());
        criteria.andPkAssetTypeEqualTo(assetTypeProp.getPkAssetType());

        //重新查询数据
        AmAssetTypeProp assetTypeProp1 = assetTypePropMapper.selectByExample(example).get(0);

        //查询到的数据替换成从页面修改过后的数据
        assetTypeProp1.setIsView(assetTypeProp.getIsView());
        assetTypeProp1.setNeedValue(assetTypeProp.getNeedValue());
        assetTypeProp1.setCollectType(assetTypeProp.getCollectType().replace(",",""));

        //判断是否修改成功
        int i = assetTypePropMapper.updateByExample(assetTypeProp1,example);
        if(i>0){
            map.put("code",1);
        }else {
            map.put("code",0);
        }
        return map;
    }
}

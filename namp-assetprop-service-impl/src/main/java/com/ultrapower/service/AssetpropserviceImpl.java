package com.ultrapower.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ultrapower.dao.*;
import com.ultrapower.dto.Amassetdto;
import com.ultrapower.dto.AmassetpvlistVO;
import com.ultrapower.dto.Assetpeoplist;
import com.ultrapower.pojo.*;
import com.ultrapower.utils.DatetypetoString;
import com.ultrapower.utils.PkUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class AssetpropserviceImpl implements AssetpropserviceInterface{

    @Autowired
    AmAssetProcCollectMapper procCollectMapper;

    @Autowired
    AmAssetPortCollectMapper portCollectMapper;

    @Autowired
    AmAssetExtendPropMapper propMapper;

    @Autowired
    AmBsProvMapper amBsProvMapper;

    @Autowired
    AmAssetTypeMapper amAssetTypeMapper;

    @Autowired
    AmAssetMapper amAssetMapper;

    @Autowired
    AmAssetPropMapper assetPropMapper;

    @Autowired
    AmAssetPropValueMapper propValueMapper;

    @Autowired
    AmAssetTypeMapper assetTypeMapper;

    @Autowired
    AmAssetPropMapper amAssetPropMapper;

    @Autowired
    AmPropClassMapper amPropClassMapper;

    @Autowired
    AmAssetTypePropMapper assetTypePropMapper;

    /**
     * 查询所以可以显示的数据（am_asset_prop）
     * @return
     */
    public List<AmAssetProp> findAllAmAssetProp() {
        AmAssetPropExample amAssetPropExample = new AmAssetPropExample();
        AmAssetPropExample.Criteria criteria = amAssetPropExample.createCriteria();
        Short IS_DELETED =0;
        Short IS_VIEW = 1;
        criteria.andIsDeletedEqualTo(IS_DELETED);
        criteria.andIsViewEqualTo(IS_VIEW);
        List<AmAssetProp> amAssetProps = amAssetPropMapper.selectByExample(amAssetPropExample);
        return amAssetProps;
    }

    /**
     *在表格中显示属性数据(属性分类,业务分类,采集方式)
     * 实现分页功能
     * @return
     */
    public Map<String,Object> assetPropPageInit(int pageNum,int pageSize) {
        Map<String,Object> map = new HashMap<String,Object>();

        //（1）设置分页
        PageHelper.startPage(pageNum,pageSize);

        // （2）  1.表格中的属性数据（查数据库）
        //  获取所有可以显示的数据
        List<AmAssetProp> allAmAssetProp = findAllAmAssetProp();

        //（3）创建PageInfo
        PageInfo<AmAssetProp> pageInfo = new PageInfo<AmAssetProp>(allAmAssetProp);

        DatetypetoString datetypetoString = new DatetypetoString();
        for(AmAssetProp porp:allAmAssetProp){
            String dataType = porp.getDataType();
            porp.setDataType(datetypetoString.datetypetostrinf(dataType));

            //处理属性分类 id --> 名称
            String pkPropClass = porp.getPkPropClass();
            String propClassName = amPropClassMapper.selectByPrimaryKey(pkPropClass).getPropClassName();
            porp.setPkPropClass(propClassName);

            porp.setCollectType(datetypetoString.collectTypeToString(porp.getCollectType()));
        }

        //获取所以属性分类
        List<AmPropClass> amPropClasses = amPropClassMapper.selectByExample(null);

        //业务分类       1=通用属性、2=硬件属性、3=软件属性、4=登录属性、5=自定义属性
        Map<String, Object> Map1 = new HashMap<String, Object>();
        Map1.put("bsTypeId","1");
        Map1.put("bsTypeName","通用属性");
        Map<String, Object> Map2 = new HashMap<String, Object>();
        Map2.put("bsTypeId","2");
        Map2.put("bsTypeName","硬件属性");
        Map<String, Object> Map3 = new HashMap<String, Object>();
        Map3.put("bsTypeId","3");
        Map3.put("bsTypeName","软件属性");
        Map<String, Object> Map4 = new HashMap<String, Object>();
        Map4.put("bsTypeId","4");
        Map4.put("bsTypeName","登录属性");
        Map<String, Object> Map5 = new HashMap<String, Object>();
        Map5.put("bsTypeId","5");
        Map5.put("bsTypeName","自定义属性");

        List<Map<String, Object>> bsType = Arrays.asList(Map1, Map2, Map3, Map4, Map5);

        // 3位二进制位，分别代表：人工录入、登录采集、远程扫描。0为不支持、1-支持
        ArrayList<String> collectType = new ArrayList<String>();
        collectType.add("人工录入");
        collectType.add("登录采集");
        collectType.add("远程扫描");

        //把所有的数据放入Map集合返回给前台
        map.put("bsType",bsType);
        map.put("collectType",collectType);
        map.put("amPropClasses",amPropClasses);
        map.put("pageInfo",pageInfo);
        return map;
    }

    /**
     * 根据类型名称查询id
     * @param nodeName
     * @return
     */
    public String getTypeIdByTypeName(String nodeName) {
        AmAssetTypeExample amAssetTypeExample = new AmAssetTypeExample();
        AmAssetTypeExample.Criteria criteria = amAssetTypeExample.createCriteria();
        criteria.andTypeNameEqualTo(nodeName);
        String pkAssetType = assetTypeMapper.selectByExample(amAssetTypeExample).get(0).getPkAssetType();
        return pkAssetType;

    }

    /**
     * 根据 类型名称 查询没有被绑定的属性
     * @param nodeName
     * @return
     */
    public List<AmAssetProp> findPropByTypeNameNotBound(String nodeName) {

        String pkAssetType = getTypeIdByTypeName(nodeName);

        //根据指定的类型id去关联表中查询该类型绑定了那些属性id
        AmAssetTypePropExample amAssetTypePropExample = new AmAssetTypePropExample();
        AmAssetTypePropExample.Criteria criteria1 = amAssetTypePropExample.createCriteria();
        criteria1.andPkAssetTypeEqualTo(pkAssetType);

        List<AmAssetTypeProp> amAssetTypeProps = assetTypePropMapper.selectByExample(amAssetTypePropExample);
        List<String> propIds = new ArrayList<String>();
        for (AmAssetTypeProp amAssetTypeProp : amAssetTypeProps){
            String pkAssetProp = amAssetTypeProp.getPkAssetProp();//属性id
            propIds.add(pkAssetProp);
        }

        //  查询属性表，排除propIds
        AmAssetPropExample propExample = new AmAssetPropExample();
        AmAssetPropExample.Criteria propExampleCriteria = propExample.createCriteria();
        if(propIds.size()<=0){

        }else{
            propExampleCriteria.andPkAssetPropNotIn(propIds);
        }

        List<AmAssetProp> propList = amAssetPropMapper.selectByExample(propExample);
        return propList;

    }

    /**
     * 为指定类型绑定属性
     * @param propIds
     * @return
     */
    public Map<String, Object> boundAssetTypeProps(String propIds, String typeName) {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            String typeIdByTypeName = getTypeIdByTypeName(typeName);
            String[] split = propIds.split(",");
            for(String s:split){
                AmAssetTypeProp assetTypeProp = new AmAssetTypeProp();
                assetTypeProp.setPkAssetType(typeIdByTypeName);
                assetTypeProp.setPkAssetProp(s);
                assetTypePropMapper.insert(assetTypeProp);
            }
        } catch (Exception e) {
            map.put("code","0");
            e.printStackTrace();
        }
        map.put("code","1");
        return map;
    }

    /**
     * 删除资产信息
     * @param id
     * @return
     */
    public Map<String, Object> deleteAssetTypeById(String id) {
        Map<String, Object> map = new HashMap<String, Object>();
        AmAssetProp amAssetTypeById = findAmAssetTypeById(id);
        Short ids=1;
        amAssetTypeById.setIsDeleted(ids);
        int i = amAssetPropMapper.updateByPrimaryKey(amAssetTypeById);
        if(i == 1){
            map.put("code",1);
        }else {
            map.put("code",0);
        }
        return map;
    }

    /**
     * 通过id来查找数据（编辑ID的回显）
     * @param id
     * @return
     */
    public AmAssetProp findAmAssetTypeById(String id) {
        AmAssetProp amAssetProps = amAssetPropMapper.selectByPrimaryKey(id);
        return amAssetProps;
    }

    /**
     * 根据用户名进行模糊查询
     * @param propname
     * @param typename
     * @return
     */
    public List<AmAssetProp> Assetporpcontroller_servicebyname(String propname, String typename){

        HashMap<String,String> map = new HashMap<String, String>();
        String typeIdByTypeName = getTypeIdByTypeName(typename);
        map.put("PK_ASSET_TYPE",typeIdByTypeName);
        map.put("PROP_NAME","%"+propname+"%");
        List<AmAssetProp> propListByAssetTypeIdAndprop = amAssetPropMapper.findPropListByAssetTypeIdAndprop(map);
        return propListByAssetTypeIdAndprop;
    }

    /**
     * 资产类型树页面解绑操作
     * @param pkAssetProp
     * @param typeName
     * @return
     */
    public Map<String, Object> unbundle(String pkAssetProp, String typeName) {
        String typeIdByTypeName = getTypeIdByTypeName(typeName);
        AmAssetTypePropExample amAssetTypePropExample = new AmAssetTypePropExample();
        AmAssetTypePropExample.Criteria criteria = amAssetTypePropExample.createCriteria();
        criteria.andPkAssetTypeEqualTo(typeIdByTypeName);
        criteria.andPkAssetPropEqualTo(pkAssetProp);
        int i = assetTypePropMapper.deleteByExample(amAssetTypePropExample);
        Map<String, Object> map = new HashMap<String, Object>();
        if(i>0){
            map.put("code",1);
        }else {
            map.put("code",0);
        }
        return map;
    }

    /**
     * 资产类型树页面配置页面数据的回显
     * @param current_node_click
     * @param current_prop_config
     * @return
     */
    public Map<String, Object> configShow(String current_node_click, String current_prop_config) {
        Map<String, Object> map = new HashMap<String, Object>();
        String typeId = getTypeIdByTypeName(current_node_click);
        AmAssetTypePropExample amAssetTypePropExample = new AmAssetTypePropExample();
        AmAssetTypePropExample.Criteria criteria = amAssetTypePropExample.createCriteria();
        criteria.andPkAssetPropEqualTo(current_prop_config);
        criteria.andPkAssetTypeEqualTo(typeId);
        //1、关联表的数据
        AmAssetTypeProp assetTypeProp = assetTypePropMapper.selectByExample(amAssetTypePropExample).get(0);
        map.put("assetTypeProp",assetTypeProp);
        //2、属性名称、属性编码(根据属性id去属性表查询)
        AmAssetProp amAssetProp = amAssetPropMapper.selectByPrimaryKey(current_prop_config);
        map.put("amAssetProp",amAssetProp);
        return map;
    }

    /**
     * 添加资产属性表以及枚举类型对应的值域表
     * @param amassetpvlistVO
     * @return
     */
    public Map<String, Object> addassetlist(AmassetpvlistVO amassetpvlistVO) {
        Map<String, Object> map = new HashMap<String, Object>();

        try {
            //资产属性表
            AmAssetProp list = amassetpvlistVO.getAssetPropBaseInfo();
            list.setPkAssetProp(PkUtils.getPrimaryKey());
            Short s = 5;
            list.setBsType(s);
            Short s1 = 1;
            list.setComeFrom(s1);
            Short s2 = 0;
            list.setIsDeleted(s2);
            String replace = list.getCollectType().replace(",", "");
            list.setCollectType(replace);
            list.setPkCreator("aa6aa1d77251445c956f1b4504b1e981");
            list.setCreateTime(new Date());
            list.setPkMender("aa6aa1d77251445c956f1b4504b1e981");
            list.setMendTimeLast(new Date());
            assetPropMapper.insert(list);
                if (list.getDataType().equals("E")) {
                    //资产属性枚举的值域表
                    List<AmAssetPropValue> assetPropValue = amassetpvlistVO.getAssetPropValues();
                    for (int j = 0; j < assetPropValue.size(); j++) {
                        AmAssetPropValue amAssetPropValue = assetPropValue.get(j);
                        amAssetPropValue.setPkAssetPropValue(PkUtils.getPrimaryKey());
                        amAssetPropValue.setPkAssetProp(list.getPkAssetProp());
                        propValueMapper.insert(amAssetPropValue);
                    }
                }
            map.put("code",1);
            return map;
        } catch (Exception e) {
            map.put("code",0);
            return map;
        }
    }

    /**
     * 查询（添加资产）里面的列表
     * @return
     */
    public Map<String, Object> selectassetinitlist() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Amassetdto> amAssets = amAssetMapper.Amassetlist();
        map.put("amAssets",amAssets);
        return map;
    }

    /**
     * 查询资产属性添加列表里的基本属性
     * @return
     */
    public List<AmAsset> selectAmAssetlist() {
        List<AmAsset> amAssets = amAssetMapper.selectByExample(null);
        List<AmBsProv> amBsProvs = amBsProvMapper.selectByExample(null);
        List<AmAssetType> amAssetTypes = amAssetTypeMapper.selectByExample(null);
        for(int k = 0; k<amAssetTypes.size();k++) {
            AmAssetType amAssetType = amAssetTypes.get(k);
            String typeName1 = amAssetType.getTypeName();
            for (int i = 0; i < amBsProvs.size(); i++) {
                AmBsProv amBsProv = amBsProvs.get(i);
                String typeName = amBsProv.getBsName();
                for (int j = 0; j < amAssets.size(); j++) {
                    AmAsset amAsset = amAssets.get(j);
                    amAsset.setPkProvBs(typeName);
                    amAsset.setPkAssetType(typeName1);
                }
            }
        }
        return amAssets;
    }

    /**
     * 保存资产属性添加列表里的数据（查询资产类型下拉框的数据）
     * @param assetpeoplist
     * @return
     */
    public Map<String, Object> addassetpeoplist(Assetpeoplist assetpeoplist) {
        Map<String, Object> map = new HashMap<String, Object>();

        return map;
    }

    /**
     * 通过页面传过来的ID主键查询基本，端口，进程表的信息
     * @param pkAsset
     * @return
     */
    public Map<String, Object> getassetfilesmap(String pkAsset) {
        Map<String,Object> map = new HashMap<String, Object>();

        //1.基本信息
        AmAsset amAsset = amAssetMapper.selectByPrimaryKey(pkAsset);

        //2.基本信息扩展表
        AmAssetExtendProp extendProp = propMapper.selectByPrimaryKey(pkAsset);

        //3.端口信息
        AmAssetPortCollectExample collectExample = new AmAssetPortCollectExample();
        AmAssetPortCollectExample.Criteria criteria = collectExample.createCriteria();
        criteria.andPkAssetEqualTo(pkAsset);
        List<AmAssetPortCollect> amAssetPortCollects = portCollectMapper.selectByExample(collectExample);

        //4.进程信息
        AmAssetProcCollectExample amAssetProcCollectExample = new AmAssetProcCollectExample();
        AmAssetProcCollectExample.Criteria criteria1 = amAssetProcCollectExample.createCriteria();
        criteria1.andPkAssetEqualTo(pkAsset);
        List<AmAssetProcCollect> amAssetProcCollects = procCollectMapper.selectByExample(amAssetProcCollectExample);

        map.put("amAsset",amAsset);
        map.put("extendProp",extendProp);
        map.put("amAssetPortCollects",amAssetPortCollects);
        map.put("amAssetProcCollects",amAssetProcCollects);
        return map;
    }


}

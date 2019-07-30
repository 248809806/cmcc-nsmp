package com.ultrapower.service;

import com.ultrapower.dao.*;
import com.ultrapower.dto.AddAssetDTO;
import com.ultrapower.dto.AmAssetPropDTO;
import com.ultrapower.pojo.*;
import com.ultrapower.utils.PkUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@ContextConfiguration(locations="classpath:applicationContext-mongodb.xml")
public class AmAssetseviceimpl implements AmAssetsevice {

    @Autowired
    MongoTemplate mongoTemplate;

    @Autowired
    AmAssetExtendPropMapper extendPropMapper;

    @Autowired
    AmAssetMapper amAssetMapper;

    @Autowired
    AmAssetTypeMapper amAssetTypeMapper;

    @Autowired
    AmBsProvMapper amBsProvMapper;

    @Autowired
    AmAssetPropMapper amAssetPropMapper;

    /**
     * 获取资产类型
     *
     * @return
     */
    public List<AmAssetType> getAmAssetType() {
        AmAssetTypeExample amAssetTypeExample = new AmAssetTypeExample();
        AmAssetTypeExample.Criteria criteria = amAssetTypeExample.createCriteria();
        Short s = 1;
        criteria.andIsViewEqualTo(s);
        Short s1 = 0;
        criteria.andIsDeletedEqualTo(s1);
        List<AmAssetType> amAssetTypes = amAssetTypeMapper.selectByExample(amAssetTypeExample);
        return amAssetTypes;
    }

    /**
     * 获取资产所属业务系统
     *
     * @return
     */
    public List<AmBsProv> getAmBsProv() {
        AmBsProvExample amBsProvExample = new AmBsProvExample();
        AmBsProvExample.Criteria criteria = amBsProvExample.createCriteria();
        Short s = 0;
        criteria.andIsDeletedEqualTo(s);
        List<AmBsProv> amBsProvs = amBsProvMapper.selectByExample(amBsProvExample);
        return amBsProvs;
    }

    /**
     * 根据ID查询绑定属性的数据
     *
     * @param pkAssetType
     * @return
     */
    public List<AmAssetPropDTO> getAmAssetProplist(String pkAssetType) {
        List<AmAssetPropDTO> AmAssetPropDTO = amAssetPropMapper.getAssetPropByPkAssetType(pkAssetType);
        return AmAssetPropDTO;
    }

    /**
     * 保存资产属性添加列表里的数据
     *
     * @param addAssetDTO
     * @return
     */
    public Map<String, Object> addAsset(AddAssetDTO addAssetDTO) {
        Map<String, Object> map = new HashMap<String, Object>();
        String primaryKey = PkUtils.getPrimaryKey();
        //基本属性列表添加
        try {
            AmAsset asset = addAssetDTO.getAsset();
            asset.setPkAsset(primaryKey);
            asset.setProvCode("HB");
            asset.setVersion("v2.0");
            Short S = 1;
            asset.setAssetState(S);
            asset.setComeFrom(S);
            asset.setForeignId("123456");
            Date date = new Date();
            asset.setFirstFoundTime(date);
            asset.setLastFoundTime(date);
            Short S1 = 555;
            asset.setFirstFoundType(S1);
            asset.setLastFoundType(S1);
            asset.setFirstSyncTime(date);
            asset.setLastFoundTime(date);
            asset.setPkCreator("aa6aa1d77251445c956f1b4504b1e982");
            asset.setCreateTime(date);
            asset.setPkMender("aa6aa1d77251445c956f1b4504b1e982");
            asset.setMendTimeLast(date);
            asset.setPkOnlineUser("aa6aa1d77251445c956f1b4504b1e982");
            asset.setOnlineTime(date);
            asset.setPkOfflineUser("aa6aa1d77251445c956f1b4504b1e982");
            asset.setOfflineTime(date);
            amAssetMapper.insert(asset);

            //扩展属性表添加
            AmAssetExtendProp extendProp = addAssetDTO.getAssetExtendProp();
            extendProp.setPkAsset(primaryKey);
            extendProp.setProvCode("HB");
            extendProp.setVersion("v2.0");
            extendProp.setPublicIp("123.13213.1431");
            extendProp.setPrivateIp("123.13213.1431");
            extendProp.setNatIp("123.13213.1431");
            extendProp.setVirtualIp("123.13213.1431");
            extendProp.setHostIp("123.13213.1431");
            extendProp.setInstallPath("C：/util");
            extendProp.setPkVendor("wode");
            extendProp.setHardwareModel("weode");
            extendProp.setOperatingSystemName("hehe");
            extendProp.setOperatingSystemVersion("'hah");
            extendProp.setDevicename("uhre");
            extendPropMapper.insert(extendProp);

            //绑定属性表添加
            List<AmAssetPropDTO> props = addAssetDTO.getProps();
            for (int i = 0; i < props.size(); i++) {
                AmAssetPropDTO amAssetPropDTO = props.get(i);
                mongoTemplate.insert(amAssetPropDTO);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        map.put("pkAsset",primaryKey);
        map.put("code", 1);
        return map;
    }

    /**
     * 点击添加资产里面的编辑回显数据
     * @param pkAsset
     * @return
     */
    public Map<String, Object> getAssetAndPropValue(String pkAsset) {
        //1.根据资产id，查询资产信息
        AmAsset amAsset = amAssetMapper.selectByPrimaryKey(pkAsset);

        //2.扩展属性
        AmAssetExtendProp extendProp = extendPropMapper.selectByPrimaryKey(pkAsset);

        //3.关联属性
        Query query = new Query();
        query.addCriteria(Criteria.where("pkAsset").is(pkAsset));
        List<AmAssetPropDTO> props = mongoTemplate.find(query, AmAssetPropDTO.class, "props");

        AddAssetDTO dto = new AddAssetDTO();
        dto.setAsset(amAsset);
        dto.setAssetExtendProp(extendProp);
        dto.setProps(props);

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("addAssetDTO", dto);
        return map;
    }
}

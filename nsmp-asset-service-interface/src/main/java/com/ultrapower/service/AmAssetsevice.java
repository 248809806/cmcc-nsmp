package com.ultrapower.service;

import com.ultrapower.dto.AddAssetDTO;
import com.ultrapower.dto.AmAssetPropDTO;
import com.ultrapower.pojo.AmAssetProp;
import com.ultrapower.pojo.AmAssetType;
import com.ultrapower.pojo.AmBsProv;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

public interface AmAssetsevice {

    /**
     * 获取资产类型
     * @return
     */
    List<AmAssetType> getAmAssetType();

    /**
     * 获取资产所属业务系统
     * @return
     */
    List<AmBsProv> getAmBsProv();

    /**
     * 根据ID查询绑定属性的数据
     * @param pkAssetType
     * @return
     */
    List<AmAssetPropDTO> getAmAssetProplist(String pkAssetType);

    /**
     * 保存资产属性添加列表里的数据
     * @param addAssetDTO
     * @return
     */
    Map<String,Object> addAsset(AddAssetDTO addAssetDTO);

    /**
     * 点击添加资产里面的编辑回显数据
     * @param pkAsset
     * @return
     */
    Map<String, Object> getAssetAndPropValue(String pkAsset);
}

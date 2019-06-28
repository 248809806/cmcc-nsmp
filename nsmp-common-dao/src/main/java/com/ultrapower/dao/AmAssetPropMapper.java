package com.ultrapower.dao;

import com.ultrapower.pojo.AmAssetProp;
import com.ultrapower.pojo.AmAssetPropExample;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface AmAssetPropMapper {
    int countByExample(AmAssetPropExample example);

    int deleteByExample(AmAssetPropExample example);

    int deleteByPrimaryKey(String pkAssetProp);

    int insert(AmAssetProp record);

    int insertSelective(AmAssetProp record);

    List<AmAssetProp> selectByExample(AmAssetPropExample example);

    AmAssetProp selectByPrimaryKey(String pkAssetProp);

    int updateByExampleSelective(@Param("record") AmAssetProp record, @Param("example") AmAssetPropExample example);

    int updateByExample(@Param("record") AmAssetProp record, @Param("example") AmAssetPropExample example);

    int updateByPrimaryKeySelective(AmAssetProp record);

    int updateByPrimaryKey(AmAssetProp record);

    List<AmAssetProp> findPropListByAssetTypeId(String id);

    List<AmAssetProp> findPropListByAssetTypeIdAndprop(HashMap<String, String> map);
}
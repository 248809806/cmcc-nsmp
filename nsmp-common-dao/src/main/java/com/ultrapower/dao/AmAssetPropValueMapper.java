package com.ultrapower.dao;

import com.ultrapower.pojo.AmAssetPropValue;
import com.ultrapower.pojo.AmAssetPropValueExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AmAssetPropValueMapper {
    int countByExample(AmAssetPropValueExample example);

    int deleteByExample(AmAssetPropValueExample example);

    int deleteByPrimaryKey(String pkAssetPropValue);

    int insert(AmAssetPropValue record);

    int insertSelective(AmAssetPropValue record);

    List<AmAssetPropValue> selectByExample(AmAssetPropValueExample example);

    AmAssetPropValue selectByPrimaryKey(String pkAssetPropValue);

    int updateByExampleSelective(@Param("record") AmAssetPropValue record, @Param("example") AmAssetPropValueExample example);

    int updateByExample(@Param("record") AmAssetPropValue record, @Param("example") AmAssetPropValueExample example);

    int updateByPrimaryKeySelective(AmAssetPropValue record);

    int updateByPrimaryKey(AmAssetPropValue record);
}
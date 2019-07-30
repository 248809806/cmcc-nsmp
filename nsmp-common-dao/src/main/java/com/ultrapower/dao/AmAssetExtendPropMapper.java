package com.ultrapower.dao;

import com.ultrapower.pojo.AmAssetExtendProp;
import com.ultrapower.pojo.AmAssetExtendPropExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AmAssetExtendPropMapper {
    int countByExample(AmAssetExtendPropExample example);

    int deleteByExample(AmAssetExtendPropExample example);

    int deleteByPrimaryKey(String pkAsset);

    int insert(AmAssetExtendProp record);

    int insertSelective(AmAssetExtendProp record);

    List<AmAssetExtendProp> selectByExample(AmAssetExtendPropExample example);

    AmAssetExtendProp selectByPrimaryKey(String pkAsset);

    int updateByExampleSelective(@Param("record") AmAssetExtendProp record, @Param("example") AmAssetExtendPropExample example);

    int updateByExample(@Param("record") AmAssetExtendProp record, @Param("example") AmAssetExtendPropExample example);

    int updateByPrimaryKeySelective(AmAssetExtendProp record);

    int updateByPrimaryKey(AmAssetExtendProp record);
}
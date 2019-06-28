package com.ultrapower.dao;

import com.ultrapower.pojo.AmAssetLoginProp;
import com.ultrapower.pojo.AmAssetLoginPropExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AmAssetLoginPropMapper {
    int countByExample(AmAssetLoginPropExample example);

    int deleteByExample(AmAssetLoginPropExample example);

    int insert(AmAssetLoginProp record);

    int insertSelective(AmAssetLoginProp record);

    List<AmAssetLoginProp> selectByExample(AmAssetLoginPropExample example);

    int updateByExampleSelective(@Param("record") AmAssetLoginProp record, @Param("example") AmAssetLoginPropExample example);

    int updateByExample(@Param("record") AmAssetLoginProp record, @Param("example") AmAssetLoginPropExample example);
}
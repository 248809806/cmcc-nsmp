package com.ultrapower.dao;

import com.ultrapower.pojo.AmAssetExtendProp;
import com.ultrapower.pojo.AmAssetExtendPropExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AmAssetExtendPropMapper {
    int countByExample(AmAssetExtendPropExample example);

    int deleteByExample(AmAssetExtendPropExample example);

    int insert(AmAssetExtendProp record);

    int insertSelective(AmAssetExtendProp record);

    List<AmAssetExtendProp> selectByExampleWithBLOBs(AmAssetExtendPropExample example);

    List<AmAssetExtendProp> selectByExample(AmAssetExtendPropExample example);

    int updateByExampleSelective(@Param("record") AmAssetExtendProp record, @Param("example") AmAssetExtendPropExample example);

    int updateByExampleWithBLOBs(@Param("record") AmAssetExtendProp record, @Param("example") AmAssetExtendPropExample example);

    int updateByExample(@Param("record") AmAssetExtendProp record, @Param("example") AmAssetExtendPropExample example);
}
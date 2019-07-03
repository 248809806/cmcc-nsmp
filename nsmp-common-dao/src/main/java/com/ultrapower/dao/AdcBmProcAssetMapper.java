package com.ultrapower.dao;

import com.ultrapower.pojo.AdcBmProcAsset;
import com.ultrapower.pojo.AdcBmProcAssetExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdcBmProcAssetMapper {
    int countByExample(AdcBmProcAssetExample example);

    int deleteByExample(AdcBmProcAssetExample example);

    int insert(AdcBmProcAsset record);

    int insertSelective(AdcBmProcAsset record);

    List<AdcBmProcAsset> selectByExample(AdcBmProcAssetExample example);

    int updateByExampleSelective(@Param("record") AdcBmProcAsset record, @Param("example") AdcBmProcAssetExample example);

    int updateByExample(@Param("record") AdcBmProcAsset record, @Param("example") AdcBmProcAssetExample example);
}
package com.ultrapower.dao;

import com.ultrapower.pojo.AdcBmSrvAsset;
import com.ultrapower.pojo.AdcBmSrvAssetExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdcBmSrvAssetMapper {
    int countByExample(AdcBmSrvAssetExample example);

    int deleteByExample(AdcBmSrvAssetExample example);

    int insert(AdcBmSrvAsset record);

    int insertSelective(AdcBmSrvAsset record);

    List<AdcBmSrvAsset> selectByExample(AdcBmSrvAssetExample example);

    int updateByExampleSelective(@Param("record") AdcBmSrvAsset record, @Param("example") AdcBmSrvAssetExample example);

    int updateByExample(@Param("record") AdcBmSrvAsset record, @Param("example") AdcBmSrvAssetExample example);
}
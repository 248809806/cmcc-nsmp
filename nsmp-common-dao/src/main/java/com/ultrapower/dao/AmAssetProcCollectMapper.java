package com.ultrapower.dao;

import com.ultrapower.pojo.AmAssetProcCollect;
import com.ultrapower.pojo.AmAssetProcCollectExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AmAssetProcCollectMapper {
    int countByExample(AmAssetProcCollectExample example);

    int deleteByExample(AmAssetProcCollectExample example);

    int deleteByPrimaryKey(String pkAssetProcCollect);

    int insert(AmAssetProcCollect record);

    int insertSelective(AmAssetProcCollect record);

    List<AmAssetProcCollect> selectByExample(AmAssetProcCollectExample example);

    AmAssetProcCollect selectByPrimaryKey(String pkAssetProcCollect);

    int updateByExampleSelective(@Param("record") AmAssetProcCollect record, @Param("example") AmAssetProcCollectExample example);

    int updateByExample(@Param("record") AmAssetProcCollect record, @Param("example") AmAssetProcCollectExample example);

    int updateByPrimaryKeySelective(AmAssetProcCollect record);

    int updateByPrimaryKey(AmAssetProcCollect record);
}
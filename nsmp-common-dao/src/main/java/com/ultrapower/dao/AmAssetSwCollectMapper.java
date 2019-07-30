package com.ultrapower.dao;

import com.ultrapower.pojo.AmAssetSwCollect;
import com.ultrapower.pojo.AmAssetSwCollectExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AmAssetSwCollectMapper {
    int countByExample(AmAssetSwCollectExample example);

    int deleteByExample(AmAssetSwCollectExample example);

    int deleteByPrimaryKey(String pkAssetSwCollect);

    int insert(AmAssetSwCollect record);

    int insertSelective(AmAssetSwCollect record);

    List<AmAssetSwCollect> selectByExample(AmAssetSwCollectExample example);

    AmAssetSwCollect selectByPrimaryKey(String pkAssetSwCollect);

    int updateByExampleSelective(@Param("record") AmAssetSwCollect record, @Param("example") AmAssetSwCollectExample example);

    int updateByExample(@Param("record") AmAssetSwCollect record, @Param("example") AmAssetSwCollectExample example);

    int updateByPrimaryKeySelective(AmAssetSwCollect record);

    int updateByPrimaryKey(AmAssetSwCollect record);
}
package com.ultrapower.dao;

import com.ultrapower.pojo.AmAssetPortCollect;
import com.ultrapower.pojo.AmAssetPortCollectExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AmAssetPortCollectMapper {
    int countByExample(AmAssetPortCollectExample example);

    int deleteByExample(AmAssetPortCollectExample example);

    int deleteByPrimaryKey(String pkAssetPortCollect);

    int insert(AmAssetPortCollect record);

    int insertSelective(AmAssetPortCollect record);

    List<AmAssetPortCollect> selectByExample(AmAssetPortCollectExample example);

    AmAssetPortCollect selectByPrimaryKey(String pkAssetPortCollect);

    int updateByExampleSelective(@Param("record") AmAssetPortCollect record, @Param("example") AmAssetPortCollectExample example);

    int updateByExample(@Param("record") AmAssetPortCollect record, @Param("example") AmAssetPortCollectExample example);

    int updateByPrimaryKeySelective(AmAssetPortCollect record);

    int updateByPrimaryKey(AmAssetPortCollect record);
}
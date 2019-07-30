package com.ultrapower.dao;

import com.ultrapower.pojo.AmAssetStartupCollect;
import com.ultrapower.pojo.AmAssetStartupCollectExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AmAssetStartupCollectMapper {
    int countByExample(AmAssetStartupCollectExample example);

    int deleteByExample(AmAssetStartupCollectExample example);

    int deleteByPrimaryKey(String pkAssetStartupCollect);

    int insert(AmAssetStartupCollect record);

    int insertSelective(AmAssetStartupCollect record);

    List<AmAssetStartupCollect> selectByExample(AmAssetStartupCollectExample example);

    AmAssetStartupCollect selectByPrimaryKey(String pkAssetStartupCollect);

    int updateByExampleSelective(@Param("record") AmAssetStartupCollect record, @Param("example") AmAssetStartupCollectExample example);

    int updateByExample(@Param("record") AmAssetStartupCollect record, @Param("example") AmAssetStartupCollectExample example);

    int updateByPrimaryKeySelective(AmAssetStartupCollect record);

    int updateByPrimaryKey(AmAssetStartupCollect record);
}
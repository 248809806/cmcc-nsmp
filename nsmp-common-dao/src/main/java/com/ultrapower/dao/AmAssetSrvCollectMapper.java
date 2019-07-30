package com.ultrapower.dao;

import com.ultrapower.pojo.AmAssetSrvCollect;
import com.ultrapower.pojo.AmAssetSrvCollectExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AmAssetSrvCollectMapper {
    int countByExample(AmAssetSrvCollectExample example);

    int deleteByExample(AmAssetSrvCollectExample example);

    int deleteByPrimaryKey(String pkAssetSrvCollect);

    int insert(AmAssetSrvCollect record);

    int insertSelective(AmAssetSrvCollect record);

    List<AmAssetSrvCollect> selectByExample(AmAssetSrvCollectExample example);

    AmAssetSrvCollect selectByPrimaryKey(String pkAssetSrvCollect);

    int updateByExampleSelective(@Param("record") AmAssetSrvCollect record, @Param("example") AmAssetSrvCollectExample example);

    int updateByExample(@Param("record") AmAssetSrvCollect record, @Param("example") AmAssetSrvCollectExample example);

    int updateByPrimaryKeySelective(AmAssetSrvCollect record);

    int updateByPrimaryKey(AmAssetSrvCollect record);
}
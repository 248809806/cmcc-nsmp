package com.ultrapower.dao;

import com.ultrapower.pojo.AmAssetPatchCollect;
import com.ultrapower.pojo.AmAssetPatchCollectExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AmAssetPatchCollectMapper {
    int countByExample(AmAssetPatchCollectExample example);

    int deleteByExample(AmAssetPatchCollectExample example);

    int deleteByPrimaryKey(String pkAssetPatchCollect);

    int insert(AmAssetPatchCollect record);

    int insertSelective(AmAssetPatchCollect record);

    List<AmAssetPatchCollect> selectByExample(AmAssetPatchCollectExample example);

    AmAssetPatchCollect selectByPrimaryKey(String pkAssetPatchCollect);

    int updateByExampleSelective(@Param("record") AmAssetPatchCollect record, @Param("example") AmAssetPatchCollectExample example);

    int updateByExample(@Param("record") AmAssetPatchCollect record, @Param("example") AmAssetPatchCollectExample example);

    int updateByPrimaryKeySelective(AmAssetPatchCollect record);

    int updateByPrimaryKey(AmAssetPatchCollect record);
}
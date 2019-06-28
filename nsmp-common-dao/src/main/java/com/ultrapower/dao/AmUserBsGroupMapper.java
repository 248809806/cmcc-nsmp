package com.ultrapower.dao;

import com.ultrapower.pojo.AmUserBsGroup;
import com.ultrapower.pojo.AmUserBsGroupExample;
import com.ultrapower.pojo.AmUserBsGroupKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AmUserBsGroupMapper {
    int countByExample(AmUserBsGroupExample example);

    int deleteByExample(AmUserBsGroupExample example);

    int deleteByPrimaryKey(AmUserBsGroupKey key);

    int insert(AmUserBsGroup record);

    int insertSelective(AmUserBsGroup record);

    List<AmUserBsGroup> selectByExample(AmUserBsGroupExample example);

    AmUserBsGroup selectByPrimaryKey(AmUserBsGroupKey key);

    int updateByExampleSelective(@Param("record") AmUserBsGroup record, @Param("example") AmUserBsGroupExample example);

    int updateByExample(@Param("record") AmUserBsGroup record, @Param("example") AmUserBsGroupExample example);

    int updateByPrimaryKeySelective(AmUserBsGroup record);

    int updateByPrimaryKey(AmUserBsGroup record);
}
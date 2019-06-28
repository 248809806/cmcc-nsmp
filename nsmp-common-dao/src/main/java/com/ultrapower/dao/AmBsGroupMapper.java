package com.ultrapower.dao;

import com.ultrapower.dto.BsGroupVO;
import com.ultrapower.dto.Groupfromdto;
import com.ultrapower.pojo.AmBsGroup;
import com.ultrapower.pojo.AmBsGroupExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AmBsGroupMapper {
    int countByExample(AmBsGroupExample example);

    int deleteByExample(AmBsGroupExample example);

    int deleteByPrimaryKey(String pkBsGroup);

    int insert(AmBsGroup record);

    int insertSelective(AmBsGroup record);

    List<AmBsGroup> selectByExample(AmBsGroupExample example);

    AmBsGroup selectByPrimaryKey(String pkBsGroup);

    int updateByExampleSelective(@Param("record") AmBsGroup record, @Param("example") AmBsGroupExample example);

    int updateByExample(@Param("record") AmBsGroup record, @Param("example") AmBsGroupExample example);

    int updateByPrimaryKeySelective(AmBsGroup record);

    int updateByPrimaryKey(AmBsGroup record);

    List<BsGroupVO>  initBsGroupTree();

    List<Groupfromdto> grouplistform(String id);
}
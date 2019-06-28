package com.ultrapower.dao;

import com.ultrapower.dto.BsGroupMgAsset;
import com.ultrapower.dto.GroupMgAssetQueryVO;
import com.ultrapower.dto.ProvDTO;
import com.ultrapower.pojo.AmBsGroupProv;
import com.ultrapower.pojo.AmBsGroupProvExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AmBsGroupProvMapper {
    int countByExample(AmBsGroupProvExample example);

    int deleteByExample(AmBsGroupProvExample example);

    int deleteByPrimaryKey(String pkBsGroupProv);

    int insert(AmBsGroupProv record);

    int insertSelective(AmBsGroupProv record);

    List<AmBsGroupProv> selectByExample(AmBsGroupProvExample example);

    AmBsGroupProv selectByPrimaryKey(String pkBsGroupProv);

    int updateByExampleSelective(@Param("record") AmBsGroupProv record, @Param("example") AmBsGroupProvExample example);

    int updateByExample(@Param("record") AmBsGroupProv record, @Param("example") AmBsGroupProvExample example);

    int updateByPrimaryKeySelective(AmBsGroupProv record);

    int updateByPrimaryKey(AmBsGroupProv record);

    List<ProvDTO> selectProvByGroupId(String groupId);

    List<BsGroupMgAsset> selectBsGroupMgAsset(GroupMgAssetQueryVO queryVO);
}
package com.ultrapower.dao;

import com.ultrapower.pojo.AdcBmSrv;
import com.ultrapower.pojo.AdcBmSrvExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdcBmSrvMapper {
    int countByExample(AdcBmSrvExample example);

    int deleteByExample(AdcBmSrvExample example);

    int insert(AdcBmSrv record);

    int insertSelective(AdcBmSrv record);

    List<AdcBmSrv> selectByExample(AdcBmSrvExample example);

    int updateByExampleSelective(@Param("record") AdcBmSrv record, @Param("example") AdcBmSrvExample example);

    int updateByExample(@Param("record") AdcBmSrv record, @Param("example") AdcBmSrvExample example);
}
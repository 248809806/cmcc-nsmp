package com.ultrapower.dao;

import com.ultrapower.pojo.AdcBmProc;
import com.ultrapower.pojo.AdcBmProcExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdcBmProcMapper {
    int countByExample(AdcBmProcExample example);

    int deleteByExample(AdcBmProcExample example);

    int insert(AdcBmProc record);

    int insertSelective(AdcBmProc record);

    List<AdcBmProc> selectByExample(AdcBmProcExample example);

    int updateByExampleSelective(@Param("record") AdcBmProc record, @Param("example") AdcBmProcExample example);

    int updateByExample(@Param("record") AdcBmProc record, @Param("example") AdcBmProcExample example);
}
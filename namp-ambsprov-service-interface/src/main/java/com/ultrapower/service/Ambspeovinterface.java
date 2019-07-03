package com.ultrapower.service;

import com.ultrapower.dto.Abcbmporp;
import com.ultrapower.dto.AdcPortBmReqVO;
import com.ultrapower.dto.Nodoea;

import java.util.List;
import java.util.Map;

public interface Ambspeovinterface {

    /**
     * 省份二级节点
     * @return
     */
    List<Nodoea> initambapeop();

    /**
     * 端口基准列表
     * @return
     */
    Map<String,Object> abcbmporplist();

    /**
     *添加端口基准里的from表单
     * @return
     */
    Map<String,Object> Amassetform();

    /**
     * 添加端口基准里的数据保存到数据库
     * @param portBmReqVO
     * @return
     */
    Map<String,Object> addAdcBmPort(AdcPortBmReqVO portBmReqVO);
}

package com.ultrapower.web;

import com.ultrapower.dto.Abcbmporp;
import com.ultrapower.dto.AdcPortBmReqVO;
import com.ultrapower.dto.Nodoea;
import com.ultrapower.service.Ambspeovinterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AmbspeovControler {

    @Autowired
    Ambspeovinterface ambspeovinterface;

    /**
     * 查询所有省份资产数据树节点
     * @return
     */
    @GetMapping("/initambapeop")
    public List<Nodoea> initambapeop(){
        return ambspeovinterface.initambapeop();
    }

    /**
     * 端口基准列表
     * @return
     */
    @GetMapping("/abcbmporplist")
    public Map<String,Object> abcbmporplist(){
        //端口基准列表
        Map<String,Object> map = new HashMap<String, Object>();
        Map<String, Object> abcbmporplist = ambspeovinterface.abcbmporplist();

        return abcbmporplist;
    }

    /**
     *添加端口基准里的from表单
     * @return
     */
    @GetMapping("/Amassetform")
    public Map<String, Object> Amassetform(){
        Map<String, Object> amassetform = ambspeovinterface.Amassetform();
        return amassetform;
    }

    /**
     * 添加端口基准里的数据保存到数据库
     * @param portBmReqVO
     * @return
     */
    @PostMapping("/addAdcBmPort")
    public Map<String,Object> addAdcBmPort(@RequestBody AdcPortBmReqVO portBmReqVO){
        Map<String, Object> map = ambspeovinterface.addAdcBmPort(portBmReqVO);
        return map;
    }
}

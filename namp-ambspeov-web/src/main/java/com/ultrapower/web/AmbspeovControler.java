package com.ultrapower.web;

import com.ultrapower.dto.Nodoea;
import com.ultrapower.service.Ambspeovinterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}

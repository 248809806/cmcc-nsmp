package com.ultrapower.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class echarts {

    @GetMapping("/myecharts")
    public Map<String,Object> test1(){
        Map<String,Object> map = new HashMap<>();
        List<String> list = Arrays.asList("Mon","Tue","Wed","Thu","Fri");
        List<String> list1 = Arrays.asList("890","20","980","30","990");
        map.put("list",list);
        map.put("list1",list1);
        return map;
    }

    @GetMapping("/test2")
    public Map<String,Object> test2(){
        Map<String,Object> map = new HashMap<>();

        List<String> list = Arrays.asList("卢本伟","PDD","大司马","骚男");
        Map<String,Object> map1 = new HashMap<>();
        map1.put("value",510);
        map1.put("name","卢本伟");

        Map<String,Object> map2 = new HashMap<>();
        map2.put("value",634);
        map2.put("name","PDD");

        Map<String,Object> map3 = new HashMap<>();
        map3.put("value",735);
        map3.put("name","大司马");

        Map<String,Object> map4 = new HashMap<>();
        map4.put("value",510);
        map4.put("name","骚男");

        List<Map<String,Object>> mapList = Arrays.asList(map1,map2,map3,map4);

        map.put("list1",list);
        map.put("mapList",mapList);
        map.put("xixi",(510+634+735+510));

        return map;
    }
}

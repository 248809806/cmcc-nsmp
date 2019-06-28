package com.ultrapower.utils;

import java.util.HashMap;
import java.util.Map;

public class DatetypetoString {

    //N（umber）为数字类型，D（ate）为日期，
    // S（tring）为字符，E（num）为枚举，
    // L（ist）为列表类型，P（assword）为密码
    public String datetypetostrinf(String dataType){
        Map<String,String> map = new HashMap<String, String>();
        map.put("N","数字类型");
        map.put("D","日期类型");
        map.put("S","字符类型");
        map.put("E","枚举类型");
        map.put("L","列表类型");
        map.put("P","密码");
        return map.get(dataType);
    }

    public String collectTypeToString(String collectType){
        //001
        //人工录入、登录采集、远程扫描
        String[] split = collectType.split("");
        String one = split[0].equals("0")?"":"人工录入  ";
        String two = split[1].equals("0")?"":"登录采集  ";
        String three = split[2].equals("0")?"":"远程扫描  ";

        return one+two+three;
    }
}

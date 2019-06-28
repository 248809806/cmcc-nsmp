package com.ultrapower.dto;

import com.ultrapower.pojo.AmUser;

import java.io.Serializable;

public class AmUserRueryVO implements Serializable {

    public AmUserRueryVO() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public AmUser getUser() {
        return user;
    }

    public void setUser(AmUser user) {
        this.user = user;
    }

    public AmUserRueryVO(Integer code, String msg, AmUser user) {


        this.code = code;
        this.msg = msg;
        this.user = user;
    }

    private Integer code;
    private String msg;
    private AmUser user;
}

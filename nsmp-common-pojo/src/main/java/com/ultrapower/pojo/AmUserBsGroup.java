package com.ultrapower.pojo;

import java.util.Date;

public class AmUserBsGroup extends AmUserBsGroupKey {
    private String pkCreator;

    private Date createTime;

    public String getPkCreator() {
        return pkCreator;
    }

    public void setPkCreator(String pkCreator) {
        this.pkCreator = pkCreator == null ? null : pkCreator.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
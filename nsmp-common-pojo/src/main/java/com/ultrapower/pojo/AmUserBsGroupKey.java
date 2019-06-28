package com.ultrapower.pojo;

public class AmUserBsGroupKey {
    private String pkNsmpUser;

    private String pkBsGroup;

    public String getPkNsmpUser() {
        return pkNsmpUser;
    }

    public void setPkNsmpUser(String pkNsmpUser) {
        this.pkNsmpUser = pkNsmpUser == null ? null : pkNsmpUser.trim();
    }

    public String getPkBsGroup() {
        return pkBsGroup;
    }

    public void setPkBsGroup(String pkBsGroup) {
        this.pkBsGroup = pkBsGroup == null ? null : pkBsGroup.trim();
    }
}
package com.ultrapower.dto;

import com.ultrapower.pojo.AmBsGroup;

public class AddGroupDTO extends AmBsGroup {

    private String bsProvIds;

    public String getBsProvIds() {
        return bsProvIds;
    }

    public void setBsProvIds(String bsProvIds) {
        this.bsProvIds = bsProvIds;
    }
}

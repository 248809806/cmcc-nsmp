package com.ultrapower.dto;

import java.io.Serializable;

public class Amassetdto implements Serializable {
    private String PK_ASSET;
    private String PROV_NAME;
    private String ASSET_NAME;
    private String ASSET_IP;
    private String TYPE_NAME;
    private String BS_NAME;
    private Integer COME_FROM;
    private Integer ASSET_STATE;

    @Override
    public String toString() {
        return "Amassetdto{" +
                "PK_ASSET='" + PK_ASSET + '\'' +
                ", PROV_NAME='" + PROV_NAME + '\'' +
                ", ASSET_NAME='" + ASSET_NAME + '\'' +
                ", ASSET_IP='" + ASSET_IP + '\'' +
                ", TYPE_NAME='" + TYPE_NAME + '\'' +
                ", BS_NAME='" + BS_NAME + '\'' +
                ", COME_FROM=" + COME_FROM +
                ", ASSET_STATE=" + ASSET_STATE +
                '}';
    }

    public String getPK_ASSET() {
        return PK_ASSET;
    }

    public void setPK_ASSET(String PK_ASSET) {
        this.PK_ASSET = PK_ASSET;
    }

    public String getPROV_NAME() {
        return PROV_NAME;
    }

    public void setPROV_NAME(String PROV_NAME) {
        this.PROV_NAME = PROV_NAME;
    }

    public String getASSET_NAME() {
        return ASSET_NAME;
    }

    public void setASSET_NAME(String ASSET_NAME) {
        this.ASSET_NAME = ASSET_NAME;
    }

    public String getASSET_IP() {
        return ASSET_IP;
    }

    public void setASSET_IP(String ASSET_IP) {
        this.ASSET_IP = ASSET_IP;
    }

    public String getTYPE_NAME() {
        return TYPE_NAME;
    }

    public void setTYPE_NAME(String TYPE_NAME) {
        this.TYPE_NAME = TYPE_NAME;
    }

    public String getBS_NAME() {
        return BS_NAME;
    }

    public void setBS_NAME(String BS_NAME) {
        this.BS_NAME = BS_NAME;
    }

    public Integer getCOME_FROM() {
        return COME_FROM;
    }

    public void setCOME_FROM(Integer COME_FROM) {
        this.COME_FROM = COME_FROM;
    }

    public Integer getASSET_STATE() {
        return ASSET_STATE;
    }

    public void setASSET_STATE(Integer ASSET_STATE) {
        this.ASSET_STATE = ASSET_STATE;
    }
}

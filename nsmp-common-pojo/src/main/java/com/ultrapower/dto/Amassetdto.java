package com.ultrapower.dto;

import java.io.Serializable;

public class Amassetdto implements Serializable {
    private String pkAsset;
    private String assetName;
    private String assetIp;
    private String provName;
    private String bsName;
    private String typeName;
    private String comeFrom;
    private String assetState;

    @Override
    public String toString() {
        return "Amassetdto{" +
                "pkAsset='" + pkAsset + '\'' +
                ", assetName='" + assetName + '\'' +
                ", assetIp='" + assetIp + '\'' +
                ", provName='" + provName + '\'' +
                ", bsName='" + bsName + '\'' +
                ", typeName='" + typeName + '\'' +
                ", comeFrom='" + comeFrom + '\'' +
                ", assetState='" + assetState + '\'' +
                '}';
    }

    public Amassetdto() {
    }

    public Amassetdto(String pkAsset, String assetName, String assetIp, String provName, String bsName, String typeName, String comeFrom, String assetState) {

        this.pkAsset = pkAsset;
        this.assetName = assetName;
        this.assetIp = assetIp;
        this.provName = provName;
        this.bsName = bsName;
        this.typeName = typeName;
        this.comeFrom = comeFrom;
        this.assetState = assetState;
    }

    public String getPkAsset() {

        return pkAsset;
    }

    public void setPkAsset(String pkAsset) {
        this.pkAsset = pkAsset;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getAssetIp() {
        return assetIp;
    }

    public void setAssetIp(String assetIp) {
        this.assetIp = assetIp;
    }

    public String getProvName() {
        return provName;
    }

    public void setProvName(String provName) {
        this.provName = provName;
    }

    public String getBsName() {
        return bsName;
    }

    public void setBsName(String bsName) {
        this.bsName = bsName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getComeFrom() {
        return comeFrom;
    }

    public void setComeFrom(String comeFrom) {
        this.comeFrom = comeFrom;
    }

    public String getAssetState() {
        return assetState;
    }

    public void setAssetState(String assetState) {
        this.assetState = assetState;
    }
}
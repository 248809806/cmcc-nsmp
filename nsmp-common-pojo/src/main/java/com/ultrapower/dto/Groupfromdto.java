package com.ultrapower.dto;

public class Groupfromdto {

    private String provName;

    private String bsName;

    private Short bsSrc;

    private int assetsum;

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

    public Short getBsSrc() {
        return bsSrc;
    }

    public void setBsSrc(Short bsSrc) {
        this.bsSrc = bsSrc;
    }

    public int getAssetSum() {
        return assetsum;
    }

    public void setAssetSum(int assetSum) {
        this.assetsum = assetSum;
    }

    public Groupfromdto() {

    }

    public Groupfromdto(String provName, String bsName, Short bsSrc, int assetSum) {

        this.provName = provName;
        this.bsName = bsName;
        this.bsSrc = bsSrc;
        this.assetsum = assetSum;
    }
}

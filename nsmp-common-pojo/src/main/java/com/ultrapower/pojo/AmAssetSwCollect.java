package com.ultrapower.pojo;

import java.io.Serializable;

public class AmAssetSwCollect implements Serializable {
    private String pkAssetSwCollect;

    private String pkAsset;

    private String provCode;

    private String version;

    private String swName;

    private String swVer;

    private Short runState;

    private String swDesc;

    private static final long serialVersionUID = 1L;

    public String getPkAssetSwCollect() {
        return pkAssetSwCollect;
    }

    public void setPkAssetSwCollect(String pkAssetSwCollect) {
        this.pkAssetSwCollect = pkAssetSwCollect == null ? null : pkAssetSwCollect.trim();
    }

    public String getPkAsset() {
        return pkAsset;
    }

    public void setPkAsset(String pkAsset) {
        this.pkAsset = pkAsset == null ? null : pkAsset.trim();
    }

    public String getProvCode() {
        return provCode;
    }

    public void setProvCode(String provCode) {
        this.provCode = provCode == null ? null : provCode.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getSwName() {
        return swName;
    }

    public void setSwName(String swName) {
        this.swName = swName == null ? null : swName.trim();
    }

    public String getSwVer() {
        return swVer;
    }

    public void setSwVer(String swVer) {
        this.swVer = swVer == null ? null : swVer.trim();
    }

    public Short getRunState() {
        return runState;
    }

    public void setRunState(Short runState) {
        this.runState = runState;
    }

    public String getSwDesc() {
        return swDesc;
    }

    public void setSwDesc(String swDesc) {
        this.swDesc = swDesc == null ? null : swDesc.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pkAssetSwCollect=").append(pkAssetSwCollect);
        sb.append(", pkAsset=").append(pkAsset);
        sb.append(", provCode=").append(provCode);
        sb.append(", version=").append(version);
        sb.append(", swName=").append(swName);
        sb.append(", swVer=").append(swVer);
        sb.append(", runState=").append(runState);
        sb.append(", swDesc=").append(swDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package com.ultrapower.pojo;

import java.io.Serializable;

public class AmAssetStartupCollect implements Serializable {
    private String pkAssetStartupCollect;

    private String pkAsset;

    private String provCode;

    private String version;

    private String startName;

    private String startFile;

    private String srvType;

    private String startType;

    private String srvDesc;

    private String runState;

    private String runLevel;

    private static final long serialVersionUID = 1L;

    public String getPkAssetStartupCollect() {
        return pkAssetStartupCollect;
    }

    public void setPkAssetStartupCollect(String pkAssetStartupCollect) {
        this.pkAssetStartupCollect = pkAssetStartupCollect == null ? null : pkAssetStartupCollect.trim();
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

    public String getStartName() {
        return startName;
    }

    public void setStartName(String startName) {
        this.startName = startName == null ? null : startName.trim();
    }

    public String getStartFile() {
        return startFile;
    }

    public void setStartFile(String startFile) {
        this.startFile = startFile == null ? null : startFile.trim();
    }

    public String getSrvType() {
        return srvType;
    }

    public void setSrvType(String srvType) {
        this.srvType = srvType == null ? null : srvType.trim();
    }

    public String getStartType() {
        return startType;
    }

    public void setStartType(String startType) {
        this.startType = startType == null ? null : startType.trim();
    }

    public String getSrvDesc() {
        return srvDesc;
    }

    public void setSrvDesc(String srvDesc) {
        this.srvDesc = srvDesc == null ? null : srvDesc.trim();
    }

    public String getRunState() {
        return runState;
    }

    public void setRunState(String runState) {
        this.runState = runState == null ? null : runState.trim();
    }

    public String getRunLevel() {
        return runLevel;
    }

    public void setRunLevel(String runLevel) {
        this.runLevel = runLevel == null ? null : runLevel.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pkAssetStartupCollect=").append(pkAssetStartupCollect);
        sb.append(", pkAsset=").append(pkAsset);
        sb.append(", provCode=").append(provCode);
        sb.append(", version=").append(version);
        sb.append(", startName=").append(startName);
        sb.append(", startFile=").append(startFile);
        sb.append(", srvType=").append(srvType);
        sb.append(", startType=").append(startType);
        sb.append(", srvDesc=").append(srvDesc);
        sb.append(", runState=").append(runState);
        sb.append(", runLevel=").append(runLevel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
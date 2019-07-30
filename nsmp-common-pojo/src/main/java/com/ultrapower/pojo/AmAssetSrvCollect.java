package com.ultrapower.pojo;

import java.io.Serializable;

public class AmAssetSrvCollect implements Serializable {
    private String pkAssetSrvCollect;

    private String pkAsset;

    private String provCode;

    private String version;

    private String srvName;

    private String srvType;

    private Integer srvState;

    private String startFile;

    private String pid;

    private String srvDesc;

    private static final long serialVersionUID = 1L;

    public String getPkAssetSrvCollect() {
        return pkAssetSrvCollect;
    }

    public void setPkAssetSrvCollect(String pkAssetSrvCollect) {
        this.pkAssetSrvCollect = pkAssetSrvCollect == null ? null : pkAssetSrvCollect.trim();
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

    public String getSrvName() {
        return srvName;
    }

    public void setSrvName(String srvName) {
        this.srvName = srvName == null ? null : srvName.trim();
    }

    public String getSrvType() {
        return srvType;
    }

    public void setSrvType(String srvType) {
        this.srvType = srvType == null ? null : srvType.trim();
    }

    public Integer getSrvState() {
        return srvState;
    }

    public void setSrvState(Integer srvState) {
        this.srvState = srvState;
    }

    public String getStartFile() {
        return startFile;
    }

    public void setStartFile(String startFile) {
        this.startFile = startFile == null ? null : startFile.trim();
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getSrvDesc() {
        return srvDesc;
    }

    public void setSrvDesc(String srvDesc) {
        this.srvDesc = srvDesc == null ? null : srvDesc.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pkAssetSrvCollect=").append(pkAssetSrvCollect);
        sb.append(", pkAsset=").append(pkAsset);
        sb.append(", provCode=").append(provCode);
        sb.append(", version=").append(version);
        sb.append(", srvName=").append(srvName);
        sb.append(", srvType=").append(srvType);
        sb.append(", srvState=").append(srvState);
        sb.append(", startFile=").append(startFile);
        sb.append(", pid=").append(pid);
        sb.append(", srvDesc=").append(srvDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package com.ultrapower.pojo;

import java.io.Serializable;

public class AdcBmProcAsset implements Serializable {
    private String pkBmProcAsset;

    private String pkBmProc;

    private String pkAsset;

    private String version;

    private String provCode;

    private static final long serialVersionUID = 1L;

    public String getPkBmProcAsset() {
        return pkBmProcAsset;
    }

    public void setPkBmProcAsset(String pkBmProcAsset) {
        this.pkBmProcAsset = pkBmProcAsset == null ? null : pkBmProcAsset.trim();
    }

    public String getPkBmProc() {
        return pkBmProc;
    }

    public void setPkBmProc(String pkBmProc) {
        this.pkBmProc = pkBmProc == null ? null : pkBmProc.trim();
    }

    public String getPkAsset() {
        return pkAsset;
    }

    public void setPkAsset(String pkAsset) {
        this.pkAsset = pkAsset == null ? null : pkAsset.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getProvCode() {
        return provCode;
    }

    public void setProvCode(String provCode) {
        this.provCode = provCode == null ? null : provCode.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pkBmProcAsset=").append(pkBmProcAsset);
        sb.append(", pkBmProc=").append(pkBmProc);
        sb.append(", pkAsset=").append(pkAsset);
        sb.append(", version=").append(version);
        sb.append(", provCode=").append(provCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
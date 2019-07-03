package com.ultrapower.pojo;

import java.io.Serializable;

public class AdcBmSrvAsset implements Serializable {
    private String pkBmSrvAsset;

    private String pkBmSrv;

    private String pkAsset;

    private String version;

    private String provCode;

    private static final long serialVersionUID = 1L;

    public String getPkBmSrvAsset() {
        return pkBmSrvAsset;
    }

    public void setPkBmSrvAsset(String pkBmSrvAsset) {
        this.pkBmSrvAsset = pkBmSrvAsset == null ? null : pkBmSrvAsset.trim();
    }

    public String getPkBmSrv() {
        return pkBmSrv;
    }

    public void setPkBmSrv(String pkBmSrv) {
        this.pkBmSrv = pkBmSrv == null ? null : pkBmSrv.trim();
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
        sb.append(", pkBmSrvAsset=").append(pkBmSrvAsset);
        sb.append(", pkBmSrv=").append(pkBmSrv);
        sb.append(", pkAsset=").append(pkAsset);
        sb.append(", version=").append(version);
        sb.append(", provCode=").append(provCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
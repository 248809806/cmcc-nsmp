package com.ultrapower.pojo;

import java.io.Serializable;

public class AmAssetPatchCollect implements Serializable {
    private String pkAssetPatchCollect;

    private String pkAsset;

    private String provCode;

    private String version;

    private String patchCode;

    private String original;

    private static final long serialVersionUID = 1L;

    public String getPkAssetPatchCollect() {
        return pkAssetPatchCollect;
    }

    public void setPkAssetPatchCollect(String pkAssetPatchCollect) {
        this.pkAssetPatchCollect = pkAssetPatchCollect == null ? null : pkAssetPatchCollect.trim();
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

    public String getPatchCode() {
        return patchCode;
    }

    public void setPatchCode(String patchCode) {
        this.patchCode = patchCode == null ? null : patchCode.trim();
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original == null ? null : original.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pkAssetPatchCollect=").append(pkAssetPatchCollect);
        sb.append(", pkAsset=").append(pkAsset);
        sb.append(", provCode=").append(provCode);
        sb.append(", version=").append(version);
        sb.append(", patchCode=").append(patchCode);
        sb.append(", original=").append(original);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package com.ultrapower.pojo;

import java.io.Serializable;

public class AmAssetPropValue implements Serializable {
    private String pkAssetPropValue;

    private String pkAssetProp;

    private String valueName;

    private String valueCode;

    private String valueDesc;

    private String pkValueParent;

    private String seriescode;

    private Integer displayIdx;

    private static final long serialVersionUID = 1L;

    public String getPkAssetPropValue() {
        return pkAssetPropValue;
    }

    public void setPkAssetPropValue(String pkAssetPropValue) {
        this.pkAssetPropValue = pkAssetPropValue == null ? null : pkAssetPropValue.trim();
    }

    public String getPkAssetProp() {
        return pkAssetProp;
    }

    public void setPkAssetProp(String pkAssetProp) {
        this.pkAssetProp = pkAssetProp == null ? null : pkAssetProp.trim();
    }

    public String getValueName() {
        return valueName;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName == null ? null : valueName.trim();
    }

    public String getValueCode() {
        return valueCode;
    }

    public void setValueCode(String valueCode) {
        this.valueCode = valueCode == null ? null : valueCode.trim();
    }

    public String getValueDesc() {
        return valueDesc;
    }

    public void setValueDesc(String valueDesc) {
        this.valueDesc = valueDesc == null ? null : valueDesc.trim();
    }

    public String getPkValueParent() {
        return pkValueParent;
    }

    public void setPkValueParent(String pkValueParent) {
        this.pkValueParent = pkValueParent == null ? null : pkValueParent.trim();
    }

    public String getSeriescode() {
        return seriescode;
    }

    public void setSeriescode(String seriescode) {
        this.seriescode = seriescode == null ? null : seriescode.trim();
    }

    public Integer getDisplayIdx() {
        return displayIdx;
    }

    public void setDisplayIdx(Integer displayIdx) {
        this.displayIdx = displayIdx;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pkAssetPropValue=").append(pkAssetPropValue);
        sb.append(", pkAssetProp=").append(pkAssetProp);
        sb.append(", valueName=").append(valueName);
        sb.append(", valueCode=").append(valueCode);
        sb.append(", valueDesc=").append(valueDesc);
        sb.append(", pkValueParent=").append(pkValueParent);
        sb.append(", seriescode=").append(seriescode);
        sb.append(", displayIdx=").append(displayIdx);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
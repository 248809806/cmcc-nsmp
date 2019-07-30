package com.ultrapower.dto;

import com.ultrapower.pojo.AmAssetProp;

public class AmAssetPropDTO extends AmAssetProp {

    private String pkAsset;
    private Object propValue;

    public String getPkAsset() {
        return pkAsset;
    }

    public void setPkAsset(String pkAsset) {
        this.pkAsset = pkAsset;
    }

    public Object getPropValue() {
        return propValue;
    }

    public void setPropValue(Object propValue) {
        this.propValue = propValue;
    }
}

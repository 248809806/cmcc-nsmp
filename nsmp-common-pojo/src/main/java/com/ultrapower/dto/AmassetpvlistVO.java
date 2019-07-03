package com.ultrapower.dto;

import com.ultrapower.pojo.AmAssetProp;
import com.ultrapower.pojo.AmAssetPropValue;
import java.io.Serializable;
import java.util.List;

public class AmassetpvlistVO implements Serializable {

    private AmAssetProp assetPropBaseInfo;

    private List<AmAssetPropValue> assetPropValues;

    public AmAssetProp getAssetPropBaseInfo() {
        return assetPropBaseInfo;
    }

    public void setAssetPropBaseInfo(AmAssetProp assetPropBaseInfo) {
        this.assetPropBaseInfo = assetPropBaseInfo;
    }

    public List<AmAssetPropValue> getAssetPropValues() {
        return assetPropValues;
    }

    public void setAssetPropValues(List<AmAssetPropValue> assetPropValues) {
        this.assetPropValues = assetPropValues;
    }
}

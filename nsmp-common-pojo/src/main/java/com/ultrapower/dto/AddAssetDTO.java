package com.ultrapower.dto;

import com.ultrapower.pojo.AmAsset;
import com.ultrapower.pojo.AmAssetExtendProp;

import java.io.Serializable;
import java.util.List;

/**
 * 添加资产时，提交的数据
 */
public class AddAssetDTO implements Serializable {
    //{"props":v.props,"asset":v.asset,"assetExtendProp":v.assetExtendProp}

    List<AmAssetPropDTO> props;

    AmAsset asset;

    AmAssetExtendProp assetExtendProp;

    public List<AmAssetPropDTO> getProps() {
        return props;
    }

    public void setProps(List<AmAssetPropDTO> props) {
        this.props = props;
    }

    public AmAsset getAsset() {
        return asset;
    }

    public void setAsset(AmAsset asset) {
        this.asset = asset;
    }

    public AmAssetExtendProp getAssetExtendProp() {
        return assetExtendProp;
    }

    public void setAssetExtendProp(AmAssetExtendProp assetExtendProp) {
        this.assetExtendProp = assetExtendProp;
    }
}


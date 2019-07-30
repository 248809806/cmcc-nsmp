package com.ultrapower.dto;

import com.ultrapower.pojo.AmAsset;
import com.ultrapower.pojo.AmAssetProp;

import java.io.Serializable;
import java.util.List;

public class Assetpeoplist implements Serializable {

    private AmAsset amAsset;

    public AmAsset getAmAsset() {
        return amAsset;
    }

    public void setAmAsset(AmAsset amAsset) {
        this.amAsset = amAsset;
    }

    public List<AmAssetProp> getAmAssetProps() {
        return amAssetProps;
    }

    public void setAmAssetProps(List<AmAssetProp> amAssetProps) {
        this.amAssetProps = amAssetProps;
    }

    public Assetpeoplist() {

    }

    public Assetpeoplist(AmAsset amAsset, List<AmAssetProp> amAssetProps) {

        this.amAsset = amAsset;
        this.amAssetProps = amAssetProps;
    }

    private List<AmAssetProp> amAssetProps;
}

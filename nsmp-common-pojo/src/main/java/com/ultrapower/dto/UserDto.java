package com.ultrapower.dto;

public class UserDto {

    private String pkAssetType;
    private String typeName;
    private String typeCode;
    private String typeDesc;
    private String pkTypeParent;

    public String getPkAssetType() {
        return pkAssetType;
    }

    public void setPkAssetType(String pkAssetType) {
        this.pkAssetType = pkAssetType;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public String getPkTypeParent() {
        return pkTypeParent;
    }

    public void setPkTypeParent(String pkTypeParent) {
        this.pkTypeParent = pkTypeParent;
    }

    public UserDto() {

    }

    public UserDto(String pkAssetType, String typeName, String typeCode, String typeDesc, String pkTypeParent) {

        this.pkAssetType = pkAssetType;
        this.typeName = typeName;
        this.typeCode = typeCode;
        this.typeDesc = typeDesc;
        this.pkTypeParent = pkTypeParent;
    }
}

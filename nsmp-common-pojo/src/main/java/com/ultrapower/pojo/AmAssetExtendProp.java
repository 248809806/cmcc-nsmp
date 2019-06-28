package com.ultrapower.pojo;

public class AmAssetExtendProp {
    private String pkAsset;

    private String provCode;

    private String version;

    private String securityZone;

    private String region;

    private String department;

    private String publicIp;

    private String privateIp;

    private String natIp;

    private String virtualIp;

    private String administratorUser;

    private String administratorPhone;

    private Short acceptanceState;

    private Short ownership;

    private String hostIp;

    private String installPath;

    private String pkVendor;

    private String hardwareModel;

    private String operatingSystemName;

    private String operatingSystemVersion;

    private String devicename;

    private byte[] physicalPosition;

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

    public String getSecurityZone() {
        return securityZone;
    }

    public void setSecurityZone(String securityZone) {
        this.securityZone = securityZone == null ? null : securityZone.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp == null ? null : publicIp.trim();
    }

    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp == null ? null : privateIp.trim();
    }

    public String getNatIp() {
        return natIp;
    }

    public void setNatIp(String natIp) {
        this.natIp = natIp == null ? null : natIp.trim();
    }

    public String getVirtualIp() {
        return virtualIp;
    }

    public void setVirtualIp(String virtualIp) {
        this.virtualIp = virtualIp == null ? null : virtualIp.trim();
    }

    public String getAdministratorUser() {
        return administratorUser;
    }

    public void setAdministratorUser(String administratorUser) {
        this.administratorUser = administratorUser == null ? null : administratorUser.trim();
    }

    public String getAdministratorPhone() {
        return administratorPhone;
    }

    public void setAdministratorPhone(String administratorPhone) {
        this.administratorPhone = administratorPhone == null ? null : administratorPhone.trim();
    }

    public Short getAcceptanceState() {
        return acceptanceState;
    }

    public void setAcceptanceState(Short acceptanceState) {
        this.acceptanceState = acceptanceState;
    }

    public Short getOwnership() {
        return ownership;
    }

    public void setOwnership(Short ownership) {
        this.ownership = ownership;
    }

    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp == null ? null : hostIp.trim();
    }

    public String getInstallPath() {
        return installPath;
    }

    public void setInstallPath(String installPath) {
        this.installPath = installPath == null ? null : installPath.trim();
    }

    public String getPkVendor() {
        return pkVendor;
    }

    public void setPkVendor(String pkVendor) {
        this.pkVendor = pkVendor == null ? null : pkVendor.trim();
    }

    public String getHardwareModel() {
        return hardwareModel;
    }

    public void setHardwareModel(String hardwareModel) {
        this.hardwareModel = hardwareModel == null ? null : hardwareModel.trim();
    }

    public String getOperatingSystemName() {
        return operatingSystemName;
    }

    public void setOperatingSystemName(String operatingSystemName) {
        this.operatingSystemName = operatingSystemName == null ? null : operatingSystemName.trim();
    }

    public String getOperatingSystemVersion() {
        return operatingSystemVersion;
    }

    public void setOperatingSystemVersion(String operatingSystemVersion) {
        this.operatingSystemVersion = operatingSystemVersion == null ? null : operatingSystemVersion.trim();
    }

    public String getDevicename() {
        return devicename;
    }

    public void setDevicename(String devicename) {
        this.devicename = devicename == null ? null : devicename.trim();
    }

    public byte[] getPhysicalPosition() {
        return physicalPosition;
    }

    public void setPhysicalPosition(byte[] physicalPosition) {
        this.physicalPosition = physicalPosition;
    }
}
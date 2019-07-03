package com.ultrapower.pojo;

import java.io.Serializable;
import java.util.Date;

public class AdcBmSrv implements Serializable {
    private String pkBmSrv;

    private String version;

    private String provCode;

    private Integer srvType;

    private String srvName;

    private Integer severityLevel;

    private Integer isDeleted;

    private String pkCreator;

    private Date createTime;

    private String pkMender;

    private Date mendTimeLast;

    private static final long serialVersionUID = 1L;

    public String getPkBmSrv() {
        return pkBmSrv;
    }

    public void setPkBmSrv(String pkBmSrv) {
        this.pkBmSrv = pkBmSrv == null ? null : pkBmSrv.trim();
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

    public Integer getSrvType() {
        return srvType;
    }

    public void setSrvType(Integer srvType) {
        this.srvType = srvType;
    }

    public String getSrvName() {
        return srvName;
    }

    public void setSrvName(String srvName) {
        this.srvName = srvName == null ? null : srvName.trim();
    }

    public Integer getSeverityLevel() {
        return severityLevel;
    }

    public void setSeverityLevel(Integer severityLevel) {
        this.severityLevel = severityLevel;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getPkCreator() {
        return pkCreator;
    }

    public void setPkCreator(String pkCreator) {
        this.pkCreator = pkCreator == null ? null : pkCreator.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPkMender() {
        return pkMender;
    }

    public void setPkMender(String pkMender) {
        this.pkMender = pkMender == null ? null : pkMender.trim();
    }

    public Date getMendTimeLast() {
        return mendTimeLast;
    }

    public void setMendTimeLast(Date mendTimeLast) {
        this.mendTimeLast = mendTimeLast;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pkBmSrv=").append(pkBmSrv);
        sb.append(", version=").append(version);
        sb.append(", provCode=").append(provCode);
        sb.append(", srvType=").append(srvType);
        sb.append(", srvName=").append(srvName);
        sb.append(", severityLevel=").append(severityLevel);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", pkCreator=").append(pkCreator);
        sb.append(", createTime=").append(createTime);
        sb.append(", pkMender=").append(pkMender);
        sb.append(", mendTimeLast=").append(mendTimeLast);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
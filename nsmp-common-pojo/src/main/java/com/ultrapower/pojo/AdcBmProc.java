package com.ultrapower.pojo;

import java.io.Serializable;
import java.util.Date;

public class AdcBmProc implements Serializable {
    private String pkBmProc;

    private String version;

    private String provCode;

    private Integer procType;

    private String procName;

    private Integer severityLevel;

    private Integer isDeleted;

    private String pkCreator;

    private Date createTime;

    private String pkMender;

    private Date mendTimeLast;

    private static final long serialVersionUID = 1L;

    public String getPkBmProc() {
        return pkBmProc;
    }

    public void setPkBmProc(String pkBmProc) {
        this.pkBmProc = pkBmProc == null ? null : pkBmProc.trim();
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

    public Integer getProcType() {
        return procType;
    }

    public void setProcType(Integer procType) {
        this.procType = procType;
    }

    public String getProcName() {
        return procName;
    }

    public void setProcName(String procName) {
        this.procName = procName == null ? null : procName.trim();
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
        sb.append(", pkBmProc=").append(pkBmProc);
        sb.append(", version=").append(version);
        sb.append(", provCode=").append(provCode);
        sb.append(", procType=").append(procType);
        sb.append(", procName=").append(procName);
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
package com.ultrapower.pojo;

import java.io.Serializable;

public class AmAssetProcCollect implements Serializable {
    private String pkAssetProcCollect;

    private String pkAsset;

    private String provCode;

    private String version;

    private String procName;

    private String username;

    private String pid;

    private String ppid;

    private String startTime;

    private String runTime;

    private String startFile;

    private String workPath;

    private String startCmd;

    private String procDesc;

    private static final long serialVersionUID = 1L;

    public String getPkAssetProcCollect() {
        return pkAssetProcCollect;
    }

    public void setPkAssetProcCollect(String pkAssetProcCollect) {
        this.pkAssetProcCollect = pkAssetProcCollect == null ? null : pkAssetProcCollect.trim();
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

    public String getProcName() {
        return procName;
    }

    public void setProcName(String procName) {
        this.procName = procName == null ? null : procName.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getPpid() {
        return ppid;
    }

    public void setPpid(String ppid) {
        this.ppid = ppid == null ? null : ppid.trim();
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getRunTime() {
        return runTime;
    }

    public void setRunTime(String runTime) {
        this.runTime = runTime == null ? null : runTime.trim();
    }

    public String getStartFile() {
        return startFile;
    }

    public void setStartFile(String startFile) {
        this.startFile = startFile == null ? null : startFile.trim();
    }

    public String getWorkPath() {
        return workPath;
    }

    public void setWorkPath(String workPath) {
        this.workPath = workPath == null ? null : workPath.trim();
    }

    public String getStartCmd() {
        return startCmd;
    }

    public void setStartCmd(String startCmd) {
        this.startCmd = startCmd == null ? null : startCmd.trim();
    }

    public String getProcDesc() {
        return procDesc;
    }

    public void setProcDesc(String procDesc) {
        this.procDesc = procDesc == null ? null : procDesc.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pkAssetProcCollect=").append(pkAssetProcCollect);
        sb.append(", pkAsset=").append(pkAsset);
        sb.append(", provCode=").append(provCode);
        sb.append(", version=").append(version);
        sb.append(", procName=").append(procName);
        sb.append(", username=").append(username);
        sb.append(", pid=").append(pid);
        sb.append(", ppid=").append(ppid);
        sb.append(", startTime=").append(startTime);
        sb.append(", runTime=").append(runTime);
        sb.append(", startFile=").append(startFile);
        sb.append(", workPath=").append(workPath);
        sb.append(", startCmd=").append(startCmd);
        sb.append(", procDesc=").append(procDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
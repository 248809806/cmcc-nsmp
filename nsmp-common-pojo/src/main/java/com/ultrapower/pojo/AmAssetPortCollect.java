package com.ultrapower.pojo;

import java.io.Serializable;

public class AmAssetPortCollect implements Serializable {
    private String pkAssetPortCollect;

    private String pkAsset;

    private String provCode;

    private String version;

    private String protocol;

    private String localAddr;

    private String port;

    private String remoteAddr;

    private String remotePort;

    private String connState;

    private String portDesc;

    private static final long serialVersionUID = 1L;

    public String getPkAssetPortCollect() {
        return pkAssetPortCollect;
    }

    public void setPkAssetPortCollect(String pkAssetPortCollect) {
        this.pkAssetPortCollect = pkAssetPortCollect == null ? null : pkAssetPortCollect.trim();
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

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol == null ? null : protocol.trim();
    }

    public String getLocalAddr() {
        return localAddr;
    }

    public void setLocalAddr(String localAddr) {
        this.localAddr = localAddr == null ? null : localAddr.trim();
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port == null ? null : port.trim();
    }

    public String getRemoteAddr() {
        return remoteAddr;
    }

    public void setRemoteAddr(String remoteAddr) {
        this.remoteAddr = remoteAddr == null ? null : remoteAddr.trim();
    }

    public String getRemotePort() {
        return remotePort;
    }

    public void setRemotePort(String remotePort) {
        this.remotePort = remotePort == null ? null : remotePort.trim();
    }

    public String getConnState() {
        return connState;
    }

    public void setConnState(String connState) {
        this.connState = connState == null ? null : connState.trim();
    }

    public String getPortDesc() {
        return portDesc;
    }

    public void setPortDesc(String portDesc) {
        this.portDesc = portDesc == null ? null : portDesc.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pkAssetPortCollect=").append(pkAssetPortCollect);
        sb.append(", pkAsset=").append(pkAsset);
        sb.append(", provCode=").append(provCode);
        sb.append(", version=").append(version);
        sb.append(", protocol=").append(protocol);
        sb.append(", localAddr=").append(localAddr);
        sb.append(", port=").append(port);
        sb.append(", remoteAddr=").append(remoteAddr);
        sb.append(", remotePort=").append(remotePort);
        sb.append(", connState=").append(connState);
        sb.append(", portDesc=").append(portDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
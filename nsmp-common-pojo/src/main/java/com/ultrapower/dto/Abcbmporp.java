package com.ultrapower.dto;

import java.util.Date;

public class Abcbmporp {

    private String PROV_NAME;
    private Integer SEVERITY_LEVEL;
    private Integer PORT_TYPE;
    private String PROTOCOL;
    private String PORT;
    private String USER_ACCOUNT;

    public String getPROV_NAME() {
        return PROV_NAME;
    }

    public void setPROV_NAME(String PROV_NAME) {
        this.PROV_NAME = PROV_NAME;
    }

    public Integer getSEVERITY_LEVEL() {
        return SEVERITY_LEVEL;
    }

    public void setSEVERITY_LEVEL(Integer SEVERITY_LEVEL) {
        this.SEVERITY_LEVEL = SEVERITY_LEVEL;
    }

    public Integer getPORT_TYPE() {
        return PORT_TYPE;
    }

    public void setPORT_TYPE(Integer PORT_TYPE) {
        this.PORT_TYPE = PORT_TYPE;
    }

    public String getPROTOCOL() {
        return PROTOCOL;
    }

    public void setPROTOCOL(String PROTOCOL) {
        this.PROTOCOL = PROTOCOL;
    }

    public String getPORT() {
        return PORT;
    }

    public void setPORT(String PORT) {
        this.PORT = PORT;
    }

    public String getUSER_ACCOUNT() {
        return USER_ACCOUNT;
    }

    public void setUSER_ACCOUNT(String USER_ACCOUNT) {
        this.USER_ACCOUNT = USER_ACCOUNT;
    }

    public Date getMEND_TIME_LAST() {
        return MEND_TIME_LAST;
    }

    public void setMEND_TIME_LAST(Date MEND_TIME_LAST) {
        this.MEND_TIME_LAST = MEND_TIME_LAST;
    }

    private Date MEND_TIME_LAST;
}

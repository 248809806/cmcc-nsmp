package com.ultrapower.dto;

import java.io.Serializable;

public class Nodoea implements Serializable {

    private String id;
    private String pId;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Nodoea() {

    }

    public Nodoea(String id, String pId, String name) {

        this.id = id;
        this.pId = pId;
        this.name = name;
    }
}

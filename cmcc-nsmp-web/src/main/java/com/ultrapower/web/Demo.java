package com.ultrapower.web;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
public class Demo implements Serializable {

    @Id
    private String id;

    private String oid;

    @Override
    public String toString() {
        return "Demo{" +
                "id='" + id + '\'' +
                ", oid='" + oid + '\'' +
                ", oname='" + oname + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

    private String oname;

}

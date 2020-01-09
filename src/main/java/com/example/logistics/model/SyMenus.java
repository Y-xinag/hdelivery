package com.example.logistics.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class SyMenus implements Serializable {
    private Integer id;

    private String parentid;

    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    @Override
    public String toString() {
        return "SyMenus{" +
                "id=" + id +
                ", parentid='" + parentid + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
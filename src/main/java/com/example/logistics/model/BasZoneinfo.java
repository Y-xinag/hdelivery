package com.example.logistics.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class BasZoneinfo implements Serializable {
    private String zonename;

    private String zonecode;

    private Integer zonepeople;

    private String telphone;

    private Integer subordinateunit;

    public String getZonename() {
        return zonename;
    }

    public void setZonename(String zonename) {
        this.zonename = zonename == null ? null : zonename.trim();
    }

    public String getZonecode() {
        return zonecode;
    }

    public void setZonecode(String zonecode) {
        this.zonecode = zonecode == null ? null : zonecode.trim();
    }

    public Integer getZonepeople() {
        return zonepeople;
    }

    public void setZonepeople(Integer zonepeople) {
        this.zonepeople = zonepeople;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public Integer getSubordinateunit() {
        return subordinateunit;
    }

    public void setSubordinateunit(Integer subordinateunit) {
        this.subordinateunit = subordinateunit;
    }

    @Override
    public String toString() {
        return "BasZoneinfo{" +
                "zonename='" + zonename + '\'' +
                ", zonecode='" + zonecode + '\'' +
                ", zonepeople=" + zonepeople +
                ", telphone='" + telphone + '\'' +
                ", subordinateunit=" + subordinateunit +
                '}';
    }
}
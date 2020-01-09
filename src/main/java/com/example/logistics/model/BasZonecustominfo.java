package com.example.logistics.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class BasZonecustominfo implements Serializable {
    private Integer customcode;

    private String customname;

    private Integer mobileno;

    private String cityname;

    private String cstomaddress;

    private String zonename;

    public Integer getCustomcode() {
        return customcode;
    }

    public void setCustomcode(Integer customcode) {
        this.customcode = customcode;
    }

    public String getCustomname() {
        return customname;
    }

    public void setCustomname(String customname) {
        this.customname = customname == null ? null : customname.trim();
    }

    public Integer getMobileno() {
        return mobileno;
    }

    public void setMobileno(Integer mobileno) {
        this.mobileno = mobileno;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname == null ? null : cityname.trim();
    }

    public String getCstomaddress() {
        return cstomaddress;
    }

    public void setCstomaddress(String cstomaddress) {
        this.cstomaddress = cstomaddress == null ? null : cstomaddress.trim();
    }

    public String getZonename() {
        return zonename;
    }

    public void setZonename(String zonename) {
        this.zonename = zonename == null ? null : zonename.trim();
    }

    @Override
    public String toString() {
        return "BasZonecustominfo{" +
                "customcode=" + customcode +
                ", customname='" + customname + '\'' +
                ", mobileno=" + mobileno +
                ", cityname='" + cityname + '\'' +
                ", cstomaddress='" + cstomaddress + '\'' +
                ", zonename='" + zonename + '\'' +
                '}';
    }
}
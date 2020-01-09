package com.example.logistics.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class BasPartition implements Serializable {
    private Integer id;

    private String province;

    private String city;

    private String county;

    private String zonecode;

    private String keyword;

    private Integer startint;

    private Integer terminateint;

    private Boolean sdint;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    public String getZonecode() {
        return zonecode;
    }

    public void setZonecode(String zonecode) {
        this.zonecode = zonecode == null ? null : zonecode.trim();
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public Integer getStartint() {
        return startint;
    }

    public void setStartint(Integer startint) {
        this.startint = startint;
    }

    public Integer getTerminateint() {
        return terminateint;
    }

    public void setTerminateint(Integer terminateint) {
        this.terminateint = terminateint;
    }

    public Boolean getSdint() {
        return sdint;
    }

    public void setSdint(Boolean sdint) {
        this.sdint = sdint;
    }

    @Override
    public String toString() {
        return "BasPartition{" +
                "id=" + id +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", zonecode='" + zonecode + '\'' +
                ", keyword='" + keyword + '\'' +
                ", startint=" + startint +
                ", terminateint=" + terminateint +
                ", sdint=" + sdint +
                '}';
    }
}
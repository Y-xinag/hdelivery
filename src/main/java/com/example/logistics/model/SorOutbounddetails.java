package com.example.logistics.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Component
public class SorOutbounddetails implements Serializable {
    private Integer id;

    private String packageid;

    private BigDecimal weight;

    private BigDecimal volume;

    private Date scandate;

    private Boolean isscan;

    private Boolean isnextstorage;

    private Boolean isdoublestorage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPackageid() {
        return packageid;
    }

    public void setPackageid(String packageid) {
        this.packageid = packageid == null ? null : packageid.trim();
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public Date getScandate() {
        return scandate;
    }

    public void setScandate(Date scandate) {
        this.scandate = scandate;
    }

    public Boolean getIsscan() {
        return isscan;
    }

    public void setIsscan(Boolean isscan) {
        this.isscan = isscan;
    }

    public Boolean getIsnextstorage() {
        return isnextstorage;
    }

    public void setIsnextstorage(Boolean isnextstorage) {
        this.isnextstorage = isnextstorage;
    }

    public Boolean getIsdoublestorage() {
        return isdoublestorage;
    }

    @Override
    public String toString() {
        return "SorOutbounddetails{" +
                "id=" + id +
                ", packageid='" + packageid + '\'' +
                ", weight=" + weight +
                ", volume=" + volume +
                ", scandate=" + scandate +
                ", isscan=" + isscan +
                ", isnextstorage=" + isnextstorage +
                ", isdoublestorage=" + isdoublestorage +
                '}';
    }

    public void setIsdoublestorage(Boolean isdoublestorage) {
        this.isdoublestorage = isdoublestorage;
    }


}
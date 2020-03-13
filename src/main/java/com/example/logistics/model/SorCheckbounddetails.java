package com.example.logistics.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Component
public class SorCheckbounddetails implements Serializable {
    private Integer id;

    private int packageid;

    private Integer cargocount;

    private BigDecimal weight;

    private BigDecimal volume;

    private int cargotype;

    private String direction;

    private Integer storageperson;

    private Date storagedate;

    private List<SyEmp> syEmpList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getPackageid() {
        return packageid;
    }

    public void setPackageid(int packageid) {
        this.packageid = packageid;
    }

    public Integer getCargocount() {
        return cargocount;
    }

    public void setCargocount(Integer cargocount) {
        this.cargocount = cargocount;
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

    public int getCargotype() {
        return cargotype;
    }

    public void setCargotype(int cargotype) {
        this.cargotype = cargotype;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Integer getStorageperson() {
        return storageperson;
    }

    public void setStorageperson(Integer storageperson) {
        this.storageperson = storageperson;
    }

    public Date getStoragedate() {
        return storagedate;
    }

    public void setStoragedate(Date storagedate) {
        this.storagedate = storagedate;
    }

    public List<SyEmp> getSyEmpList() {
        return syEmpList;
    }

    public void setSyEmpList(List<SyEmp> syEmpList) {
        this.syEmpList = syEmpList;
    }

    @Override
    public String toString() {
        return "SorCheckbounddetails{" +
                "id=" + id +
                ", packageid=" + packageid +
                ", cargocount=" + cargocount +
                ", weight=" + weight +
                ", volume=" + volume +
                ", cargotype=" + cargotype +
                ", direction='" + direction + '\'' +
                ", storageperson=" + storageperson +
                ", storagedate=" + storagedate +
                ", syEmpList=" + syEmpList +
                '}';
    }
}
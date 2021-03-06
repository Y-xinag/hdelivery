package com.example.logistics.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Component
public class SorCheckbound implements Serializable {
    private Integer cid;

    private Integer scanid;

    private Integer cargosum;

    private Integer checkperson;

    private Date checkdate;

    private String checkcompany;

    private List<SyEmp> syEmpList;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getScanid() {
        return scanid;
    }

    public void setScanid(Integer scanid) {
        this.scanid = scanid;
    }

    public Integer getCargosum() {
        return cargosum;
    }

    public void setCargosum(Integer cargosum) {
        this.cargosum = cargosum;
    }

    public Integer getCheckperson() {
        return checkperson;
    }

    public void setCheckperson(Integer checkperson) {
        this.checkperson = checkperson;
    }

    public Date getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    public String getCheckcompany() {
        return checkcompany;
    }

    public void setCheckcompany(String checkcompany) {
        this.checkcompany = checkcompany;
    }

    public List<SyEmp> getSyEmpList() {
        return syEmpList;
    }

    public void setSyEmpList(List<SyEmp> syEmpList) {
        this.syEmpList = syEmpList;
    }

    @Override
    public String toString() {
        return "SorCheckbound{" +
                "cid=" + cid +
                ", scanid=" + scanid +
                ", cargosum=" + cargosum +
                ", checkperson=" + checkperson +
                ", checkdate=" + checkdate +
                ", checkcompany='" + checkcompany + '\'' +
                ", syEmpList=" + syEmpList +
                '}';
    }
}
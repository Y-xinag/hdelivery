package com.example.logistics.helperentity;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
public class SorCheckboundEntity implements Serializable {
    private Integer cid;

    private Integer scanid;

    private Integer cargosum;

    private String checkperson;

    private Date checkdate;

    private String checkcompany;

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

    public String getCheckperson() {
        return checkperson;
    }

    public void setCheckperson(String checkperson) {
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

    @Override
    public String toString() {
        return "SorCheckboundEntity{" +
                "cid=" + cid +
                ", scanid=" + scanid +
                ", cargosum=" + cargosum +
                ", checkperson='" + checkperson + '\'' +
                ", checkdate=" + checkdate +
                ", checkcompany='" + checkcompany + '\'' +
                '}';
    }
}

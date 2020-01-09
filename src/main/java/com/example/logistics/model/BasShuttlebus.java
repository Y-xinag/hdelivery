package com.example.logistics.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class BasShuttlebus implements Serializable {
    private Integer id;

    private Boolean linetype;

    private Integer lineid;

    private String licenseplateint;

    private String carrier;

    private String models;

    private String driver;

    private String telephone;

    private Integer ton;

    private String remarks;

    private Integer operationunitid;

    private Integer operatorid;

    private String operationtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getLinetype() {
        return linetype;
    }

    public void setLinetype(Boolean linetype) {
        this.linetype = linetype;
    }

    public Integer getLineid() {
        return lineid;
    }

    public void setLineid(Integer lineid) {
        this.lineid = lineid;
    }

    public String getLicenseplateint() {
        return licenseplateint;
    }

    public void setLicenseplateint(String licenseplateint) {
        this.licenseplateint = licenseplateint == null ? null : licenseplateint.trim();
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier == null ? null : carrier.trim();
    }

    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models == null ? null : models.trim();
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver == null ? null : driver.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public Integer getTon() {
        return ton;
    }

    public void setTon(Integer ton) {
        this.ton = ton;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getOperationunitid() {
        return operationunitid;
    }

    public void setOperationunitid(Integer operationunitid) {
        this.operationunitid = operationunitid;
    }

    public Integer getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(Integer operatorid) {
        this.operatorid = operatorid;
    }

    public String getOperationtime() {
        return operationtime;
    }

    public void setOperationtime(String operationtime) {
        this.operationtime = operationtime == null ? null : operationtime.trim();
    }

    @Override
    public String toString() {
        return "BasShuttlebus{" +
                "id=" + id +
                ", linetype=" + linetype +
                ", lineid=" + lineid +
                ", licenseplateint='" + licenseplateint + '\'' +
                ", carrier='" + carrier + '\'' +
                ", models='" + models + '\'' +
                ", driver='" + driver + '\'' +
                ", telephone='" + telephone + '\'' +
                ", ton=" + ton +
                ", remarks='" + remarks + '\'' +
                ", operationunitid=" + operationunitid +
                ", operatorid=" + operatorid +
                ", operationtime='" + operationtime + '\'' +
                '}';
    }
}
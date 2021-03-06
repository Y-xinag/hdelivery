package com.example.logistics.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
public class SorAbnormal implements Serializable {
    private String id;

    private Date launchdate;

    private String launchperson;

    private String launchcompany;

    private Boolean abnormaltype;

    private String transferint;

    private String cargoint;

    private String packageint;

    private Integer hedgeabnint;

    private Boolean abostate;

    private Date handledate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getLaunchdate() {
        return launchdate;
    }

    public void setLaunchdate(Date launchdate) {
        this.launchdate = launchdate;
    }

    public String getLaunchperson() {
        return launchperson;
    }

    public void setLaunchperson(String launchperson) {
        this.launchperson = launchperson;
    }

    public String getLaunchcompany() {
        return launchcompany;
    }

    public void setLaunchcompany(String launchcompany) {
        this.launchcompany = launchcompany;
    }

    public Boolean getAbnormaltype() {
        return abnormaltype;
    }

    public void setAbnormaltype(Boolean abnormaltype) {
        this.abnormaltype = abnormaltype;
    }

    public String getTransferint() {
        return transferint;
    }

    public void setTransferint(String transferint) {
        this.transferint = transferint;
    }

    public String getCargoint() {
        return cargoint;
    }

    public void setCargoint(String cargoint) {
        this.cargoint = cargoint;
    }

    public String getPackageint() {
        return packageint;
    }

    public void setPackageint(String packageint) {
        this.packageint = packageint;
    }

    public Integer getHedgeabnint() {
        return hedgeabnint;
    }

    public void setHedgeabnint(Integer hedgeabnint) {
        this.hedgeabnint = hedgeabnint;
    }

    public Boolean getAbostate() {
        return abostate;
    }

    public void setAbostate(Boolean abostate) {
        this.abostate = abostate;
    }

    public Date getHandledate() {
        return handledate;
    }

    public void setHandledate(Date handledate) {
        this.handledate = handledate;
    }

    @Override
    public String toString() {
        return "SorAbnormal{" +
                "id='" + id + '\'' +
                ", launchdate=" + launchdate +
                ", launchperson='" + launchperson + '\'' +
                ", launchcompany='" + launchcompany + '\'' +
                ", abnormaltype=" + abnormaltype +
                ", transferint='" + transferint + '\'' +
                ", cargoint='" + cargoint + '\'' +
                ", packageint='" + packageint + '\'' +
                ", hedgeabnint=" + hedgeabnint +
                ", abostate=" + abostate +
                ", handledate=" + handledate +
                '}';
    }
}
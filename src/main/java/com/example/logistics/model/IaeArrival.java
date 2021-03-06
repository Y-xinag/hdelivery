package com.example.logistics.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Component
public class IaeArrival implements Serializable {
    private String id;

    private String sendcompany;

    private String cargoaddress;

    private String issueperson;

    private Date issuedate;

    private String workaddress;

    private Date storagedate;

    private Date outbounddate;

    private Date timelimit;

    private Date batch;

    private List<IaeLineresource> iaeLineresourceList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSendcompany() {
        return sendcompany;
    }

    public void setSendcompany(String sendcompany) {
        this.sendcompany = sendcompany;
    }

    public String getCargoaddress() {
        return cargoaddress;
    }

    public void setCargoaddress(String cargoaddress) {
        this.cargoaddress = cargoaddress;
    }

    public String getIssueperson() {
        return issueperson;
    }

    public void setIssueperson(String issueperson) {
        this.issueperson = issueperson;
    }

    public Date getIssuedate() {
        return issuedate;
    }

    public void setIssuedate(Date issuedate) {
        this.issuedate = issuedate;
    }

    public String getWorkaddress() {
        return workaddress;
    }

    public void setWorkaddress(String workaddress) {
        this.workaddress = workaddress;
    }

    public Date getStoragedate() {
        return storagedate;
    }

    public void setStoragedate(Date storagedate) {
        this.storagedate = storagedate;
    }

    public Date getOutbounddate() {
        return outbounddate;
    }

    public void setOutbounddate(Date outbounddate) {
        this.outbounddate = outbounddate;
    }

    public Date getTimelimit() {
        return timelimit;
    }

    public void setTimelimit(Date timelimit) {
        this.timelimit = timelimit;
    }

    public Date getBatch() {
        return batch;
    }

    public void setBatch(Date batch) {
        this.batch = batch;
    }

    public List<IaeLineresource> getIaeLineresourceList() {
        return iaeLineresourceList;
    }

    public void setIaeLineresourceList(List<IaeLineresource> iaeLineresourceList) {
        this.iaeLineresourceList = iaeLineresourceList;
    }

    @Override
    public String toString() {
        return "IaeArrival{" +
                "id='" + id + '\'' +
                ", sendcompany='" + sendcompany + '\'' +
                ", cargoaddress='" + cargoaddress + '\'' +
                ", issueperson='" + issueperson + '\'' +
                ", issuedate=" + issuedate +
                ", workaddress='" + workaddress + '\'' +
                ", storagedate=" + storagedate +
                ", outbounddate=" + outbounddate +
                ", timelimit=" + timelimit +
                ", batch=" + batch +
                ", iaeLineresourceList=" + iaeLineresourceList +
                '}';
    }
}
package com.example.logistics.helperentity;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class IaeDepartureEntity {
    private String id;
    private String packingid;
    private Date storagedate;
    private String sendcompany;
    private String issueperson;
    private String vehicleint;
    private String waybillid;
    private Date expectarrivaldate;
    private Date acceptdate;
    private String takecargoperson;
    private String outplace;
    private String transportway;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPackingid() {
        return packingid;
    }

    public void setPackingid(String packingid) {
        this.packingid = packingid;
    }

    public Date getStoragedate() {
        return storagedate;
    }

    public void setStoragedate(Date storagedate) {
        this.storagedate = storagedate;
    }

    public String getSendcompany() {
        return sendcompany;
    }

    public void setSendcompany(String sendcompany) {
        this.sendcompany = sendcompany;
    }

    public String getIssueperson() {
        return issueperson;
    }

    public void setIssueperson(String issueperson) {
        this.issueperson = issueperson;
    }

    public String getVehicleint() {
        return vehicleint;
    }

    public void setVehicleint(String vehicleint) {
        this.vehicleint = vehicleint;
    }

    public String getWaybillid() {
        return waybillid;
    }

    public void setWaybillid(String waybillid) {
        this.waybillid = waybillid;
    }

    public Date getExpectarrivaldate() {
        return expectarrivaldate;
    }

    public void setExpectarrivaldate(Date expectarrivaldate) {
        this.expectarrivaldate = expectarrivaldate;
    }

    public Date getAcceptdate() {
        return acceptdate;
    }

    public void setAcceptdate(Date acceptdate) {
        this.acceptdate = acceptdate;
    }

    public String getTakecargoperson() {
        return takecargoperson;
    }

    public void setTakecargoperson(String takecargoperson) {
        this.takecargoperson = takecargoperson;
    }

    public String getOutplace() {
        return outplace;
    }

    public void setOutplace(String outplace) {
        this.outplace = outplace;
    }

    public String getTransportway() {
        return transportway;
    }

    public void setTransportway(String transportway) {
        this.transportway = transportway;
    }

    @Override
    public String toString() {
        return "IaeDepartureEntity{" +
                "id='" + id + '\'' +
                ", packingid='" + packingid + '\'' +
                ", storagedate=" + storagedate +
                ", sendcompany='" + sendcompany + '\'' +
                ", issueperson='" + issueperson + '\'' +
                ", vehicleint='" + vehicleint + '\'' +
                ", waybillid='" + waybillid + '\'' +
                ", expectarrivaldate=" + expectarrivaldate +
                ", acceptdate=" + acceptdate +
                ", takecargoperson='" + takecargoperson + '\'' +
                ", outplace='" + outplace + '\'' +
                ", transportway='" + transportway + '\'' +
                '}';
    }
}

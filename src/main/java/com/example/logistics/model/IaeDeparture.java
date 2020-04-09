package com.example.logistics.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Component
public class IaeDeparture implements Serializable {
    private String id;

    private String packingid;

    private Boolean transfer;

    private Integer actualcount;

    private String destination;

    private String warename;

    private Integer cargocount;

    private BigDecimal weight;

    private BigDecimal volume;

    private BigDecimal actualvolume;

    private Date timelimit;

    private String ask;

    private String takecargoperson;

    private String tackcargoaddress;

    private Integer payment;

    private String importanthints;

    private Date surplustime;

    private String entrustcompany;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPackingid() {
        return packingid;
    }

    public void setPackingid(String packingid) {
        this.packingid = packingid == null ? null : packingid.trim();
    }

    public Boolean getTransfer() {
        return transfer;
    }

    public void setTransfer(Boolean transfer) {
        this.transfer = transfer;
    }

    public Integer getActualcount() {
        return actualcount;
    }

    public void setActualcount(Integer actualcount) {
        this.actualcount = actualcount;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public String getWarename() {
        return warename;
    }

    public void setWarename(String warename) {
        this.warename = warename;
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

    public BigDecimal getActualvolume() {
        return actualvolume;
    }

    public void setActualvolume(BigDecimal actualvolume) {
        this.actualvolume = actualvolume;
    }

    public Date getTimelimit() {
        return timelimit;
    }

    public void setTimelimit(Date timelimit) {
        this.timelimit = timelimit;
    }

    public String getAsk() {
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask == null ? null : ask.trim();
    }

    public String getTakecargoperson() {
        return takecargoperson;
    }

    public void setTakecargoperson(String takecargoperson) {
        this.takecargoperson = takecargoperson == null ? null : takecargoperson.trim();
    }

    public String getTackcargoaddress() {
        return tackcargoaddress;
    }

    public void setTackcargoaddress(String tackcargoaddress) {
        this.tackcargoaddress = tackcargoaddress == null ? null : tackcargoaddress.trim();
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    public String getImportanthints() {
        return importanthints;
    }

    public void setImportanthints(String importanthints) {
        this.importanthints = importanthints == null ? null : importanthints.trim();
    }

    public Date getSurplustime() {
        return surplustime;
    }

    public void setSurplustime(Date surplustime) {
        this.surplustime = surplustime;
    }

    public String getEntrustcompany() {
        return entrustcompany;
    }

    public void setEntrustcompany(String entrustcompany) {
        this.entrustcompany = entrustcompany == null ? null : entrustcompany.trim();
    }

    @Override
    public String toString() {
        return "IaeDeparture{" +
                "id='" + id + '\'' +
                ", packingid='" + packingid + '\'' +
                ", transfer=" + transfer +
                ", actualcount=" + actualcount +
                ", destination='" + destination + '\'' +
                ", warename=" + warename +
                ", cargocount=" + cargocount +
                ", weight=" + weight +
                ", volume=" + volume +
                ", actualvolume=" + actualvolume +
                ", timelimit=" + timelimit +
                ", ask='" + ask + '\'' +
                ", takecargoperson='" + takecargoperson + '\'' +
                ", tackcargoaddress='" + tackcargoaddress + '\'' +
                ", payment=" + payment +
                ", importanthints='" + importanthints + '\'' +
                ", surplustime=" + surplustime +
                ", entrustcompany='" + entrustcompany + '\'' +
                '}';
    }
}
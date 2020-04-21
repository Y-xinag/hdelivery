package com.example.logistics.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

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

    private List<IaeArrival> iaeArrivalList;

    private List<IaeLineresource> iaeLineresourceList;

    private List<IaeExtract> iaeExtractList;

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
        this.destination = destination;
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
        this.ask = ask;
    }

    public String getTakecargoperson() {
        return takecargoperson;
    }

    public void setTakecargoperson(String takecargoperson) {
        this.takecargoperson = takecargoperson;
    }

    public String getTackcargoaddress() {
        return tackcargoaddress;
    }

    public void setTackcargoaddress(String tackcargoaddress) {
        this.tackcargoaddress = tackcargoaddress;
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
        this.importanthints = importanthints;
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
        this.entrustcompany = entrustcompany;
    }

    public List<IaeArrival> getIaeArrivalList() {
        return iaeArrivalList;
    }

    public void setIaeArrivalList(List<IaeArrival> iaeArrivalList) {
        this.iaeArrivalList = iaeArrivalList;
    }

    public List<IaeLineresource> getIaeLineresourceList() {
        return iaeLineresourceList;
    }

    public void setIaeLineresourceList(List<IaeLineresource> iaeLineresourceList) {
        this.iaeLineresourceList = iaeLineresourceList;
    }

    public List<IaeExtract> getIaeExtractList() {
        return iaeExtractList;
    }

    public void setIaeExtractList(List<IaeExtract> iaeExtractList) {
        this.iaeExtractList = iaeExtractList;
    }

    @Override
    public String toString() {
        return "IaeDeparture{" +
                "id='" + id + '\'' +
                ", packingid='" + packingid + '\'' +
                ", transfer=" + transfer +
                ", actualcount=" + actualcount +
                ", destination='" + destination + '\'' +
                ", warename='" + warename + '\'' +
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
                ", iaeArrivalList=" + iaeArrivalList +
                ", iaeLineresourceList=" + iaeLineresourceList +
                ", iaeExtractList=" + iaeExtractList +
                '}';
    }
}
package com.example.logistics.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Component
public class SorPackage implements Serializable {
    private Integer id;

    private Integer packageperson;

    private String sealint;

    private String destination;

    private String reckondes;

    private Date timelimit;

    private Integer ticketsum;

    private Integer cargosum;

    private BigDecimal weightsum;

    private BigDecimal volumesum;

    private Boolean state;

    private Boolean ask;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPackageperson() {
        return packageperson;
    }

    public void setPackageperson(Integer packageperson) {
        this.packageperson = packageperson;
    }

    public String getSealint() {
        return sealint;
    }

    public void setSealint(String sealint) {
        this.sealint = sealint == null ? null : sealint.trim();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public String getReckondes() {
        return reckondes;
    }

    public void setReckondes(String reckondes) {
        this.reckondes = reckondes == null ? null : reckondes.trim();
    }

    public Date getTimelimit() {
        return timelimit;
    }

    public void setTimelimit(Date timelimit) {
        this.timelimit = timelimit;
    }

    public Integer getTicketsum() {
        return ticketsum;
    }

    public void setTicketsum(Integer ticketsum) {
        this.ticketsum = ticketsum;
    }

    public Integer getCargosum() {
        return cargosum;
    }

    public void setCargosum(Integer cargosum) {
        this.cargosum = cargosum;
    }

    public BigDecimal getWeightsum() {
        return weightsum;
    }

    public void setWeightsum(BigDecimal weightsum) {
        this.weightsum = weightsum;
    }

    public BigDecimal getVolumesum() {
        return volumesum;
    }

    public void setVolumesum(BigDecimal volumesum) {
        this.volumesum = volumesum;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Boolean getAsk() {
        return ask;
    }

    public void setAsk(Boolean ask) {
        this.ask = ask;
    }

    @Override
    public String toString() {
        return "SorPackage{" +
                "id=" + id +
                ", packageperson=" + packageperson +
                ", sealint='" + sealint + '\'' +
                ", destination='" + destination + '\'' +
                ", reckondes='" + reckondes + '\'' +
                ", timelimit=" + timelimit +
                ", ticketsum=" + ticketsum +
                ", cargosum=" + cargosum +
                ", weightsum=" + weightsum +
                ", volumesum=" + volumesum +
                ", state=" + state +
                ", ask=" + ask +
                '}';
    }
}
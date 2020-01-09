package com.example.logistics.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Component
public class SorPackagedetails implements Serializable {
    private Integer id;

    private Integer warename;

    private String destination;

    private Integer ticket;

    private Integer actualcargoint;

    private Integer cargoint;

    private BigDecimal weight;

    private BigDecimal volume;

    private Date service;

    private String importanthints;

    private String ask;

    private String inputtype;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWarename() {
        return warename;
    }

    public void setWarename(Integer warename) {
        this.warename = warename;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public Integer getTicket() {
        return ticket;
    }

    public void setTicket(Integer ticket) {
        this.ticket = ticket;
    }

    public Integer getActualcargoint() {
        return actualcargoint;
    }

    public void setActualcargoint(Integer actualcargoint) {
        this.actualcargoint = actualcargoint;
    }

    public Integer getCargoint() {
        return cargoint;
    }

    public void setCargoint(Integer cargoint) {
        this.cargoint = cargoint;
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

    public Date getService() {
        return service;
    }

    public void setService(Date service) {
        this.service = service;
    }

    public String getImportanthints() {
        return importanthints;
    }

    public void setImportanthints(String importanthints) {
        this.importanthints = importanthints == null ? null : importanthints.trim();
    }

    public String getAsk() {
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask == null ? null : ask.trim();
    }

    public String getInputtype() {
        return inputtype;
    }

    public void setInputtype(String inputtype) {
        this.inputtype = inputtype == null ? null : inputtype.trim();
    }

    @Override
    public String toString() {
        return "SorPackagedetails{" +
                "id=" + id +
                ", warename=" + warename +
                ", destination='" + destination + '\'' +
                ", ticket=" + ticket +
                ", actualcargoint=" + actualcargoint +
                ", cargoint=" + cargoint +
                ", weight=" + weight +
                ", volume=" + volume +
                ", service=" + service +
                ", importanthints='" + importanthints + '\'' +
                ", ask='" + ask + '\'' +
                ", inputtype='" + inputtype + '\'' +
                '}';
    }
}
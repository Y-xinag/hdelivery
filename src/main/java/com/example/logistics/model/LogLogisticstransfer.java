package com.example.logistics.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
public class LogLogisticstransfer implements Serializable {
    private Integer id;

    private String transferint;

    private String startstation;

    private String endstation;

    private String dispatcher;

    private String driver;

    private Integer deliveryperson;

    private Date deliverydate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTransferint() {
        return transferint;
    }

    public void setTransferint(String transferint) {
        this.transferint = transferint == null ? null : transferint.trim();
    }

    public String getStartstation() {
        return startstation;
    }

    public void setStartstation(String startstation) {
        this.startstation = startstation == null ? null : startstation.trim();
    }

    public String getEndstation() {
        return endstation;
    }

    public void setEndstation(String endstation) {
        this.endstation = endstation == null ? null : endstation.trim();
    }

    public String getDispatcher() {
        return dispatcher;
    }

    public void setDispatcher(String dispatcher) {
        this.dispatcher = dispatcher == null ? null : dispatcher.trim();
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver == null ? null : driver.trim();
    }

    public Integer getDeliveryperson() {
        return deliveryperson;
    }

    public void setDeliveryperson(Integer deliveryperson) {
        this.deliveryperson = deliveryperson;
    }

    public Date getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(Date deliverydate) {
        this.deliverydate = deliverydate;
    }

    @Override
    public String toString() {
        return "LogLogisticstransfer{" +
                "id=" + id +
                ", transferint='" + transferint + '\'' +
                ", startstation='" + startstation + '\'' +
                ", endstation='" + endstation + '\'' +
                ", dispatcher='" + dispatcher + '\'' +
                ", driver='" + driver + '\'' +
                ", deliveryperson=" + deliveryperson +
                ", deliverydate=" + deliverydate +
                '}';
    }
}
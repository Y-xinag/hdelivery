package com.example.logistics.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
public class SorOutbound implements Serializable {
    private String outboundid;

    private Boolean handovertype;

    private String line;

    private Integer direction;

    private Integer acceptperson;

    private Integer carriers;

    private Integer deliveryperson;

    private Date deliverydate;

    private String deliverycompany;

    private Integer enterperson;

    private Date enterdate;

    public String getOutboundid() {
        return outboundid;
    }

    public void setOutboundid(String outboundid) {
        this.outboundid = outboundid == null ? null : outboundid.trim();
    }

    public Boolean getHandovertype() {
        return handovertype;
    }

    public void setHandovertype(Boolean handovertype) {
        this.handovertype = handovertype;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line == null ? null : line.trim();
    }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public Integer getAcceptperson() {
        return acceptperson;
    }

    public void setAcceptperson(Integer acceptperson) {
        this.acceptperson = acceptperson;
    }

    public Integer getCarriers() {
        return carriers;
    }

    public void setCarriers(Integer carriers) {
        this.carriers = carriers;
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

    public String getDeliverycompany() {
        return deliverycompany;
    }

    public void setDeliverycompany(String deliverycompany) {
        this.deliverycompany = deliverycompany == null ? null : deliverycompany.trim();
    }

    public Integer getEnterperson() {
        return enterperson;
    }

    public void setEnterperson(Integer enterperson) {
        this.enterperson = enterperson;
    }

    public Date getEnterdate() {
        return enterdate;
    }

    public void setEnterdate(Date enterdate) {
        this.enterdate = enterdate;
    }

    @Override
    public String toString() {
        return "SorOutbound{" +
                "outboundid='" + outboundid + '\'' +
                ", handovertype=" + handovertype +
                ", line='" + line + '\'' +
                ", direction=" + direction +
                ", acceptperson=" + acceptperson +
                ", carriers=" + carriers +
                ", deliveryperson=" + deliveryperson +
                ", deliverydate=" + deliverydate +
                ", deliverycompany='" + deliverycompany + '\'' +
                ", enterperson=" + enterperson +
                ", enterdate=" + enterdate +
                '}';
    }
}
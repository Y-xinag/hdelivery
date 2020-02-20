package com.example.logistics.helperentity;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
public class SorOutboundEntity implements Serializable {
    private String outboundid;
    private int handovertype;
    private String line;
    private String direction;
    private String acceptperson;
    private String carriers;
    private String deliveryperson;
    private Date deliverydate;
    private String deliverycompany;
    private String enterperson;
    private Date enterdate;

    public String getOutboundid() {
        return outboundid;
    }

    public void setOutboundid(String outboundid) {
        this.outboundid = outboundid;
    }

    public int getHandovertype() {
        return handovertype;
    }

    public void setHandovertype(int handovertype) {
        this.handovertype = handovertype;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getAcceptperson() {
        return acceptperson;
    }

    public void setAcceptperson(String acceptperson) {
        this.acceptperson = acceptperson;
    }

    public String getCarriers() {
        return carriers;
    }

    public void setCarriers(String carriers) {
        this.carriers = carriers;
    }

    public String getDeliveryperson() {
        return deliveryperson;
    }

    public void setDeliveryperson(String deliveryperson) {
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
        this.deliverycompany = deliverycompany;
    }

    public String getEnterperson() {
        return enterperson;
    }

    public void setEnterperson(String enterperson) {
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
        return "SorOutboundEntity{" +
                "outboundid='" + outboundid + '\'' +
                ", handovertype=" + handovertype +
                ", line='" + line + '\'' +
                ", direction='" + direction + '\'' +
                ", acceptperson='" + acceptperson + '\'' +
                ", carriers='" + carriers + '\'' +
                ", deliveryperson='" + deliveryperson + '\'' +
                ", deliverydate=" + deliverydate +
                ", deliverycompany='" + deliverycompany + '\'' +
                ", enterperson='" + enterperson + '\'' +
                ", enterdate=" + enterdate +
                '}';
    }
}

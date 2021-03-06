package com.example.logistics.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Component
public class SorOutbound implements Serializable {
    private String outboundid;

    private int handovertype;

    private String line;

    private String direction;

    private Integer acceptperson;

    private String carriers;

    private Integer deliveryperson;

    private Date deliverydate;

    private String deliverycompany;

    private Integer enterperson;

    private Date enterdate;

    private List<SyEmp> syEmpList;

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

    public Integer getAcceptperson() {
        return acceptperson;
    }

    public void setAcceptperson(Integer acceptperson) {
        this.acceptperson = acceptperson;
    }

    public String getCarriers() {
        return carriers;
    }

    public void setCarriers(String carriers) {
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
        this.deliverycompany = deliverycompany;
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

    public List<SyEmp> getSyEmpList() {
        return syEmpList;
    }

    public void setSyEmpList(List<SyEmp> syEmpList) {
        this.syEmpList = syEmpList;
    }

    @Override
    public String toString() {
        return "SorOutbound{" +
                "outboundid='" + outboundid + '\'' +
                ", handovertype=" + handovertype +
                ", line='" + line + '\'' +
                ", direction='" + direction + '\'' +
                ", acceptperson=" + acceptperson +
                ", carriers='" + carriers + '\'' +
                ", deliveryperson=" + deliveryperson +
                ", deliverydate=" + deliverydate +
                ", deliverycompany='" + deliverycompany + '\'' +
                ", enterperson=" + enterperson +
                ", enterdate=" + enterdate +
                ", syEmpList=" + syEmpList +
                '}';
    }
}
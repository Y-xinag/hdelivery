package com.example.logistics.helperentity;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;
public class SoStroageEntity{
    private Integer sid;

    private String id;

    private Date acceptdate;

    private String acceptperson;

    private String acceptcompany;

    private String deliveryperson;

    private String deliverycompany;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getAcceptdate() {
        return acceptdate;
    }

    public void setAcceptdate(Date acceptdate) {
        this.acceptdate = acceptdate;
    }

    public String getAcceptperson() {
        return acceptperson;
    }

    public void setAcceptperson(String acceptperson) {
        this.acceptperson = acceptperson;
    }

    public String getAcceptcompany() {
        return acceptcompany;
    }

    public void setAcceptcompany(String acceptcompany) {
        this.acceptcompany = acceptcompany;
    }

    public String getDeliveryperson() {
        return deliveryperson;
    }

    public void setDeliveryperson(String deliveryperson) {
        this.deliveryperson = deliveryperson;
    }

    public String getDeliverycompany() {
        return deliverycompany;
    }

    public void setDeliverycompany(String deliverycompany) {
        this.deliverycompany = deliverycompany;
    }
}

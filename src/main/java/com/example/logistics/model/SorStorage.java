package com.example.logistics.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Component
public class SorStorage implements Serializable {
    private Integer sid;

    private String id;

    private Date acceptdate;

    private Integer acceptperson;

    private String acceptcompany;

    private Integer deliveryperson;

    private String deliverycompany;

    private List<SyEmp> syEmpList;

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

    public Integer getAcceptperson() {
        return acceptperson;
    }

    public void setAcceptperson(Integer acceptperson) {
        this.acceptperson = acceptperson;
    }

    public String getAcceptcompany() {
        return acceptcompany;
    }

    public void setAcceptcompany(String acceptcompany) {
        this.acceptcompany = acceptcompany;
    }

    public Integer getDeliveryperson() {
        return deliveryperson;
    }

    public void setDeliveryperson(Integer deliveryperson) {
        this.deliveryperson = deliveryperson;
    }

    public String getDeliverycompany() {
        return deliverycompany;
    }

    public void setDeliverycompany(String deliverycompany) {
        this.deliverycompany = deliverycompany;
    }

    public List<SyEmp> getSyEmpList() {
        return syEmpList;
    }

    public void setSyEmpList(List<SyEmp> syEmpList) {
        this.syEmpList = syEmpList;
    }

    @Override
    public String toString() {
        return "SorStorage{" +
                "sid=" + sid +
                ", id='" + id + '\'' +
                ", acceptdate=" + acceptdate +
                ", acceptperson=" + acceptperson +
                ", acceptcompany='" + acceptcompany + '\'' +
                ", deliveryperson=" + deliveryperson +
                ", deliverycompany='" + deliverycompany + '\'' +
                ", syEmpList=" + syEmpList +
                '}';
    }
}
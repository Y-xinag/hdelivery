package com.example.logistics.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class SorStoragedetails implements Serializable {
    private Integer sid;

    private String packageid;

    private Integer weight;

    private String outboundid;

    private int state;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getPackageid() {
        return packageid;
    }

    public void setPackageid(String packageid) {
        this.packageid = packageid;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getOutboundid() {
        return outboundid;
    }

    public void setOutboundid(String outboundid) {
        this.outboundid = outboundid;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "SorStoragedetails{" +
                "sid=" + sid +
                ", packageid='" + packageid + '\'' +
                ", weight=" + weight +
                ", outboundid='" + outboundid + '\'' +
                ", state=" + state +
                '}';
    }
}
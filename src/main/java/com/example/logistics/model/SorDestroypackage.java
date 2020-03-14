package com.example.logistics.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Component
public class SorDestroypackage implements Serializable {
    private Integer id;

    private Integer destroyperson;

    private String closeint;

    private String arriveplace;

    private String planArriveplace;

    private Date arrivetime;

    private Integer allticket;

    private Integer allcount;

    private BigDecimal allweight;

    private BigDecimal allbody;

    private Boolean stateint;

    private Boolean question;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDestroyperson() {
        return destroyperson;
    }

    public void setDestroyperson(Integer destroyperson) {
        this.destroyperson = destroyperson;
    }

    public String getCloseint() {
        return closeint;
    }

    public void setCloseint(String closeint) {
        this.closeint = closeint;
    }

    public String getArriveplace() {
        return arriveplace;
    }

    public void setArriveplace(String arriveplace) {
        this.arriveplace = arriveplace;
    }

    public String getPlanArriveplace() {
        return planArriveplace;
    }

    public void setPlanArriveplace(String planArriveplace) {
        this.planArriveplace = planArriveplace;
    }

    public Date getArrivetime() {
        return arrivetime;
    }

    public void setArrivetime(Date arrivetime) {
        this.arrivetime = arrivetime;
    }

    public Integer getAllticket() {
        return allticket;
    }

    public void setAllticket(Integer allticket) {
        this.allticket = allticket;
    }

    public Integer getAllcount() {
        return allcount;
    }

    public void setAllcount(Integer allcount) {
        this.allcount = allcount;
    }

    public BigDecimal getAllweight() {
        return allweight;
    }

    public void setAllweight(BigDecimal allweight) {
        this.allweight = allweight;
    }

    public BigDecimal getAllbody() {
        return allbody;
    }

    public void setAllbody(BigDecimal allbody) {
        this.allbody = allbody;
    }

    public Boolean getStateint() {
        return stateint;
    }

    public void setStateint(Boolean stateint) {
        this.stateint = stateint;
    }

    public Boolean getQuestion() {
        return question;
    }

    public void setQuestion(Boolean question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "SorDestroypackage{" +
                "id=" + id +
                ", destroyperson=" + destroyperson +
                ", closeint='" + closeint + '\'' +
                ", arriveplace='" + arriveplace + '\'' +
                ", planArriveplace='" + planArriveplace + '\'' +
                ", arrivetime=" + arrivetime +
                ", allticket=" + allticket +
                ", allcount=" + allcount +
                ", allweight=" + allweight +
                ", allbody=" + allbody +
                ", stateint=" + stateint +
                ", question=" + question +
                '}';
    }
}

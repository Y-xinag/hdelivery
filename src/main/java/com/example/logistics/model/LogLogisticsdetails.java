package com.example.logistics.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
public class LogLogisticsdetails implements Serializable {
    private Integer id;

    private String logisticsint;

    private String companyname;

    private Date expectarrivaldate;

    private Date actualarrivaldate;

    private Date expectdeparturedate;

    private Date actualdeparturedate;

    private String operationperson;

    private String logisticstype;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogisticsint() {
        return logisticsint;
    }

    public void setLogisticsint(String logisticsint) {
        this.logisticsint = logisticsint == null ? null : logisticsint.trim();
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public Date getExpectarrivaldate() {
        return expectarrivaldate;
    }

    public void setExpectarrivaldate(Date expectarrivaldate) {
        this.expectarrivaldate = expectarrivaldate;
    }

    public Date getActualarrivaldate() {
        return actualarrivaldate;
    }

    public void setActualarrivaldate(Date actualarrivaldate) {
        this.actualarrivaldate = actualarrivaldate;
    }

    public Date getExpectdeparturedate() {
        return expectdeparturedate;
    }

    public void setExpectdeparturedate(Date expectdeparturedate) {
        this.expectdeparturedate = expectdeparturedate;
    }

    public Date getActualdeparturedate() {
        return actualdeparturedate;
    }

    public void setActualdeparturedate(Date actualdeparturedate) {
        this.actualdeparturedate = actualdeparturedate;
    }

    public String getOperationperson() {
        return operationperson;
    }

    public void setOperationperson(String operationperson) {
        this.operationperson = operationperson == null ? null : operationperson.trim();
    }

    public String getLogisticstype() {
        return logisticstype;
    }

    public void setLogisticstype(String logisticstype) {
        this.logisticstype = logisticstype == null ? null : logisticstype.trim();
    }

    @Override
    public String toString() {
        return "LogLogisticsdetails{" +
                "id=" + id +
                ", logisticsint='" + logisticsint + '\'' +
                ", companyname='" + companyname + '\'' +
                ", expectarrivaldate=" + expectarrivaldate +
                ", actualarrivaldate=" + actualarrivaldate +
                ", expectdeparturedate=" + expectdeparturedate +
                ", actualdeparturedate=" + actualdeparturedate +
                ", operationperson='" + operationperson + '\'' +
                ", logisticstype='" + logisticstype + '\'' +
                '}';
    }
}
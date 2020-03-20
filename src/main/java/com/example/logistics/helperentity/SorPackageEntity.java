package com.example.logistics.helperentity;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
public class SorPackageEntity implements Serializable {
    private int id;
    private String sealint;
    private String empname;
    private String destination;
    private int destroyperson;
    private String arriveplace;
    private Date timelimit;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSealint() {
        return sealint;
    }

    public void setSealint(String sealint) {
        this.sealint = sealint;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDestroyperson() {
        return destroyperson;
    }

    public void setDestroyperson(int destroyperson) {
        this.destroyperson = destroyperson;
    }

    public String getArriveplace() {
        return arriveplace;
    }

    public void setArriveplace(String arriveplace) {
        this.arriveplace = arriveplace;
    }

    public Date getTimelimit() {
        return timelimit;
    }

    public void setTimelimit(Date timelimit) {
        this.timelimit = timelimit;
    }

    @Override
    public String toString() {
        return "SorPackageEntity{" +
                "id=" + id +
                ", sealint='" + sealint + '\'' +
                ", empname='" + empname + '\'' +
                ", destination='" + destination + '\'' +
                ", destroyperson=" + destroyperson +
                ", arriveplace='" + arriveplace + '\'' +
                ", timelimit=" + timelimit +
                '}';
    }
}

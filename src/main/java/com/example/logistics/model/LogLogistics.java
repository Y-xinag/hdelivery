package com.example.logistics.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class LogLogistics implements Serializable {
    private Integer id;

    private String logisticsint;

    private String linename;

    private String startcompany;

    private String generateperson;

    private String carint;

    private String driver;

    private String driverphone;

    private String cartype;

    private Boolean logisticsstate;

    private Boolean iscancel;

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

    public String getLinename() {
        return linename;
    }

    public void setLinename(String linename) {
        this.linename = linename == null ? null : linename.trim();
    }

    public String getStartcompany() {
        return startcompany;
    }

    public void setStartcompany(String startcompany) {
        this.startcompany = startcompany == null ? null : startcompany.trim();
    }

    public String getGenerateperson() {
        return generateperson;
    }

    public void setGenerateperson(String generateperson) {
        this.generateperson = generateperson == null ? null : generateperson.trim();
    }

    public String getCarint() {
        return carint;
    }

    public void setCarint(String carint) {
        this.carint = carint == null ? null : carint.trim();
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver == null ? null : driver.trim();
    }

    public String getDriverphone() {
        return driverphone;
    }

    public void setDriverphone(String driverphone) {
        this.driverphone = driverphone == null ? null : driverphone.trim();
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype == null ? null : cartype.trim();
    }

    public Boolean getLogisticsstate() {
        return logisticsstate;
    }

    public void setLogisticsstate(Boolean logisticsstate) {
        this.logisticsstate = logisticsstate;
    }

    public Boolean getIscancel() {
        return iscancel;
    }

    public void setIscancel(Boolean iscancel) {
        this.iscancel = iscancel;
    }

    @Override
    public String toString() {
        return "LogLogistics{" +
                "id=" + id +
                ", logisticsint='" + logisticsint + '\'' +
                ", linename='" + linename + '\'' +
                ", startcompany='" + startcompany + '\'' +
                ", generateperson='" + generateperson + '\'' +
                ", carint='" + carint + '\'' +
                ", driver='" + driver + '\'' +
                ", driverphone='" + driverphone + '\'' +
                ", cartype='" + cartype + '\'' +
                ", logisticsstate=" + logisticsstate +
                ", iscancel=" + iscancel +
                '}';
    }
}
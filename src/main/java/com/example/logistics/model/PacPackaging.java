package com.example.logistics.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Component
public class PacPackaging implements Serializable {
    private Integer id;

    private String itemcode;

    private String itemname;

    private BigDecimal plannedprice;

    private String specifications;

    private Boolean type;

    private String measurementunit;

    private Boolean status;

    private Integer operatorid;

    private Integer operationunitid;

    private Date operationtime;

    private Integer invalidatejobint;

    private Integer invalidatename;

    private Date invalidatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode == null ? null : itemcode.trim();
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname == null ? null : itemname.trim();
    }

    public BigDecimal getPlannedprice() {
        return plannedprice;
    }

    public void setPlannedprice(BigDecimal plannedprice) {
        this.plannedprice = plannedprice;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications == null ? null : specifications.trim();
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public String getMeasurementunit() {
        return measurementunit;
    }

    public void setMeasurementunit(String measurementunit) {
        this.measurementunit = measurementunit == null ? null : measurementunit.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(Integer operatorid) {
        this.operatorid = operatorid;
    }

    public Integer getOperationunitid() {
        return operationunitid;
    }

    public void setOperationunitid(Integer operationunitid) {
        this.operationunitid = operationunitid;
    }

    public Date getOperationtime() {
        return operationtime;
    }

    public void setOperationtime(Date operationtime) {
        this.operationtime = operationtime;
    }

    public Integer getInvalidatejobint() {
        return invalidatejobint;
    }

    public void setInvalidatejobint(Integer invalidatejobint) {
        this.invalidatejobint = invalidatejobint;
    }

    public Integer getInvalidatename() {
        return invalidatename;
    }

    public void setInvalidatename(Integer invalidatename) {
        this.invalidatename = invalidatename;
    }

    public Date getInvalidatetime() {
        return invalidatetime;
    }

    public void setInvalidatetime(Date invalidatetime) {
        this.invalidatetime = invalidatetime;
    }

    @Override
    public String toString() {
        return "PacPackaging{" +
                "id=" + id +
                ", itemcode='" + itemcode + '\'' +
                ", itemname='" + itemname + '\'' +
                ", plannedprice=" + plannedprice +
                ", specifications='" + specifications + '\'' +
                ", type=" + type +
                ", measurementunit='" + measurementunit + '\'' +
                ", status=" + status +
                ", operatorid=" + operatorid +
                ", operationunitid=" + operationunitid +
                ", operationtime=" + operationtime +
                ", invalidatejobint=" + invalidatejobint +
                ", invalidatename=" + invalidatename +
                ", invalidatetime=" + invalidatetime +
                '}';
    }
}
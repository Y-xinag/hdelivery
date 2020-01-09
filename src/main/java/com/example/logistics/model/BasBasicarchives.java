package com.example.logistics.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
public class BasBasicarchives implements Serializable {
    private Integer id;

    private String name;

    private Boolean grade;

    private Integer operatorid;

    private Integer operationunitid;

    private String remarks;

    private Date operationtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Boolean getGrade() {
        return grade;
    }

    public void setGrade(Boolean grade) {
        this.grade = grade;
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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Date getOperationtime() {
        return operationtime;
    }

    public void setOperationtime(Date operationtime) {
        this.operationtime = operationtime;
    }

    @Override
    public String toString() {
        return "BasBasicarchives{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", operatorid=" + operatorid +
                ", operationunitid=" + operationunitid +
                ", remarks='" + remarks + '\'' +
                ", operationtime=" + operationtime +
                '}';
    }
}
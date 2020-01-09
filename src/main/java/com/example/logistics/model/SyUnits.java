package com.example.logistics.model;

import java.io.Serializable;
import java.util.Date;

/*
* @Description  员工单位表
* */
public class SyUnits implements Serializable {

    private static final long serialVersionUID = -5141599104700198920L;

    private Integer id;

    private String name;

    private String remarks;

    private Integer operatorid;

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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(Integer operatorid) {
        this.operatorid = operatorid;
    }

    public Date getOperationtime() {
        return operationtime;
    }

    public void setOperationtime(Date operationtime) {
        this.operationtime = operationtime;
    }
}
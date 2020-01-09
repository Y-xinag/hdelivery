package com.example.logistics.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;
@Component
public class DisWorkordersign implements Serializable {
    private Integer id;

    private Integer workorderid;

    private String worksheetno;

    private Boolean workordertype;

    private Boolean signtype;

    private Integer courierint;

    private String couriername;

    private String recipient;

    private Integer signunit;

    private Date signtime;

    private Boolean invalidatemark;

    private String abnormalmark;

    private Integer inputpersoncode;

    private Integer inputpersonid;

    private Integer inputid;

    private Date inputtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWorkorderid() {
        return workorderid;
    }

    public void setWorkorderid(Integer workorderid) {
        this.workorderid = workorderid;
    }

    public String getWorksheetno() {
        return worksheetno;
    }

    public void setWorksheetno(String worksheetno) {
        this.worksheetno = worksheetno == null ? null : worksheetno.trim();
    }

    public Boolean getWorkordertype() {
        return workordertype;
    }

    public void setWorkordertype(Boolean workordertype) {
        this.workordertype = workordertype;
    }

    public Boolean getSigntype() {
        return signtype;
    }

    public void setSigntype(Boolean signtype) {
        this.signtype = signtype;
    }

    public Integer getCourierint() {
        return courierint;
    }

    public void setCourierint(Integer courierint) {
        this.courierint = courierint;
    }

    public String getCouriername() {
        return couriername;
    }

    public void setCouriername(String couriername) {
        this.couriername = couriername == null ? null : couriername.trim();
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient == null ? null : recipient.trim();
    }

    public Integer getSignunit() {
        return signunit;
    }

    public void setSignunit(Integer signunit) {
        this.signunit = signunit;
    }

    public Date getSigntime() {
        return signtime;
    }

    public void setSigntime(Date signtime) {
        this.signtime = signtime;
    }

    public Boolean getInvalidatemark() {
        return invalidatemark;
    }

    public void setInvalidatemark(Boolean invalidatemark) {
        this.invalidatemark = invalidatemark;
    }

    public String getAbnormalmark() {
        return abnormalmark;
    }

    public void setAbnormalmark(String abnormalmark) {
        this.abnormalmark = abnormalmark == null ? null : abnormalmark.trim();
    }

    public Integer getInputpersoncode() {
        return inputpersoncode;
    }

    public void setInputpersoncode(Integer inputpersoncode) {
        this.inputpersoncode = inputpersoncode;
    }

    public Integer getInputpersonid() {
        return inputpersonid;
    }

    public void setInputpersonid(Integer inputpersonid) {
        this.inputpersonid = inputpersonid;
    }

    public Integer getInputid() {
        return inputid;
    }

    public void setInputid(Integer inputid) {
        this.inputid = inputid;
    }

    public Date getInputtime() {
        return inputtime;
    }

    public void setInputtime(Date inputtime) {
        this.inputtime = inputtime;
    }

    @Override
    public String toString() {
        return "DisWorkordersign{" +
                "id=" + id +
                ", workorderid=" + workorderid +
                ", worksheetno='" + worksheetno + '\'' +
                ", workordertype=" + workordertype +
                ", signtype=" + signtype +
                ", courierint=" + courierint +
                ", couriername='" + couriername + '\'' +
                ", recipient='" + recipient + '\'' +
                ", signunit=" + signunit +
                ", signtime=" + signtime +
                ", invalidatemark=" + invalidatemark +
                ", abnormalmark='" + abnormalmark + '\'' +
                ", inputpersoncode=" + inputpersoncode +
                ", inputpersonid=" + inputpersonid +
                ", inputid=" + inputid +
                ", inputtime=" + inputtime +
                '}';
    }
}
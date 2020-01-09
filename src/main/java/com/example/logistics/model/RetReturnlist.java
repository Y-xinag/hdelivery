package com.example.logistics.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
public class RetReturnlist extends RetReturnlistKey implements Serializable {
    private String worksheetno;

    private Boolean returntype;

    private String apremark;

    private Integer aploss;

    private Date entrytime;

    private Integer receivegunit;

    private Boolean invalidatesign;

    private Integer returnunit;

    private Date recordingtime;

    private Integer entryunit;

    private String personname;

    private Date confirmationtime;

    private Integer confirmationunit;

    private String confirmationpersonname;

    private Boolean treatmentstate;

    private Boolean apreturnstatus;

    private Boolean identificationsign;

    private String handlingopinions;

    private String denialtype;

    public String getWorksheetno() {
        return worksheetno;
    }

    public void setWorksheetno(String worksheetno) {
        this.worksheetno = worksheetno == null ? null : worksheetno.trim();
    }

    public Boolean getReturntype() {
        return returntype;
    }

    public void setReturntype(Boolean returntype) {
        this.returntype = returntype;
    }

    public String getApremark() {
        return apremark;
    }

    public void setApremark(String apremark) {
        this.apremark = apremark == null ? null : apremark.trim();
    }

    public Integer getAploss() {
        return aploss;
    }

    public void setAploss(Integer aploss) {
        this.aploss = aploss;
    }

    public Date getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(Date entrytime) {
        this.entrytime = entrytime;
    }

    public Integer getReceivegunit() {
        return receivegunit;
    }

    public void setReceivegunit(Integer receivegunit) {
        this.receivegunit = receivegunit;
    }

    public Boolean getInvalidatesign() {
        return invalidatesign;
    }

    public void setInvalidatesign(Boolean invalidatesign) {
        this.invalidatesign = invalidatesign;
    }

    public Integer getReturnunit() {
        return returnunit;
    }

    public void setReturnunit(Integer returnunit) {
        this.returnunit = returnunit;
    }

    public Date getRecordingtime() {
        return recordingtime;
    }

    public void setRecordingtime(Date recordingtime) {
        this.recordingtime = recordingtime;
    }

    public Integer getEntryunit() {
        return entryunit;
    }

    public void setEntryunit(Integer entryunit) {
        this.entryunit = entryunit;
    }

    public String getPersonname() {
        return personname;
    }

    public void setPersonname(String personname) {
        this.personname = personname == null ? null : personname.trim();
    }

    public Date getConfirmationtime() {
        return confirmationtime;
    }

    public void setConfirmationtime(Date confirmationtime) {
        this.confirmationtime = confirmationtime;
    }

    public Integer getConfirmationunit() {
        return confirmationunit;
    }

    public void setConfirmationunit(Integer confirmationunit) {
        this.confirmationunit = confirmationunit;
    }

    public String getConfirmationpersonname() {
        return confirmationpersonname;
    }

    public void setConfirmationpersonname(String confirmationpersonname) {
        this.confirmationpersonname = confirmationpersonname == null ? null : confirmationpersonname.trim();
    }

    public Boolean getTreatmentstate() {
        return treatmentstate;
    }

    public void setTreatmentstate(Boolean treatmentstate) {
        this.treatmentstate = treatmentstate;
    }

    public Boolean getApreturnstatus() {
        return apreturnstatus;
    }

    public void setApreturnstatus(Boolean apreturnstatus) {
        this.apreturnstatus = apreturnstatus;
    }

    public Boolean getIdentificationsign() {
        return identificationsign;
    }

    public void setIdentificationsign(Boolean identificationsign) {
        this.identificationsign = identificationsign;
    }

    public String getHandlingopinions() {
        return handlingopinions;
    }

    public void setHandlingopinions(String handlingopinions) {
        this.handlingopinions = handlingopinions == null ? null : handlingopinions.trim();
    }

    public String getDenialtype() {
        return denialtype;
    }

    public void setDenialtype(String denialtype) {
        this.denialtype = denialtype == null ? null : denialtype.trim();
    }

    @Override
    public String toString() {
        return "RetReturnlist{" +
                "worksheetno='" + worksheetno + '\'' +
                ", returntype=" + returntype +
                ", apremark='" + apremark + '\'' +
                ", aploss=" + aploss +
                ", entrytime=" + entrytime +
                ", receivegunit=" + receivegunit +
                ", invalidatesign=" + invalidatesign +
                ", returnunit=" + returnunit +
                ", recordingtime=" + recordingtime +
                ", entryunit=" + entryunit +
                ", personname='" + personname + '\'' +
                ", confirmationtime=" + confirmationtime +
                ", confirmationunit=" + confirmationunit +
                ", confirmationpersonname='" + confirmationpersonname + '\'' +
                ", treatmentstate=" + treatmentstate +
                ", apreturnstatus=" + apreturnstatus +
                ", identificationsign=" + identificationsign +
                ", handlingopinions='" + handlingopinions + '\'' +
                ", denialtype='" + denialtype + '\'' +
                '}';
    }
}
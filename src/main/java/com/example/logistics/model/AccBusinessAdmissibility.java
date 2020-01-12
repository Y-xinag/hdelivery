package com.example.logistics.model;

import java.io.Serializable;
import java.util.Date;

public class AccBusinessAdmissibility implements Serializable {
    private String businessNoticeNo;
    private Date reservationTime;
    private String customName;
    private String pickupAddress;
    private int customCode;
    private String linkman;
    private String telPhone;
    private Double weight;
    private Double volume;
    private String importantHints;
    private String arriveCity;
    private int pickerInfo;
    private String sendAddress;
    private int processingUnit;
    private Boolean notificationSource;
    private Boolean customNoModifyFlag;
    private String singleType;
    private int packagesNum;
    private Double actualWeight;
    private Double billingWeight;
    private Double packingFee;
    private Boolean actualPacking;


    public String getBusinessNoticeNo() {
        return businessNoticeNo;
    }

    public void setBusinessNoticeNo(String businessNoticeNo) {
        this.businessNoticeNo = businessNoticeNo;
    }

    public Date ReservationTime() {
        return reservationTime;
    }

    public void setReservationTime(Date reservationTime) {
        this.reservationTime = reservationTime;
    }

    public String getCustomName() {
        return customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName;
    }

    public String getPickupAddress() {
        return pickupAddress;
    }

    public void setPickupAddress(String pickupAddress) {
        this.pickupAddress = pickupAddress;
    }

    public int getCustomCode() {
        return customCode;
    }

    public void setCustomCode(int customCode) {
        this.customCode = customCode;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getTelPhone() {
        return telPhone;
    }

    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public String getImportantHints() {
        return importantHints;
    }

    public void setImportantHints(String importantHints) {
        this.importantHints = importantHints;
    }

    public String getArriveCity() {
        return arriveCity;
    }

    public void setArriveCity(String arriveCity) {
        this.arriveCity = arriveCity;
    }

    public int getPickerInfo() {
        return pickerInfo;
    }

    public void setPickerInfo(int pickerInfo) {
        this.pickerInfo = pickerInfo;
    }

    public String getSendAddress() {
        return sendAddress;
    }

    public void setSendAddress(String sendAddress) {
        this.sendAddress = sendAddress;
    }

    public int getProcessingUnit() {
        return processingUnit;
    }

    public void setProcessingUnit(int processingUnit) {
        this.processingUnit = processingUnit;
    }

    public Boolean getNotificationSource() {
        return notificationSource;
    }

    public void setNotificationSource(Boolean notificationSource) {
        this.notificationSource = notificationSource;
    }

    public Boolean getCustomNoModifyFlag() {
        return customNoModifyFlag;
    }

    public void setCustomNoModifyFlag(Boolean customNoModifyFlag) {
        this.customNoModifyFlag = customNoModifyFlag;
    }

    public String getSingleType() {
        return singleType;
    }

    public void setSingleType(String singleType) {
        this.singleType = singleType;
    }

    public int getPackagesNum() {
        return packagesNum;
    }

    public void setPackagesNum(int packagesNum) {
        this.packagesNum = packagesNum;
    }

    public Double getActualWeight() {
        return actualWeight;
    }

    public void setActualWeight(Double actualWeight) {
        this.actualWeight = actualWeight;
    }

    public Double getBillingWeight() {
        return billingWeight;
    }

    public void setBillingWeight(Double billingWeight) {
        this.billingWeight = billingWeight;
    }

    public Double getPackingFee() {
        return packingFee;
    }

    public void setPackingFee(Double packingFee) {
        this.packingFee = packingFee;
    }

    public Boolean getActualPacking() {
        return actualPacking;
    }

    public void setActualPacking(Boolean actualPacking) {
        this.actualPacking = actualPacking;
    }

    @Override
    public String toString() {
        return "AccBusinessAdmissibility{" +
                "businessNoticeNo='" + businessNoticeNo + '\'' +
                ", reservationTime=" + reservationTime +
                ", customName='" + customName + '\'' +
                ", pickupAddress='" + pickupAddress + '\'' +
                ", customCode=" + customCode +
                ", linkman='" + linkman + '\'' +
                ", telPhone='" + telPhone + '\'' +
                ", weight=" + weight +
                ", volume=" + volume +
                ", importantHints='" + importantHints + '\'' +
                ", arriveCity='" + arriveCity + '\'' +
                ", pickerInfo=" + pickerInfo +
                ", sendAddress='" + sendAddress + '\'' +
                ", processingUnit=" + processingUnit +
                ", notificationSource=" + notificationSource +
                ", customNoModifyFlag=" + customNoModifyFlag +
                ", singleType='" + singleType + '\'' +
                ", packagesNum=" + packagesNum +
                ", actualWeight=" + actualWeight +
                ", billingWeight=" + billingWeight +
                ", packingFee=" + packingFee +
                ", actualPacking=" + actualPacking +
                '}';
    }
}

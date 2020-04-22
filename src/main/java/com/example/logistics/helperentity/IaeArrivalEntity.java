package com.example.logistics.helperentity;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
public class IaeArrivalEntity implements Serializable {
    private String id;
    private String sendcompany;
    private String cargoaddress;
    private Date storagedate;
    private Date timelimit;
    private Date batch;
    private String carrier;
    private String acceptcompany;
    private String abnormalremarks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSendcompany() {
        return sendcompany;
    }

    public void setSendcompany(String sendcompany) {
        this.sendcompany = sendcompany;
    }

    public String getCargoaddress() {
        return cargoaddress;
    }

    public void setCargoaddress(String cargoaddress) {
        this.cargoaddress = cargoaddress;
    }

    public Date getStoragedate() {
        return storagedate;
    }

    public void setStoragedate(Date storagedate) {
        this.storagedate = storagedate;
    }

    public Date getTimelimit() {
        return timelimit;
    }

    public void setTimelimit(Date timelimit) {
        this.timelimit = timelimit;
    }

    public Date getBatch() {
        return batch;
    }

    public void setBatch(Date batch) {
        this.batch = batch;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getAcceptcompany() {
        return acceptcompany;
    }

    public void setAcceptcompany(String acceptcompany) {
        this.acceptcompany = acceptcompany;
    }

    public String getAbnormalremarks() {
        return abnormalremarks;
    }

    public void setAbnormalremarks(String abnormalremarks) {
        this.abnormalremarks = abnormalremarks;
    }

    @Override
    public String toString() {
        return "IaeArrivalEntity{" +
                "id='" + id + '\'' +
                ", sendcompany='" + sendcompany + '\'' +
                ", cargoaddress='" + cargoaddress + '\'' +
                ", storagedate=" + storagedate +
                ", timelimit=" + timelimit +
                ", batch=" + batch +
                ", carrier='" + carrier + '\'' +
                ", acceptcompany='" + acceptcompany + '\'' +
                ", abnormalremarks='" + abnormalremarks + '\'' +
                '}';
    }
}

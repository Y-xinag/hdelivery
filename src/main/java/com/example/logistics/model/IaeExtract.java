package com.example.logistics.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;
@Component
public class IaeExtract implements Serializable {
    private String id;

    private String vehicleint;

    private String transportway;

    private String waybillid;

    private Date estimatedate;

    private Integer cargon;

    private String importanthints;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getVehicleint() {
        return vehicleint;
    }

    public void setVehicleint(String vehicleint) {
        this.vehicleint = vehicleint == null ? null : vehicleint.trim();
    }

    public String getTransportway() {
        return transportway;
    }

    public void setTransportway(String transportway) {
        this.transportway = transportway == null ? null : transportway.trim();
    }

    public String getWaybillid() {
        return waybillid;
    }

    public void setWaybillid(String waybillid) {
        this.waybillid = waybillid == null ? null : waybillid.trim();
    }

    public Date getEstimatedate() {
        return estimatedate;
    }

    public void setEstimatedate(Date estimatedate) {
        this.estimatedate = estimatedate;
    }

    public Integer getCargon() {
        return cargon;
    }

    public void setCargon(Integer cargon) {
        this.cargon = cargon;
    }

    public String getImportanthints() {
        return importanthints;
    }

    public void setImportanthints(String importanthints) {
        this.importanthints = importanthints == null ? null : importanthints.trim();
    }

    @Override
    public String toString() {
        return "IaeExtract{" +
                "id='" + id + '\'' +
                ", vehicleint='" + vehicleint + '\'' +
                ", transportway='" + transportway + '\'' +
                ", waybillid='" + waybillid + '\'' +
                ", estimatedate=" + estimatedate +
                ", cargon=" + cargon +
                ", importanthints='" + importanthints + '\'' +
                '}';
    }
}
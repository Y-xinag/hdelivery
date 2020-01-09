package com.example.logistics.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
public class PacStock implements Serializable {
    private String warehouseno;

    private Boolean reservoirtype;

    private String transport;

    private String subordinateunit;

    private Integer drawerno;

    private String drawername;

    private Date drawertime;

    private String remark;

    public String getWarehouseno() {
        return warehouseno;
    }

    public void setWarehouseno(String warehouseno) {
        this.warehouseno = warehouseno == null ? null : warehouseno.trim();
    }

    public Boolean getReservoirtype() {
        return reservoirtype;
    }

    public void setReservoirtype(Boolean reservoirtype) {
        this.reservoirtype = reservoirtype;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport == null ? null : transport.trim();
    }

    public String getSubordinateunit() {
        return subordinateunit;
    }

    public void setSubordinateunit(String subordinateunit) {
        this.subordinateunit = subordinateunit == null ? null : subordinateunit.trim();
    }

    public Integer getDrawerno() {
        return drawerno;
    }

    public void setDrawerno(Integer drawerno) {
        this.drawerno = drawerno;
    }

    public String getDrawername() {
        return drawername;
    }

    public void setDrawername(String drawername) {
        this.drawername = drawername == null ? null : drawername.trim();
    }

    public Date getDrawertime() {
        return drawertime;
    }

    public void setDrawertime(Date drawertime) {
        this.drawertime = drawertime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        return "PacStock{" +
                "warehouseno='" + warehouseno + '\'' +
                ", reservoirtype=" + reservoirtype +
                ", transport='" + transport + '\'' +
                ", subordinateunit='" + subordinateunit + '\'' +
                ", drawerno=" + drawerno +
                ", drawername='" + drawername + '\'' +
                ", drawertime=" + drawertime +
                ", remark='" + remark + '\'' +
                '}';
    }
}
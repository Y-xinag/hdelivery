package com.example.logistics.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class PacStockitemKey implements Serializable {
    private Integer id;

    private String warehouseno;

    private String goodscode;

    private Integer actualnum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWarehouseno() {
        return warehouseno;
    }

    public void setWarehouseno(String warehouseno) {
        this.warehouseno = warehouseno == null ? null : warehouseno.trim();
    }

    public String getGoodscode() {
        return goodscode;
    }

    public void setGoodscode(String goodscode) {
        this.goodscode = goodscode == null ? null : goodscode.trim();
    }

    public Integer getActualnum() {
        return actualnum;
    }

    public void setActualnum(Integer actualnum) {
        this.actualnum = actualnum;
    }

    @Override
    public String toString() {
        return "PacStockitemKey{" +
                "id=" + id +
                ", warehouseno='" + warehouseno + '\'' +
                ", goodscode='" + goodscode + '\'' +
                ", actualnum=" + actualnum +
                '}';
    }
}
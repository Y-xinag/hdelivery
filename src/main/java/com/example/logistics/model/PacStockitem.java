package com.example.logistics.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.math.BigDecimal;

@Component
public class PacStockitem extends PacStockitemKey implements Serializable {
    private String goodsname;

    private Integer storagenum;

    private BigDecimal plannedprice;

    private String specifications;

    private Boolean type;

    private Boolean status;

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public Integer getStoragenum() {
        return storagenum;
    }

    public void setStoragenum(Integer storagenum) {
        this.storagenum = storagenum;
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PacStockitem{" +
                "goodsname='" + goodsname + '\'' +
                ", storagenum=" + storagenum +
                ", plannedprice=" + plannedprice +
                ", specifications='" + specifications + '\'' +
                ", type=" + type +
                ", status=" + status +
                '}';
    }
}
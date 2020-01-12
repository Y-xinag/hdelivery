package com.example.logistics.model;



import java.util.Date;
import java.io.Serializable;
import java.util.List;

public class Bus1Result implements Serializable {
    private int customCode;
    private BasZonecustominfo basZonecustominfo;
    private List<AccBusinessAdmissibility> accBusinessAdmissibilities;


    public int getCustomCode() {
        return customCode;
    }

    public void setCustomCode(int customCode) {
        this.customCode = customCode;
    }

    public BasZonecustominfo getBasZonecustominfo() {
        return basZonecustominfo;
    }

    public void setBasZonecustominfo(BasZonecustominfo basZonecustominfo) {
        this.basZonecustominfo = basZonecustominfo;
    }

    public List<AccBusinessAdmissibility> getAccBusinessAdmissibilities() {
        return accBusinessAdmissibilities;
    }

    public void setAccBusinessAdmissibilities(List<AccBusinessAdmissibility> accBusinessAdmissibilities) {
        this.accBusinessAdmissibilities = accBusinessAdmissibilities;
    }
}

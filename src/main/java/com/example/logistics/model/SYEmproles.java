package com.example.logistics.model;

import java.io.Serializable;

/*
* @Description 员工角色表
* */
public class SYEmproles implements Serializable {

    private Integer id;

    private Integer empid;

    private Integer roleid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }
}

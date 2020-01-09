package com.example.logistics.model;

import java.io.Serializable;

/*
* @Description 角色权限表
* */
public class SyRolesmenus implements Serializable {


    private static final long serialVersionUID = 2349822912566416090L;

    private Integer id;

    private Integer roleid;

    private Integer menuid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getMenuid() {
        return menuid;
    }

    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }
}
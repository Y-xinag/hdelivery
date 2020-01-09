package com.example.logistics.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class SyRolesmenus implements Serializable {
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

    @Override
    public String toString() {
        return "SyRolesmenus{" +
                "id=" + id +
                ", roleid=" + roleid +
                ", menuid=" + menuid +
                '}';
    }
}
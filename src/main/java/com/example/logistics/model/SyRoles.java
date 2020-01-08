package com.example.logistics.model;

import java.io.Serializable;
import java.util.Set;

/*
* @Description 角色表
* */
public class SyRoles implements Serializable {

    private static final long serialVersionUID = 3020593018769358424L;

    private Integer id;

    private String rolename;

    private String roledesc;

    private Boolean disabled;

    //当前角色的权限
    private Set<SyMenus> symenus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getRoledesc() {
        return roledesc;
    }

    public void setRoledesc(String roledesc) {
        this.roledesc = roledesc == null ? null : roledesc.trim();
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public Set<SyMenus> getSymenus() {
        return symenus;
    }

    public void setSymenus(Set<SyMenus> symenus) {
        this.symenus = symenus;
    }
}
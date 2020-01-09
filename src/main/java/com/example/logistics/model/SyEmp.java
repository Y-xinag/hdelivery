package com.example.logistics.model;

import java.io.Serializable;
import java.util.Set;

/*
*  @Description 员工实体类
* */
public class SyEmp implements Serializable {

    private static final long serialVersionUID = -3922961171777546549L;

    private Integer id;

    private String empname;

    private String empno;

    private String pwd;

    private String querypwd;

    private Integer roleid;

    private Integer empunit;

    private String remark;

    private Boolean disabled;

    //角色表
    private Set<SyRoles> syroles;

    //权限表（栏目表）
    private Set<SyMenus> symenus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname == null ? null : empname.trim();
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno == null ? null : empno.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getQuerypwd() {
        return querypwd;
    }

    public void setQuerypwd(String querypwd) {
        this.querypwd = querypwd == null ? null : querypwd.trim();
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getEmpunit() {
        return empunit;
    }

    public void setEmpunit(Integer empunit) {
        this.empunit = empunit;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public Set<SyRoles> getSyroles() {
        return syroles;
    }

    public void setSyroles(Set<SyRoles> syroles) {
        this.syroles = syroles;
    }

    public Set<SyMenus> getSymenus() {
        return symenus;
    }

    public void setSymenus(Set<SyMenus> symenus) {
        this.symenus = symenus;
    }
}
package com.example.logistics.model;

import sun.plugin2.message.Serializer;

import java.io.Serializable;

/*
* @Description 权限栏目表（菜单表）
* */
public class SyMenus implements Serializable {

    private static final long serialVersionUID = 4831280739034281758L;

    //编号
    private Integer id;

    //上级栏目编号
    private String parentid;

    //栏目类型
    private String type;

    //栏目名称
    private String text;

    //栏目地址
    private String url;

    //栏目提示语
    private String tip;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}
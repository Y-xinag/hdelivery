package com.example.logistics.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Arrays;

@Component
public class SyMenusWithBLOBs extends SyMenus implements Serializable {
    private byte[] text;

    private byte[] url;

    private byte[] tip;

    public byte[] getText() {
        return text;
    }

    public void setText(byte[] text) {
        this.text = text;
    }

    public byte[] getUrl() {
        return url;
    }

    public void setUrl(byte[] url) {
        this.url = url;
    }

    public byte[] getTip() {
        return tip;
    }

    public void setTip(byte[] tip) {
        this.tip = tip;
    }

    @Override
    public String toString() {
        return "SyMenusWithBLOBs{" +
                "text=" + Arrays.toString(text) +
                ", url=" + Arrays.toString(url) +
                ", tip=" + Arrays.toString(tip) +
                '}';
    }
}
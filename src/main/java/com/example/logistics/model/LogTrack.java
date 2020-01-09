package com.example.logistics.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
public class LogTrack implements Serializable {
    private Integer id;

    private String linetype;

    private String linename;

    private String logisticscar;

    private Boolean linestate;

    private String nodename;

    private Date starttime;

    private Date arrivaltime;

    private String carint;

    private String nextnodeload;

    private String describes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLinetype() {
        return linetype;
    }

    public void setLinetype(String linetype) {
        this.linetype = linetype == null ? null : linetype.trim();
    }

    public String getLinename() {
        return linename;
    }

    public void setLinename(String linename) {
        this.linename = linename == null ? null : linename.trim();
    }

    public String getLogisticscar() {
        return logisticscar;
    }

    public void setLogisticscar(String logisticscar) {
        this.logisticscar = logisticscar == null ? null : logisticscar.trim();
    }

    public Boolean getLinestate() {
        return linestate;
    }

    public void setLinestate(Boolean linestate) {
        this.linestate = linestate;
    }

    public String getNodename() {
        return nodename;
    }

    public void setNodename(String nodename) {
        this.nodename = nodename == null ? null : nodename.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getArrivaltime() {
        return arrivaltime;
    }

    public void setArrivaltime(Date arrivaltime) {
        this.arrivaltime = arrivaltime;
    }

    public String getCarint() {
        return carint;
    }

    public void setCarint(String carint) {
        this.carint = carint == null ? null : carint.trim();
    }

    public String getNextnodeload() {
        return nextnodeload;
    }

    public void setNextnodeload(String nextnodeload) {
        this.nextnodeload = nextnodeload == null ? null : nextnodeload.trim();
    }

    public String getDescribes() {
        return describes;
    }

    public void setDescribes(String describes) {
        this.describes = describes == null ? null : describes.trim();
    }

    @Override
    public String toString() {
        return "LogTrack{" +
                "id=" + id +
                ", linetype='" + linetype + '\'' +
                ", linename='" + linename + '\'' +
                ", logisticscar='" + logisticscar + '\'' +
                ", linestate=" + linestate +
                ", nodename='" + nodename + '\'' +
                ", starttime=" + starttime +
                ", arrivaltime=" + arrivaltime +
                ", carint='" + carint + '\'' +
                ", nextnodeload='" + nextnodeload + '\'' +
                ", describes='" + describes + '\'' +
                '}';
    }
}
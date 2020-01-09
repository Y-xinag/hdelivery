package com.example.logistics.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Component
public class IaeLineresource implements Serializable {
    private String id;

    private String resourcetype;

    private String port;

    private Boolean demand;

    private String vehicleint;

    private String capacity;

    private String waybillid;

    private String carrier;

    private Date expectarrivaldate;

    private Date expectdeparturedate;

    private Integer ticket;

    private Integer cargo;

    private BigDecimal weight;

    private BigDecimal volume;

    private String handleperson;

    private Date handledate;

    private Integer enterperson;

    private Date enterdate;

    private String entercompany;

    private Integer acceptperson;

    private Date acceptdate;

    private String acceptcompany;

    private String abnormalremarks;

    private String workint;

    private Boolean transfer;

    private Integer actualcount;

    private String destination;

    private String warename;

    private BigDecimal actualvolume;

    private Date timelimit;

    private String ask;

    private String takecargoperson;

    private String tackcargoaddress;

    private Integer payment;

    private String specialensure;

    private Boolean deliverytype;

    private String importanthints;

    private Date surplustime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getResourcetype() {
        return resourcetype;
    }

    public void setResourcetype(String resourcetype) {
        this.resourcetype = resourcetype == null ? null : resourcetype.trim();
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port == null ? null : port.trim();
    }

    public Boolean getDemand() {
        return demand;
    }

    public void setDemand(Boolean demand) {
        this.demand = demand;
    }

    public String getVehicleint() {
        return vehicleint;
    }

    public void setVehicleint(String vehicleint) {
        this.vehicleint = vehicleint == null ? null : vehicleint.trim();
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity == null ? null : capacity.trim();
    }

    public String getWaybillid() {
        return waybillid;
    }

    public void setWaybillid(String waybillid) {
        this.waybillid = waybillid == null ? null : waybillid.trim();
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier == null ? null : carrier.trim();
    }

    public Date getExpectarrivaldate() {
        return expectarrivaldate;
    }

    public void setExpectarrivaldate(Date expectarrivaldate) {
        this.expectarrivaldate = expectarrivaldate;
    }

    public Date getExpectdeparturedate() {
        return expectdeparturedate;
    }

    public void setExpectdeparturedate(Date expectdeparturedate) {
        this.expectdeparturedate = expectdeparturedate;
    }

    public Integer getTicket() {
        return ticket;
    }

    public void setTicket(Integer ticket) {
        this.ticket = ticket;
    }

    public Integer getCargo() {
        return cargo;
    }

    public void setCargo(Integer cargo) {
        this.cargo = cargo;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public String getHandleperson() {
        return handleperson;
    }

    public void setHandleperson(String handleperson) {
        this.handleperson = handleperson == null ? null : handleperson.trim();
    }

    public Date getHandledate() {
        return handledate;
    }

    public void setHandledate(Date handledate) {
        this.handledate = handledate;
    }

    public Integer getEnterperson() {
        return enterperson;
    }

    public void setEnterperson(Integer enterperson) {
        this.enterperson = enterperson;
    }

    public Date getEnterdate() {
        return enterdate;
    }

    public void setEnterdate(Date enterdate) {
        this.enterdate = enterdate;
    }

    public String getEntercompany() {
        return entercompany;
    }

    public void setEntercompany(String entercompany) {
        this.entercompany = entercompany == null ? null : entercompany.trim();
    }

    public Integer getAcceptperson() {
        return acceptperson;
    }

    public void setAcceptperson(Integer acceptperson) {
        this.acceptperson = acceptperson;
    }

    public Date getAcceptdate() {
        return acceptdate;
    }

    public void setAcceptdate(Date acceptdate) {
        this.acceptdate = acceptdate;
    }

    public String getAcceptcompany() {
        return acceptcompany;
    }

    public void setAcceptcompany(String acceptcompany) {
        this.acceptcompany = acceptcompany == null ? null : acceptcompany.trim();
    }

    public String getAbnormalremarks() {
        return abnormalremarks;
    }

    public void setAbnormalremarks(String abnormalremarks) {
        this.abnormalremarks = abnormalremarks == null ? null : abnormalremarks.trim();
    }

    public String getWorkint() {
        return workint;
    }

    public void setWorkint(String workint) {
        this.workint = workint == null ? null : workint.trim();
    }

    public Boolean getTransfer() {
        return transfer;
    }

    public void setTransfer(Boolean transfer) {
        this.transfer = transfer;
    }

    public Integer getActualcount() {
        return actualcount;
    }

    public void setActualcount(Integer actualcount) {
        this.actualcount = actualcount;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public String getWarename() {
        return warename;
    }

    public void setWarename(String warename) {
        this.warename = warename == null ? null : warename.trim();
    }

    public BigDecimal getActualvolume() {
        return actualvolume;
    }

    public void setActualvolume(BigDecimal actualvolume) {
        this.actualvolume = actualvolume;
    }

    public Date getTimelimit() {
        return timelimit;
    }

    public void setTimelimit(Date timelimit) {
        this.timelimit = timelimit;
    }

    public String getAsk() {
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask == null ? null : ask.trim();
    }

    public String getTakecargoperson() {
        return takecargoperson;
    }

    public void setTakecargoperson(String takecargoperson) {
        this.takecargoperson = takecargoperson == null ? null : takecargoperson.trim();
    }

    public String getTackcargoaddress() {
        return tackcargoaddress;
    }

    public void setTackcargoaddress(String tackcargoaddress) {
        this.tackcargoaddress = tackcargoaddress == null ? null : tackcargoaddress.trim();
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    public String getSpecialensure() {
        return specialensure;
    }

    public void setSpecialensure(String specialensure) {
        this.specialensure = specialensure == null ? null : specialensure.trim();
    }

    public Boolean getDeliverytype() {
        return deliverytype;
    }

    public void setDeliverytype(Boolean deliverytype) {
        this.deliverytype = deliverytype;
    }

    public String getImportanthints() {
        return importanthints;
    }

    public void setImportanthints(String importanthints) {
        this.importanthints = importanthints == null ? null : importanthints.trim();
    }

    public Date getSurplustime() {
        return surplustime;
    }

    public void setSurplustime(Date surplustime) {
        this.surplustime = surplustime;
    }

    @Override
    public String toString() {
        return "IaeLineresource{" +
                "id='" + id + '\'' +
                ", resourcetype='" + resourcetype + '\'' +
                ", port='" + port + '\'' +
                ", demand=" + demand +
                ", vehicleint='" + vehicleint + '\'' +
                ", capacity='" + capacity + '\'' +
                ", waybillid='" + waybillid + '\'' +
                ", carrier='" + carrier + '\'' +
                ", expectarrivaldate=" + expectarrivaldate +
                ", expectdeparturedate=" + expectdeparturedate +
                ", ticket=" + ticket +
                ", cargo=" + cargo +
                ", weight=" + weight +
                ", volume=" + volume +
                ", handleperson='" + handleperson + '\'' +
                ", handledate=" + handledate +
                ", enterperson=" + enterperson +
                ", enterdate=" + enterdate +
                ", entercompany='" + entercompany + '\'' +
                ", acceptperson=" + acceptperson +
                ", acceptdate=" + acceptdate +
                ", acceptcompany='" + acceptcompany + '\'' +
                ", abnormalremarks='" + abnormalremarks + '\'' +
                ", workint='" + workint + '\'' +
                ", transfer=" + transfer +
                ", actualcount=" + actualcount +
                ", destination='" + destination + '\'' +
                ", warename='" + warename + '\'' +
                ", actualvolume=" + actualvolume +
                ", timelimit=" + timelimit +
                ", ask='" + ask + '\'' +
                ", takecargoperson='" + takecargoperson + '\'' +
                ", tackcargoaddress='" + tackcargoaddress + '\'' +
                ", payment=" + payment +
                ", specialensure='" + specialensure + '\'' +
                ", deliverytype=" + deliverytype +
                ", importanthints='" + importanthints + '\'' +
                ", surplustime=" + surplustime +
                '}';
    }
}
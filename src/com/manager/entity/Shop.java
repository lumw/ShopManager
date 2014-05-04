package com.manager.entity;

import java.sql.Timestamp;

/**
 * <pre>
 * Insert Brief Description Here!
 * 日    期: 2014/5/3 19:39
 * 模    块: 接口
 * 描    述: 商铺信息
 * 备    注:
 * ------------------------------------------------------------
 * 修改历史:
 *
 * 序号    日期          修改人     修改原因
 *  1     2014/5/3       鲁梦维     版本创建
 *
 * </pre>
 */
public class Shop {

    private int shopID;
    private String shopName;
    private int userID;
    private Timestamp createTime;
    private Timestamp endTime;
    private int payType;
    private String address;
    private String telphone;
    private Float floorPrice;
    private Float freight;
    private String NS;
    private String WE;
    private int status;
    private String notice;
    private int ifSmsInform;
    private int ifWechatInform;

    public int getShopID() {
        return shopID;
    }

    public void setShopID(int shopID) {
        this.shopID = shopID;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public int getPayType() {
        return payType;
    }

    public void setPayType(int payType) {
        this.payType = payType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public Float getFloorPrice() {
        return floorPrice;
    }

    public void setFloorPrice(Float floorPrice) {
        this.floorPrice = floorPrice;
    }

    public Float getFreight() {
        return freight;
    }

    public void setFreight(Float freight) {
        this.freight = freight;
    }

    public String getNS() {
        return NS;
    }

    public void setNS(String NS) {
        this.NS = NS;
    }

    public String getWE() {
        return WE;
    }

    public void setWE(String WE) {
        this.WE = WE;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public int getIfSmsInform() {
        return ifSmsInform;
    }

    public void setIfSmsInform(int ifSmsInform) {
        this.ifSmsInform = ifSmsInform;
    }

    public int getIfWechatInform() {
        return ifWechatInform;
    }

    public void setIfWechatInform(int ifWechatInform) {
        this.ifWechatInform = ifWechatInform;
    }
}

package com.manager.entity;

import java.sql.Timestamp;

/**
 * <pre>
 * Insert Brief Description Here!
 * 日    期: 2014/3/25 20:36
 * 模    块: 接口
 * 描    述: 商品信息
 * 备    注:
 * ------------------------------------------------------------
 * 修改历史:
 *
 * 序号    日期          修改人     修改原因
 *  1     2014/3/25       鲁梦维     版本创建
 *
 * </pre>
 */
public class Goods {

    private int shopID;              /*店铺ID*/
    private int goodsTypeID;         /*商品类型编码*/
    private int goodsID;             /*商品ID*/
    private String goodsName;        /*商品名称*/
    private int unitID;              /*计量单位编码*/
    private float price;             /*商品价格*/
    private Timestamp createTime;    /*商品创建时间*/
    private int saleCnt;             /*累计销售次数*/
    private String  actID;           /*活动方案ID*/
    private int status;              /*商品是否下架 0:下架 1:可以购买*/
    private int stock;               /*商品库存*/

    public int getShopID() {
        return shopID;
    }

    public void setShopID(int shopID) {
        this.shopID = shopID;
    }

    public int getGoodsTypeID() {
        return goodsTypeID;
    }

    public void setGoodsTypeID(int goodsTypeID) {
        this.goodsTypeID = goodsTypeID;
    }

    public int getGoodsID() {
        return goodsID;
    }

    public void setGoodsID(int goodsID) {
        this.goodsID = goodsID;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getUnitID() {
        return unitID;
    }

    public void setUnitID(int unitID) {
        this.unitID = unitID;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public int getSaleCnt() {
        return saleCnt;
    }

    public void setSaleCnt(int saleCnt) {
        this.saleCnt = saleCnt;
    }

    public String getActID() {
        return actID;
    }

    public void setActID(String actID) {
        this.actID = actID;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}

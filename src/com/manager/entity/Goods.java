package com.manager.entity;

import java.sql.Timestamp;

/**
 * <pre>
 * Insert Brief Description Here!
 * 日    期: 2014/3/25 20:36
 * 模    块: 接口
 * 描    述:
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

    private int ShopID;              /*店铺ID*/
    private int GoodsTypeID;         /*商品类型编码*/
    private int GoodsID;             /*商品ID*/
    private String GoodsName;        /*商品名称*/
    private int Price;               /*商品价格*/
    private Timestamp CreateTime;    /*商品创建时间*/
    private int SaleCnt;             /*累计销售次数*/
    private String  ActID;           /*活动方案ID*/
    private int Status;              /*商品是否下架 0:下架 1:可以购买*/
    private int Stock;               /*商品库存*/

    public int getShopID() {
        return ShopID;
    }

    public void setShopID(int shopID) {
        ShopID = shopID;
    }

    public int getGoodsTypeID() {
        return GoodsTypeID;
    }

    public void setGoodsTypeID(int goodsTypeID) {
        GoodsTypeID = goodsTypeID;
    }

    public int getGoodsID() {
        return GoodsID;
    }

    public void setGoodsID(int goodsID) {
        GoodsID = goodsID;
    }

    public String getGoodsName() {
        return GoodsName;
    }

    public void setGoodsName(String goodsName) {
        GoodsName = goodsName;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public Timestamp getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Timestamp createTime) {
        CreateTime = createTime;
    }

    public int getSaleCnt() {
        return SaleCnt;
    }

    public void setSaleCnt(int saleCnt) {
        SaleCnt = saleCnt;
    }

    public String getActID() {
        return ActID;
    }

    public void setActID(String actID) {
        ActID = actID;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }
}

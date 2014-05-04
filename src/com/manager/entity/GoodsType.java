package com.manager.entity;

/**
 * <pre>
 * Insert Brief Description Here!
 * 日    期: 2014/3/25 20:34
 * 模    块: 接口
 * 描    述: 商品类型信息
 * 备    注:
 * ------------------------------------------------------------
 * 修改历史:
 *
 * 序号    日期          修改人     修改原因
 *  1     2014/3/25       鲁梦维     版本创建
 *
 * </pre>
 */
public class GoodsType {

    public int shopID;
    public int goodTypeID;
    public String goodTypeName;
    public int status;

    public int getShopID() {
        return shopID;
    }

    public void setShopID(int shopID) {
        this.shopID = shopID;
    }

    public int getGoodTypeID() {
        return goodTypeID;
    }

    public void setGoodTypeID(int goodTypeID) {
        this.goodTypeID = goodTypeID;
    }

    public String getGoodTypeName() {
        return goodTypeName;
    }

    public void setGoodTypeName(String goodTypeName) {
        this.goodTypeName = goodTypeName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

package com.manager.entity;

/**
 * <pre>
 * Insert Brief Description Here!
 * 日    期: 2014/3/25 20:34
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
public class GoodsType {

    public int ShopID;
    public int GoodTypeID;
    public String GoodTypeName;
    public int Status;

    public int getShopID() {
        return ShopID;
    }

    public void setShopID(int shopID) {
        ShopID = shopID;
    }

    public int getGoodTypeID() {
        return GoodTypeID;
    }

    public void setGoodTypeID(int goodTypeID) {
        GoodTypeID = goodTypeID;
    }

    public String getGoodTypeName() {
        return GoodTypeName;
    }

    public void setGoodTypeName(String goodTypeName) {
        GoodTypeName = goodTypeName;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }
}

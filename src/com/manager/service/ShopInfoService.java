package com.manager.service;

import com.manager.entity.Shop;

import java.util.List;

/**
 * <pre>
 * Insert Brief Description Here!
 * 日    期: 2014/5/8 21:59
 * 模    块: 接口
 * 描    述:
 * 备    注:
 * ------------------------------------------------------------
 * 修改历史:
 *
 * 序号    日期          修改人     修改原因
 *  1     2014/5/8       鲁梦维     版本创建
 *
 * </pre>
 */
public interface ShopInfoService {


    /**
     * 查询某个用户下的所有商铺信息
     *
     * @param userID 用户ID
     * @return int
     */
    public List<Shop> getShopInfoByUserID(int userID);



    /**
     * 新增店铺
     *
     * @param shop 用户对象
     * @return int
     */
    public int addShop(Shop shop);

}

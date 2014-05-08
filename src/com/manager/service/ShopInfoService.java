package com.manager.service;

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
     * @param user 用户对象
     * @return int
     */
    public List getShopInfoByUserID(int shopID);
}

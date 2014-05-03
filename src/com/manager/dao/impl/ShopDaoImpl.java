package com.manager.dao.impl;

import com.manager.dao.ShopDao;
import com.manager.entity.Shop;

import java.util.List;

/**
 * <pre>
 * Insert Brief Description Here!
 * 日    期: 2014/5/3 19:46
 * 模    块: 接口
 * 描    述:
 * 备    注:
 * ------------------------------------------------------------
 * 修改历史:
 *
 * 序号    日期          修改人     修改原因
 *  1     2014/5/3       鲁梦维     版本创建
 *
 * </pre>
 */
public class ShopDaoImpl implements ShopDao {

    /**
     * 通过商铺ID查询商铺具体信息
     *
     * @param ShopID@return List
     */
    public List getShopInfo(int ShopID) {
        return null;
    }

    /**
     * 创建商铺
     *
     * @param shop 商铺对象
     * @return int
     */
    public int addShop(Shop shop) {
        return 0;
    }

    /**
     * 修改商铺基本信息
     *
     * @param shop 商铺对象
     * @return int
     */
    public int updateShop(Shop shop) {
        return 0;
    }

    /**
     * 删除商铺 实际并不删除数据库中数据，只是将商铺状态置为 -1
     *
     * @param shopID@return int
     */
    public int delShop(int shopID) {
        return 0;
    }
}

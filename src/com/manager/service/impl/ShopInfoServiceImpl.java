package com.manager.service.impl;

import com.manager.dao.ShopDao;
import com.manager.entity.Shop;
import com.manager.service.ShopInfoService;
import com.manager.util.FinalString;
import org.apache.log4j.Logger;

import java.sql.Timestamp;
import java.util.List;

/**
 * <pre>
 * Insert Brief Description Here!
 * 日    期: 2014/5/10 14:33
 * 模    块: 接口
 * 描    述:
 * 备    注:
 * ------------------------------------------------------------
 * 修改历史:
 *
 * 序号    日期          修改人     修改原因
 *  1     2014/5/10       鲁梦维     版本创建
 *
 * </pre>
 */
public class ShopInfoServiceImpl implements ShopInfoService {

    ShopDao shopDao;

    private final Logger log = Logger.getLogger(ShopInfoServiceImpl.class);

    public void setShopDao(ShopDao shopDao) {
        this.shopDao = shopDao;
    }


    /**
     * 查询某个用户下的所有商铺信息
     *
     * @param userID 用户ID
     * @return int
     */
    public List<Shop> getShopInfoByUserID(int userID) {
        return shopDao.getShopInfoByUserID(userID);
    }


    /**
     * 新增店铺
     *
     * @param shop 用户对象
     * @return int
     */
    public int addShop(Shop shop) {

        shop.setCreateTime(new Timestamp(System.currentTimeMillis()));
        /*新创建的店铺状态置为休息中，防止还没有配置商品就在前台展示出来*/
        shop.setStatus(FinalString.SHOP_STATUS_CLOSE);

        log.info("用户"+ shop.getUserID() +"创建店铺, 店铺名称:" + shop.getShopName()  );

        return shopDao.addShop(shop);
    }
}

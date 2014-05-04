package com.manager.dao.impl;

import com.manager.dao.ShopDao;
import com.manager.entity.Shop;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.Types;
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
public class ShopDaoImpl extends JdbcDaoSupport implements ShopDao {

    /**
     * 通过商铺ID查询商铺具体信息
     *
     * @param ShopID@return List
     */
    public List getShopInfo(int ShopID) {

        String sql = "select * from shop_info_t where shopID = " + ShopID;

        return this.getJdbcTemplate().queryForList(sql);
    }

    /**
     * 创建商铺
     *
     * @param shop 商铺对象
     * @return int
     */
    public int addShop(Shop shop) {

        StringBuilder sql = new StringBuilder();
        sql.append("insert into shop_info_t (ShopName, UserID, CreateTime, Endtime, PayType, Address, Telphone, FloorPrice, Freight, NS, WE, Status, Notice, IfSmsInform, IfWechatInform)");
        sql.append("values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        return this.getJdbcTemplate().update(sql.toString(),
                new Object[]{shop.getShopName(), shop.getUserID(), shop.getCreateTime(), shop.getEndTime(), shop.getPayType(), shop.getAddress(), shop.getTelphone(),
                             shop.getFloorPrice(), shop.getFreight(), shop.getNS(), shop.getWE(), shop.getStatus(), shop.getNotice(), shop.getIfSmsInform(), shop.getIfWechatInform()},
                new int[]{Types.VARCHAR, Types.VARCHAR, Types.TIMESTAMP, Types.TIMESTAMP, Types.INTEGER, Types.VARCHAR, Types.VARCHAR,
                          Types.FLOAT, Types.FLOAT, Types.VARCHAR, Types.VARCHAR, Types.INTEGER, Types.VARCHAR, Types.INTEGER, Types.INTEGER});
    }

    /**
     * 修改商铺基本信息
     *
     * @param shop 商铺对象
     * @return int
     */
    public int updateShop(Shop shop) {

        String sql = "update shop_info_t set ShopName = ?, PayType = ?, Address = ?, Telphone = ?, FloorPrice = ?, Freight = ?, NS = ?, WE = ?, Status = ?, Notice = ?, IfSmsInform = ?, IfWechatInform = ? where ShopID = " + shop.getShopID();

        return this.getJdbcTemplate().update(sql,
                new Object[]{shop.getShopName(), shop.getPayType(), shop.getAddress(), shop.getTelphone(), shop.getFloorPrice(), shop.getFreight(),
                             shop.getNS(), shop.getWE(), shop.getStatus(), shop.getNotice(), shop.getIfSmsInform(), shop.getIfWechatInform()},
                new int[]{Types.VARCHAR, Types.INTEGER, Types.VARCHAR, Types.VARCHAR, Types.FLOAT, Types.FLOAT,
                          Types.VARCHAR, Types.VARCHAR, Types.INTEGER, Types.VARCHAR, Types.INTEGER, Types.INTEGER});
    }

    /**
     * 删除商铺 实际并不删除数据库中数据，只是将商铺状态置为 -1
     *
     * @param shopID 商铺ID
     * @param status 商铺状态
     * @return int
     */
    public int updateShopStatus(int shopID, int status) {

        String sql = "update shop_info_t set Status = " + status +" where ShopID = " + shopID;
        return this.getJdbcTemplate().update(sql);
    }
}

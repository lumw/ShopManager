package com.manager.dao.impl;

import com.manager.dao.OrderDao;
import com.manager.entity.Order;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.Timestamp;
import java.sql.Types;
import java.util.List;

/**
 * <pre>
 * Insert Brief Description Here!
 * 日    期: 2014/5/5 21:54
 * 模    块: 接口
 * 描    述:
 * 备    注:
 * ------------------------------------------------------------
 * 修改历史:
 *
 * 序号    日期          修改人     修改原因
 *  1     2014/5/5       鲁梦维     版本创建
 *
 * </pre>
 */
public class OrderDaoImpl extends JdbcDaoSupport implements OrderDao {


    /**
     * 修改订单状态
     *
     * @param orderID     订单ID
     * @param orderStatus 订单状态
     * @return int
     */
    public int updateOrderStatus(String orderID, int orderStatus) {

        String sql = "update order_info_base_t set Status = " + orderStatus + " where OrderID = " + "'" + orderID + "'";

        return this.getJdbcTemplate().update(sql);
    }

    /**
     * 修改订单信息
     *
     * @param order 订单类型对象
     * @return int
     */
    public int updateOrder(Order order) {
        return 0;
    }

    /**
     * 根据用户ID以及订单状态查询出符合条件的订单信息
     *
     * @param userID 用户ID
     * @param status 订单状态
     * @return List
     */
    public List getOrderInfoByUserID(int userID, int status) {

        String sql = "select * from order_info_base_t where UserID = " + userID + " and status = " + status;

        return this.getJdbcTemplate().queryForList(sql);
    }

    /**
     * 根据商铺ID以及订单状态查询出符合条件的订单信息
     *
     * @param shopID 用户ID
     * @param status 订单状态
     * @return List
     */
    public List getOrderInfoByShopID(int shopID, int status) {

        String sql = "select * from order_info_base_t where ShopID = "+ shopID +" and status = " + status;

        return this.getJdbcTemplate().queryForList(sql);
    }

    /**
     * 查询某个用户在一个时间段内的订单信息
     *
     * @param userID    用户ID
     * @param startTime 起始时间
     * @param endTime   结束时间
     * @return List
     */
    public List getOrderInfoByTimeIntervalAndUserID(int userID, Timestamp startTime, Timestamp endTime) {

        String sql = "select * from order_info_base_t where UserID = ? and CreateTime between ? and ?";

        return this.getJdbcTemplate().queryForList(sql,
                new Object[]{userID, startTime, endTime},
                new int[]{Types.INTEGER, Types.TIMESTAMP, Types.TIMESTAMP},
                Order.class);
    }

    /**
     * 查询某个商铺在一个时间段内的订单信息
     *
     * @param shopID    商铺ID
     * @param startTime 起始时间
     * @param endTime   结束时间
     * @return List
     */
    public List getOrderInfoByTimeIntervalAndShopID(int shopID, Timestamp startTime, Timestamp endTime) {

        String sql = "select * from order_info_base_t where shopID = ? and CreateTime between ? and ?";

        return this.getJdbcTemplate().queryForList(sql,
                new Object[]{shopID, startTime, endTime},
                new int[]{Types.INTEGER, Types.TIMESTAMP, Types.TIMESTAMP},
                Order.class);
    }
}

package com.manager.dao;

import com.manager.entity.Order;

import java.sql.Timestamp;
import java.util.List;

/**
 * <pre>
 * Insert Brief Description Here!
 * 日    期: 2014/5/5 21:14
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
public interface OrderDao {


    /**
     * 修改订单状态
     *
     * @param  orderID      订单ID
     * @param  orderStatus  订单状态
     * @return int
     */
    public int updateOrderStatus(String orderID, int orderStatus);


    /**
     * 修改订单信息
     *
     * @param order     订单类型对象
     * @return int
     */
    public int updateOrder(Order order);


    /**
     * 根据用户ID以及订单状态查询出符合条件的订单信息
     *
     * @param userID 用户ID
     * @param status 订单状态
     * @return List
     */
    public List getOrderInfoByUserID(int userID, int status);


    /**
     * 根据商铺ID以及订单状态查询出符合条件的订单信息
     *
     * @param shopID 用户ID
     * @param status 订单状态
     * @return List
     */
    public List getOrderInfoByShopID(int shopID, int status);


    /**
     * 查询某个用户在一个时间段内的订单信息
     *
     * @param userID    用户ID
     * @param startTime 起始时间
     * @param endTime   结束时间
     * @return List
     */
    public List getOrderInfoByTimeIntervalAndUserID(int userID, Timestamp startTime, Timestamp endTime);


    /**
     * 查询某个商铺在一个时间段内的订单信息
     *
     * @param shopID    商铺ID
     * @param startTime 起始时间
     * @param endTime   结束时间
     * @return List
     */
    public List getOrderInfoByTimeIntervalAndShopID(int shopID, Timestamp startTime, Timestamp endTime);
}

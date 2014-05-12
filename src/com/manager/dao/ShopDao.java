package com.manager.dao;

import com.manager.entity.Shop;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * <pre>
 * Insert Brief Description Here!
 * 日    期: 2014/5/3 17:22
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
public interface ShopDao {

    /**
     * 通过商铺ID查询商铺具体信息
     *
     * @param ShopID   商铺ID
     * @return List
     */
    public List getShopInfoByShopID(int ShopID);


    /**
     * 查询用户下的所有商铺信息
     *
     * @param userName   登陆用户名
     * @param password   登陆密码
     * @return List
     */
    public List<Shop> getShopInfoByUserID(int userID) throws DataAccessException;


    /**
     * 创建商铺
     *
     * @param shop   商铺对象
     * @return int
     */
    public int addShop(Shop shop) throws DataAccessException;


    /**
     * 修改商铺基本信息
     *
     * @param shop   商铺对象
     * @return int
     */
    public int updateShop(Shop shop) throws DataAccessException;


    /**
     * 删除商铺 实际并不删除数据库中数据，只是将商铺状态置为 -1
     *
     * @param shopID   商铺对象
     * @param status   商铺状态
     * @return int
     */
    public int updateShopStatus(int shopID, int status) throws DataAccessException;
}

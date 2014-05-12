package com.manager.dao.impl;

import com.manager.dao.GoodsDao;
import com.manager.entity.Goods;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.Types;
import java.util.List;

/**
 * <pre>
 * Insert Brief Description Here!
 * 日    期: 2014/5/3 20:00
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
public class GoodsDaoImpl extends JdbcDaoSupport implements GoodsDao {

    /**
     * 增加商品信息
     *
     * @param goods 商品对象
     * @return int
     */
    public int addGoods(Goods goods) throws DataAccessException {
        StringBuilder sql = new StringBuilder();

        sql.append("insert into goods_info_t (ShopID, GoodsTypeID, GoodsID, GoodsName, UnitID, Price, CreateTime, SaleCnt, ActID, Status, Stock)");
        sql.append("values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        return this.getJdbcTemplate().update(sql.toString(),
                new Object[]{goods.getShopID(), goods.getGoodsTypeID(), goods.getGoodsID(), goods.getGoodsName(), goods.getUnitID(), goods.getPrice(), goods.getCreateTime(),
                        goods.getSaleQuantity(), goods.getActID(), goods.getStatus(), goods.getStock()},
                new int[]{Types.INTEGER, Types.INTEGER, Types.VARCHAR, Types.VARCHAR, Types.INTEGER, Types.FLOAT, Types.TIMESTAMP,
                        Types.FLOAT, Types.VARCHAR, Types.INTEGER, Types.FLOAT});
    }

    /**
     * 修改商品信息
     *
     * @param goods 商品对象
     * @return int
     */
    public int updateGoods(Goods goods) throws DataAccessException {

        String sql = "update goods_info_t set GoodsTypeID = ?, GoodsName = ?, UnitID = ?, Price = ?, CreateTime = ?,  ActID = ?, Status = ?, Stock = ? where ShopID = ? and GoodsID = ?";
        return this.getJdbcTemplate().update(sql,
                new Object[]{goods.getGoodsID(), goods.getGoodsName(), goods.getUnitID(), goods.getPrice(), goods.getCreateTime(), goods.getActID(),
                             goods.getStatus(), goods.getStock(), goods.getShopID(), goods.getGoodsID()},
                new int[]{Types.VARCHAR, Types.VARCHAR, Types.INTEGER, Types.FLOAT, Types.FLOAT, Types.TIMESTAMP, Types.VARCHAR, Types.INTEGER, Types.INTEGER, Types.INTEGER, Types.INTEGER});
    }

    /**
     * 更改商品状态
     *
     * @param shopID   商铺ID
     * @param goodsID  商品ID
     * @param status   商品状态
     * @return int
     */
    public int updateGoodsStatus(int shopID, int goodsID, int status) throws DataAccessException{

        StringBuilder sql = new StringBuilder();
        sql.append("update goods_info_t set status = ").append(status);
        sql.append(" where shopID = ").append(shopID);
        sql.append(" goodsID = ").append(goodsID);

        return this.getJdbcTemplate().update(sql.toString());
    }

    /**
     * 获取商铺中某个商品类型下所有的商品信息
     *
     * @param shopID      商铺ID
     * @param goodsTypeID 商品类型
     * @return List
     */
    public List getAllGoodsByGoodsType(int shopID, int goodsTypeID) throws DataAccessException{

        String sql = "select * from goods_info_t where shopID = " + shopID + " and goodsTypeID = " + goodsTypeID;
        return this.getJdbcTemplate().queryForList(sql);
    }
}

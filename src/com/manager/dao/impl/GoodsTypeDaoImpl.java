package com.manager.dao.impl;

import com.manager.dao.GoodsTypeDao;
import com.manager.entity.GoodsType;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.Types;
import java.util.List;

/**
 * <pre>
 * Insert Brief Description Here!
 * 日    期: 2014/5/3 20:15
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
public class GoodsTypeDaoImpl extends JdbcDaoSupport implements GoodsTypeDao {


    /**
     * 增加商品类型
     *
     * @param goodsType 商品类型对象
     * @return int
     */
    public int addGoodsType(GoodsType goodsType) {

        String sql = "insert into goods_type_info_t (ShopID, GoodsTypeID, GoodsTypeName, Status) values (?, ?, ?, ?)";
        return this.getJdbcTemplate().update(sql,
                                             new Object[]{goodsType.getShopID(), goodsType.getGoodTypeID(), goodsType.getGoodTypeName(), goodsType.getStatus()},
                                             new int[]{Types.INTEGER, Types.INTEGER, Types.VARCHAR, Types.INTEGER});
    }

    /**
     * 修改商品类型名称
     *
     * @param goodsType 商品类型对象
     * @return int
     */
    public int updateGoodsType(GoodsType goodsType) {

        StringBuilder sql = new StringBuilder();
        sql.append("update goods_type_info_t set GoodsTypeName = ").append("'").append(goodsType.getGoodTypeName()).append("'");
        sql.append("where");
        sql.append("ShopID = ").append(goodsType.getShopID());
        sql.append("and");
        sql.append("GoodsTypeID = ").append(goodsType.getGoodTypeID());

        return this.getJdbcTemplate().update(sql.toString());
    }

    /**
     * 更改商品类型状态
     *
     * @param goodsType 商品类型对象
     * @param status    商品类型状态
     * @return int
     */
    public int updateGoodsTypeStatus(GoodsType goodsType, int status) {

        StringBuilder sql = new StringBuilder();
        sql.append("update goods_type_info_t set Status = ").append(status);
        sql.append("where");
        sql.append("ShopID = ").append(goodsType.getGoodTypeID());
        sql.append("and");
        sql.append("GoodsTypeID = ").append(goodsType.getGoodTypeID());

        return this.getJdbcTemplate().update(sql.toString());
    }

    /**
     * 查询出商铺下所有商品类型
     *
     * @param shopID@return int
     */
    public List getAllGoodsTypeByShopID(int shopID) {

        String sql = "select * from goods_type_info_t where ShopID = " + shopID;
        return this.getJdbcTemplate().queryForList(sql);
    }
}

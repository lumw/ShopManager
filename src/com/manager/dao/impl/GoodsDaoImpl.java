package com.manager.dao.impl;

import com.manager.dao.GoodsDao;
import com.manager.entity.Goods;

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
public class GoodsDaoImpl implements GoodsDao {

    /**
     * 增加商品信息
     *
     * @param goods 商品对象
     * @return int
     */
    public int addGoods(Goods goods) {
        return 0;
    }

    /**
     * 修改商品信息
     *
     * @param goods 商品对象
     * @return int
     */
    public int updateGoods(Goods goods) {
        return 0;
    }

    /**
     * 删除商品信息
     *
     * @param shopID
     * @param goodsID
     * @return int
     */
    public int delGoods(int shopID, int goodsID) {
        return 0;
    }

    /**
     * 获取某个商品类型下所有的商品信息
     *
     * @param shopID      商铺ID
     * @param goodsTypeID 商品类型
     * @return List
     */
    public List getAllGoodsByGoodsType(int shopID, int goodsTypeID) {
        return null;
    }
}

package com.manager.dao;

import com.manager.entity.Goods;

import java.util.List;

/**
 * <pre>
 * Insert Brief Description Here!
 * 日    期: 2014/5/3 19:47
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
public interface GoodsDao {

    /**
     * 增加商品信息
     *
     * @param goods   商品对象
     * @return int
     */
    public int addGoods(Goods goods);


    /**
     * 修改商品信息
     *
     * @param goods   商品对象
     * @return int
     */
    public int updateGoods(Goods goods);


    /**
     * 更改商品状态
     *
     * @param shopID   商铺ID
     * @param goodsID  商品ID
     * @param status   商品状态
     * @return int
     */
    public int updateGoodsStatus(int shopID, int goodsID, int status);



    /**
     * 获取某个商品类型下所有的商品信息
     *
     * @param shopID      商铺ID
     * @param goodsTypeID 商品类型
     * @return List
     */
    public List getAllGoodsByGoodsType(int shopID, int goodsTypeID);

}

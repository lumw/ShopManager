package com.manager.dao;

import com.manager.entity.GoodsType;

import java.util.List;

/**
 * <pre>
 * Insert Brief Description Here!
 * 日    期: 2014/5/3 20:02
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
public interface GoodsTypeDao {


    /**
     * 增加商品类型
     *
     * @param goodsType 商品类型对象
     * @return int
     */
    public int addGoodsType(GoodsType goodsType);


    /**
     * 修改商品类型名称
     *
     * @param goodsType 商品类型对象
     * @return int
     */
    public int updateGoodsType(GoodsType goodsType);


    /**
     * 更改商品类型状态
     *
     * @param goodsType 商品类型对象
     * @param status    商品类型状态
     * @return int
     */
    public int updateGoodsTypeStatus(GoodsType goodsType, int status);



    /**
     * 查询出商铺下所有商品类型
     *
     * @param goodsType 商品类型对象
     * @return int
     */
    public List getAllGoodsTypeByShopID(int shopID);

}

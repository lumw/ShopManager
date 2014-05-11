package com.manager.action;

import com.manager.entity.Shop;
import com.manager.service.ShopInfoService;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;
import java.util.Map;

/**
 * <pre>
 * Insert Brief Description Here!
 * 日    期: 2014/5/10 20:58
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
public class GetShopInfoAction extends ActionSupport {

    private static final long serialVersionUID = 1L;

    private Map<String, Object> dataMap;

    private int userID;

    private ShopInfoService shopInfoService;

    public Map<String, Object> getDataMap() {
        return dataMap;
    }

    public void setShopInfoService(ShopInfoService shopInfoService) {
        this.shopInfoService = shopInfoService;
    }



    /**
     * 查询某个用户下的所有商铺信息
     */
    public String execute() {

        dataMap.clear();
        List<Shop> list = shopInfoService.getShopInfoByUserID(userID);

        int shopCount = list.size();

        for (Shop shop : list) {
            dataMap.put("shopInfo", shop);
        }

        dataMap.put("shopCount", shopCount);

        return SUCCESS;
    }
}

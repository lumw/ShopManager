package com.manager.action;

import com.manager.entity.Shop;
import com.manager.service.ShopInfoService;
import com.manager.service.UserInfoService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 * Insert Brief Description Here!
 * 日    期: 2014/5/10 15:13
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
public class AddShopAction extends ActionSupport {

    private static final long serialVersionUID = 1L;
    private final Logger log = Logger.getLogger(AddShopAction.class);


    /*spring注入*/
    private ShopInfoService shopInfoService;
    private UserInfoService userInfoService;

    /*通过JSP获取*/
    private Shop shop;
    private Map<String, Object> dataMap;

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public void setShopInfoService(ShopInfoService shopInfoService) {
        this.shopInfoService = shopInfoService;
    }

    public void setUserInfoService(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }

    public Map<String, Object> getDataMap() {
        return dataMap;
    }



    /**
     * 新增店铺
     * 当新增店铺操作完成时，给页面返回json数据，1-成功，0-失败
     */
    public String execute(){

        dataMap = new HashMap<String, Object>();
        dataMap.clear();

        /*校验用户是否还可以继续开店*/
        if(!userInfoService.hasPermissionsToSetUpShop(shop.getUserID())){
            return ERROR;
        }


        if (shopInfoService.addShop(shop) == 1){
            dataMap.put("operResult", 1);
            return SUCCESS;
        }else{
            dataMap.put("operResult", 0);
            return ERROR;
        }

    }
}

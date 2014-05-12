package com.manager.service.impl;

import com.manager.dao.UserDao;
import com.manager.entity.User;
import com.manager.service.UserInfoService;

import java.util.List;

/**
 * <pre>
 * Insert Brief Description Here!
 * 日    期: 2014/5/6 21:01
 * 模    块: 接口
 * 描    述:
 * 备    注:
 * ------------------------------------------------------------
 * 修改历史:
 *
 * 序号    日期          修改人     修改原因
 *  1     2014/5/6       鲁梦维     版本创建
 *
 * </pre>
 */
public class UserInfoServiceImpl implements UserInfoService {

    UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    /**
     * 修改用户信息
     *
     * @param user 用户对象
     * @return int
     */
    public int updateUserInfo(User user) {

        return userDao.updateUser(user);
    }

    /**
     * 根据用户登录名查询用户所有信息
     *
     * @param userName 用户名
     * @return List
     */
    public List<User> getUserInfo(String userName, String password) {

        return userDao.getUserInfoByuserNameAndPwd(userName, password);

    }


    /**
     * 根据用户级别判断用户是否可以继续创建店铺
     *
     * @param userID
     * @return User
     */
    public boolean hasPermissionsToSetUpShop(int userID) {

        /*获取该用户已创建商铺的数量*/
        int ownShopCnt = userDao.getShopCountByUserID(userID);

        /*获取对应该用户级别所能够创建的商铺个数*/
        int maxShopCnt = userDao.getMaxShopCntByUserID(userID) ;

        return (maxShopCnt - ownShopCnt > 0);
    }

}

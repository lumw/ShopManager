package com.manager.service.impl;

import com.manager.dao.UserDao;
import com.manager.entity.User;
import com.manager.service.RegisterService;
import com.manager.util.FinalString;

import java.sql.Timestamp;
import java.util.List;

/**
 * <pre>
 * Insert Brief Description Here!
 * 日    期: 2014/5/2 19:20
 * 模    块: 接口
 * 描    述:
 * 备    注:
 * ------------------------------------------------------------
 * 修改历史:
 *
 * 序号    日期          修改人     修改原因
 *  1     2014/5/2       鲁梦维     版本创建
 *
 * </pre>
 */
public class RegisterServiceImpl implements RegisterService {

    UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    /**
     * 判断用户名是否已经注册过
     *
     * @param userName 登陆用户名
     * @return List
     */
    public boolean isUserNameRegistered(String userName) {

        List list;

        list = userDao.isUserExist(userName);

        return 0 != list.size();
    }

    /**
     * 增加新用户
     *
     * @param user 用户对象
     * @return int
     */
    public int addUser(User user) {

        user.setRegisTime(new Timestamp(System.currentTimeMillis()));
        user.setStatus(FinalString.USER_STATUS_ADD);

        return userDao.addUser(user);

    }


}

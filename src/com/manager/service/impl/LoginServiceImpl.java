package com.manager.service.impl;

import com.manager.dao.UserDao;
import com.manager.service.LoginService;

import java.util.List;

/**
 * <pre>
 * Insert Brief Description Here!
 * 日    期: 14-4-29 下午4:36
 * 模    块: 接口
 * 描    述:
 * 备    注:
 * ------------------------------------------------------------
 * 修改历史:
 *
 * 序号    日期          修改人     修改原因
 *  1     14-4-29       鲁梦维     版本创建
 *
 * </pre>
 */
public class LoginServiceImpl implements LoginService {

    UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public boolean isUserExist(String userName, String password) {

        List list;

        list = userDao.isUserExist(userName, password);

        return 0 != list.size();

    }
}

package com.manager.service.impl;

import com.manager.dao.UserDao;
import com.manager.service.RegisterService;

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


}

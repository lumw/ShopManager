package com.manager.dao;

import com.manager.entity.User;

import java.util.List;

/**
 * <pre>
 * Insert Brief Description Here!
 * 日    期: 14-4-29 下午12:51
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
public interface UserDao {


    /**
     * 根据用户名、密码判断用户是否可以登录
     * @param userName
     * @param password
     * @return List
     */
    public List isUserExist(String userName, String password);

    public int registerUser(User user);
}

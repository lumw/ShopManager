package com.manager.service;

import com.manager.entity.User;

import java.util.List;

/**
 * <pre>
 * Insert Brief Description Here!
 * 日    期: 2014/5/6 20:58
 * 模    块: 接口
 * 描    述: 修改用户信息
 * 备    注:
 * ------------------------------------------------------------
 * 修改历史:
 *
 * 序号    日期          修改人     修改原因
 *  1     2014/5/6       鲁梦维     版本创建
 *
 * </pre>
 */
public interface UserInfoService {

    /**
     * 修改用户信息
     *
     * @param user 用户对象
     * @return int
     */
    public int updateUserInfo(User user);


    /**
     * 根据用户登录名以及密码查询用户所有信息
     *
     * @param  userName 用户名
     * @param  password 密码
     * @return User
     */
    public List<User> getUserInfo(String userName, String password);


}

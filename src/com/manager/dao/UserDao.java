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
     * 通过 用户名+密码 校验用户是否存在(用于用户登录)
     *
     * @param userName   登陆用户名
     * @param password   登陆密码
     * @return User
     */
    public User isUserExist(String userName, String password);


    /**
     * 通过用户名校验用户是否存在(用于用户注册)
     *
     * @param userName 登陆用户名
     * @return List
     */
    public List isUserExist(String userName);


    /**
     * 增加用户
     *
     * @param  user   用户对象
     * @return int
     */
    public int addUser(User user);


    /**
     * 修改用户信息
     *
     * @param  user 用户对象
     * @return int
     */
    public int updateUser(User user);


    /**
     * 更改用户状态
     *
     * @param userID 用户编号
     * @param status 用户状态
     * @return int
     */
    public int updateUserStatus(int userID, int status);


    /**
     * 根据用户登录名查询用户所有信息
     *
     * @param userName 用户登录名
     * @return User
     */
    public List<User> getUserInfoByuserNameAndPwd(String userName, String password);

}

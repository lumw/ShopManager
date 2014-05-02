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
     * 校验用户是否存在
     *
     * @param userName   登陆用户名
     * @param password   登陆密码
     * @return List
     */
    public List isUserExist(String userName, String password);



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
     * 删除用户信息,实际并不删除数据库中数据，只是将用户状态置为 -1
     *
     * @param userID 用户编号
     * @return int
     */
    public int delUser(int userID);
}

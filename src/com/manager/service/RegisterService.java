package com.manager.service;

import com.manager.entity.User;

/**
 * <pre>
 * Insert Brief Description Here!
 * 日    期: 2014/5/2 19:19
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
public interface RegisterService {


    /**
     * 判断用户名是否已经注册过
     *
     * @param userName 登陆用户名
     * @return List
     */
    public boolean isUserNameRegistered(String userName);


    /**
     * 增加新用户
     *
     * @param user  用户对象
     * @return int
     */
    public int addUser(User user);




}

package com.manager.dao;

/**
 * <pre>
 * Insert Brief Description Here!
 * 日    期: 2014/4/27 20:54
 * 模    块: 接口
 * 描    述:
 * 备    注:
 * ------------------------------------------------------------
 * 修改历史:
 *
 * 序号    日期          修改人     修改原因
 *  1     2014/4/27       鲁梦维     版本创建
 *
 * </pre>
 */
public interface UserDao {

    public boolean login(String userName, String password);
}

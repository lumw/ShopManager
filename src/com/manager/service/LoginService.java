package com.manager.service;

/**
 * <pre>
 * Insert Brief Description Here!
 * 日    期: 14-4-29 下午4:35
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
public interface LoginService {



    public boolean isUserExist(String userName, String password);
}

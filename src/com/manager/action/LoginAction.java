package com.manager.action;

import com.manager.dao.impl.UserDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * <pre>
 * Insert Brief Description Here!
 * 日    期: 2014/4/27 18:46
 * 模    块: 接口
 * 描    述:
 * 备    注:
 * ------------------------------------------------------------
 * 修改历史:
 *
 * 序号    日期          修改人     修改原因
 *  1     2014/4/27      鲁梦维     版本创建
 *
 * </pre>
 */
public class LoginAction extends ActionSupport {

    private static final long serialVersionUID = 1L;

    private UserDaoImpl userDaoImpl;
    private String username;
    private String password;


    public String execute() throws Exception {

        if( username.equals("admin") && password.equals("123456") ){
            return SUCCESS;
        }else{
            return ERROR;
        }
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserDaoImpl getUserDaoImpl() {
        return userDaoImpl;
    }

    public void setUserDaoImpl(UserDaoImpl userDaoImpl) {
        this.userDaoImpl = userDaoImpl;
    }
}

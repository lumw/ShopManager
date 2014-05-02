package com.manager.action;

import com.manager.service.LoginService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.Logger;

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

    private final Logger log = Logger.getLogger(LoginAction.class);

    private LoginService loginServiceImpl;
    private String username;
    private String password;


    @Override
    public String execute() throws Exception {

        log.debug("用户" + username + "使用密码 "+ password + "登陆... ");

        System.out.println(loginServiceImpl.isUserExist(username, password));
        if (loginServiceImpl.isUserExist(username, password)) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }


    public void setLoginServiceImpl(LoginService loginServiceImpl) {
        this.loginServiceImpl = loginServiceImpl;
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


}

package com.manager.action;

import com.manager.entity.User;
import com.manager.service.UserInfoService;
import com.manager.util.security.MD5;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import java.util.List;

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

    private UserInfoService userInfoService;

    private String username;
    private String password;

    @Override
    public String execute() throws Exception {

        MD5 md5 = new MD5();
        password = md5.getMD5ofStr(password).toUpperCase();

        //log.debug("用户[" + username + "]使用密码[" + password + "]登陆... ");
        List<User> list = userInfoService.getUserInfo(username, password);
        if ( list.size() > 0) {
            for(User user : list){
                /*将登陆用户的详细信息保存在Session中*/
                ServletActionContext.getContext().getSession().put("userInfo", user);
            }
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    public void setUserInfoService(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
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

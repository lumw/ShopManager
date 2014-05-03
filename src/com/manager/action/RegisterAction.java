package com.manager.action;

import com.manager.entity.User;
import com.manager.service.RegisterService;
import com.manager.util.security.MD5;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.Logger;

/**
 * <pre>
 * Insert Brief Description Here!
 * 日    期: 2014/5/2 19:03
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
public class RegisterAction extends ActionSupport {

    private static final long serialVersionUID = 1L;

    private final Logger log = Logger.getLogger(RegisterAction.class);


    private String userName;
    private String email;
    private String password;

    private RegisterService registerService;



    @Override
    public String execute(){

        /*密码取MD5摘要*/
        MD5 md5 = new MD5();
        password  = md5.getMD5ofStr(password).toUpperCase();

        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        user.setEmail(email);



        if( registerService.isUserNameRegistered(userName) ){
            return ERROR;
        }else{
            if (registerService.addUser(user)  > 0 ){ //用户注册成功
                //设置session 跳转到成功页面
                return SUCCESS;
            } else{
                //返回给页面错误信息
                return ERROR;
            }
        }
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRegisterService(RegisterService registerService) {
        this.registerService = registerService;
    }
}

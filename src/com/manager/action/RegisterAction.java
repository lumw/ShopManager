package com.manager.action;

import com.manager.service.RegisterService;
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

    private RegisterService registerService;


    public void setRegisterService(RegisterService registerService) {
        this.registerService = registerService;
    }


    @Override
    public String execute(){

        return "";
    }
}

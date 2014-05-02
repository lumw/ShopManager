package com.manager.Interceptor;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import java.util.Map;

/**
 * <pre>
 * Insert Brief Description Here!
 * 日    期: 2014/4/29 21:27
 * 模    块: 接口
 * 描    述: 权限检查拦截器
 * 备    注:
 * ------------------------------------------------------------
 * 修改历史:
 *
 * 序号    日期          修改人     修改原因
 *  1     2014/4/29      鲁梦维     版本创建
 *
 * </pre>
 */
public class AuthorizationInterceptor extends AbstractInterceptor {


    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {

        Map session = actionInvocation.getInvocationContext().getSession();

        String userName = (String) session.get("userName");

        if (null != userName) {
            return actionInvocation.invoke();
        } else {
            return Action.LOGIN;
        }
    }
}

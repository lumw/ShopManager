package com.manager.dao.impl;

import com.manager.dao.UserDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.Map;

/**
 * <pre>
 * Insert Brief Description Here!
 * 日    期: 2014/4/27 20:55
 * 模    块: 接口
 * 描    述:
 * 备    注:
 * ------------------------------------------------------------
 * 修改历史:
 *
 * 序号    日期          修改人     修改原因
 *  1     2014/4/27       鲁梦维    版本创建
 *
 * </pre>
 */
public class UserDaoImpl extends JdbcDaoSupport implements UserDao{

    public boolean login(String userName, String password) {

        String sql = "select password from user_info_t where username = ?";

        Map map = this.getJdbcTemplate().queryForMap(sql, userName);

        return(password.equals(map.get("password")));
    }
}

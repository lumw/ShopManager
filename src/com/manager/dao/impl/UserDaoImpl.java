package com.manager.dao.impl;

import com.manager.dao.UserDao;
import org.springframework.jdbc.core.JdbcTemplate;

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
public class UserDaoImpl implements UserDao{

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate = jdbcTemplate;
    }

    public String login(String userName, String password) {

        return  jdbcTemplate.queryForObject("select * from user_info_t where username = "
                                            + userName, String.class);
    }
}

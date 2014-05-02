package com.manager.dao.impl;

import com.manager.dao.UserDao;
import com.manager.entity.User;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * <pre>
 * Insert Brief Description Here!
 * 日    期: 14-4-29 下午12:52
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
public class UserDaoImpl extends JdbcDaoSupport implements UserDao {


    public List isUserExist(String userName, String password) {

        StringBuilder sql = new StringBuilder();
        sql.append("select * from user_info_t " );
        sql.append("where ");
        sql.append("username = ").append("'").append(userName).append("' ");
        sql.append("and ");
        sql.append("password = ").append("'").append(password).append("' ");

        return this.getJdbcTemplate().queryForList(sql.toString());
    }

    public int registerUser(final User user)
    {
        String sql = "insert into user_info_t values (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        return this.getJdbcTemplate().update(sql, new PreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps)
                    throws SQLException {
                ps.setString(1, user.getUserID());
                ps.setObject(2, "Apple");
                ps.setString(3, "Ipad4");
            }
            });


                                            , user.getUserName(), user.getPassword()
        user.getSex(), user.getBirthday(), user.getAddress(), user.getEmail(), user.getTelphone(), user.getRegisTime()
    }


}

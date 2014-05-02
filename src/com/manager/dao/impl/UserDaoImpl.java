package com.manager.dao.impl;

import com.manager.dao.UserDao;
import com.manager.entity.User;
import com.manager.util.FinalString;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.Types;
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


    /**
     * 校验用户是否存在
     *
     * @param userName 登陆用户名
     * @param password 登陆密码
     * @return List
     */
    public List isUserExist(String userName, String password) {

        StringBuilder sql = new StringBuilder();

        sql.append("select * from user_info_t " );
        sql.append("where ");
        sql.append("username = ").append("'").append(userName).append("' ");
        sql.append("and ");
        sql.append("password = ").append("'").append(password).append("' ");

        return this.getJdbcTemplate().queryForList(sql.toString());
    }


    /**
     * 增加用户
     *
     * @param user 用户对象
     * @return int
     */
    public int addUser(User user) {

        StringBuilder sql = new StringBuilder();
        sql.append("insert into user_info_t(username, password, name, sex, birthday, address, email, telphone, regisTime) ");
        sql.append("values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        return this.getJdbcTemplate().update(sql.toString(),
                                             new Object[]{user.getUserName(), user.getPassword(), user.getName(), user.getSex(),user.getBirthday(),
                                                          user.getAddress(), user.getEmail(), user.getTelphone(), user.getRegisTime(), user.getStatus()},
                                             new int[]{Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.INTEGER, Types.TIMESTAMP,
                                                       Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.TIMESTAMP, Types.INTEGER});
    }


    /**
     * 修改用户信息
     *
     * @param user 用户对象
     * @return int
     */
    public int updateUser(User user) {

        String sql = "update user_info_t set username = ?, password = ?, name = ?, sex = ?, birthday = ?, address = ?, email = ?, telphone = ?, regisTime = ? where userid = ? ";

        return this.getJdbcTemplate().update(sql,
                                             new Object[]{user.getUserName(), user.getPassword(), user.getName(), user.getSex(), user.getBirthday(),
                                                          user.getAddress(), user.getEmail(), user.getTelphone(), user.getRegisTime(), user.getUserID()},
                                             new int[]{Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.INTEGER, Types.TIMESTAMP,
                                                       Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.TIMESTAMP, Types.INTEGER}
        );
    }


    /**
     * 删除用户信息,实际并不删除数据库中数据，只是将用户状态置为 FinalString.USER_STATUS_DEL
     *
     * @param  userID 用户编号
     * @return int
     */
    public int delUser(int userID){

        String sql = "update user_info_t set status = "+ FinalString.USER_STATUS_DEL +" where userid = " + userID;

        return this.getJdbcTemplate().update(sql);
    }

}

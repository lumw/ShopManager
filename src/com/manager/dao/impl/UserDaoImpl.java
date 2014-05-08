package com.manager.dao.impl;

import com.manager.dao.UserDao;
import com.manager.entity.User;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
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
 *  1     14-4-29        鲁梦维     版本创建
 *
 * </pre>
 */
public class UserDaoImpl extends JdbcDaoSupport implements UserDao {


    /**
     * 通过 用户名+密码 校验用户是否存在(用于用户登录)
     *
     * @param userName 登陆用户名
     * @param password 登陆密码
     * @return List
     */
    public User isUserExist(String userName, String password) {

        StringBuilder sql = new StringBuilder();

        sql.append("select * from user_info_t " );
        sql.append("where ");
        sql.append("username = ").append("'").append(userName).append("' ");
        sql.append("and ");
        sql.append("password = ").append("'").append(password).append("' ");

        RowMapper<User> rm = ParameterizedBeanPropertyRowMapper.newInstance(User.class);

        return this.getJdbcTemplate().queryForObject(sql.toString(), rm);
    }


    /**
     * 通过用户名校验用户是否存在(用于用户注册)
     *
     * @param userName 登陆用户名
     * @return List
     */
    public List isUserExist(String userName) {

        StringBuilder sql = new StringBuilder();

        sql.append("select count(*) from user_info_t ");
        sql.append("where ");
        sql.append("username = ").append("'").append(userName).append("' ");

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
        sql.append("insert into user_info_t(username, password, name, sex, birthday, address, email, telphone, regisTime, status) ");
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
     * 更改用户状态
     *
     * @param  userID 用户编号
     * @param  status 用户状态
     * @return int
     */
    public int updateUserStatus(int userID, int status){

        String sql = "update user_info_t set status = "+ status +" where userid = " + userID;

        return this.getJdbcTemplate().update(sql);
    }


    /**
     * 根据用户登录名查询用户所有信息
     * JdbcTemplate的queryForObject被强制要求返回一条记录,如果查询出的结果数不等以1，则抛出异常
     *
     * @param userName 用户登录名
     * @param password 用户密码
     * @return List
     */
    public List<User> getUserInfoByuserNameAndPwd(String userName, String password) {

        StringBuilder sql = new StringBuilder();

        sql.append("select * from user_info_t ");
        sql.append("where ");
        sql.append("username = ").append("'").append(userName).append("' ");
        sql.append("and ");
        sql.append("password = ").append("'").append(password).append("' ");

        RowMapper<User> rm = ParameterizedBeanPropertyRowMapper.newInstance(User.class);

        return this.getJdbcTemplate().query(sql.toString(), rm);
    }

}

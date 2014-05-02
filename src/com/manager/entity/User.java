package com.manager.entity;

import java.sql.Timestamp;

/**
 * <pre>
 * Insert Brief Description Here!
 * 日    期: 2014/5/2 0:19
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
public class User {

    private String userID;
    private String userName;
    private String password;
    private int sex;
    private Timestamp birthday;
    private String address;
    private String email;
    private String telphone;
    private Timestamp regisTime;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Timestamp getBirthday() {
        return birthday;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public Timestamp getRegisTime() {
        return regisTime;
    }

    public void setRegisTime(Timestamp regisTime) {
        this.regisTime = regisTime;
    }
}

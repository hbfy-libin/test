/*
* 员工类
* 属性包括：员工编号,姓名，性别，联系方式，员工可以操作Hotelmange接口。
* */
package com.hbfybj.javase.study.hotel;

public class Users {

    //定义员工编号
    private int userId;

    //定义员工姓名
    private String userName;

    //定义员工性别
    private Boolean sex;//false为女，true表示男

    private String userPhone;

    HotelMange manges;

    //构造方法

    public Users() {
    }

    public Users(int userId, String userName, Boolean sex, String userPhone) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.userPhone = userPhone;
    }

    //set and get方法

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

}

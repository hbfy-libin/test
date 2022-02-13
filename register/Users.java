/**
 * 编写程序模拟用户注册：
 * 1、程序开始执行时，提示用户输入“用户名”和“密码”信息。
 * 2、输入信息之后，后台java程序模拟用户注册。
 * 3、注册时用户名要求长度在[6-14]之间，小于或者大于都表示异常。
 *
 * 注意：
 * 	完成注册的方法放到一个单独的类中。
 * 	异常类自定义即可。
 *
 * 	class UserService {
 * 		public void register(String username,String password){
 * 			//这个方法中完成注册！
 *                }* 	}
 *
 * 	编写main方法，在main方法中接收用户输入的信息，在main方法
 * 	中调用UserService的register方法完成注册。
 */
package com.hbfybj.javase.study.register;

import com.hbfybj.javase.study.stack.day23.MyException;

import java.util.Objects;

public class Users extends Input  implements Checkable{

    //定义用户名
    String userName;

    //定义用户密码
    String userPassword;

    //构造方法
    public Users() {
    }

    public Users(String userName, String userPassword) throws MyException {

        this.userPassword = userPassword;
        //用户名长度校验，长度在6-14之间开始赋值
        if(userName.length() >= 6 && userName.length() <= 14)  this.userName = userName;
        else throw new MyException("Sorry,你输入的用户名不合法，用户名只允许6-14个字符！");//程序执行到此处说明用户名长度不符合要求
    }

    //set and get方法
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) throws MyException {
        if(userName.length() >= 6 && userName.length() <= 14)  this.userName = userName;  //用户名的长度在6-14之间开始赋值

        //程序执行到此处说明用户名长度不符合要求
        else throw new MyException("Sorry,你输入的用户名不合法，用户名只允许6-14个字符！");
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public Boolean check(String a,String b) {
        return this.userName.equals(a) && this.userPassword.equals(b);//判断密码是否一致。
    }

    @Override
    public String toString() {
        return  "恭喜您，注册成功；用户名： '"+ userName + '\'' +
                ", 密码：'" + userPassword + '\'';
    }

    @Override
    //equals方法用于判断用户名和密码是否一致。
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Users)) return false; // o不属于Users类型
        Users users = (Users) o; //强制类型转换
        return users.userName.equals(this.userName) && users.userPassword.equals(this.userPassword); //用户名和密码都一致。
    }

}

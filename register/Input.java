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

import java.util.Scanner;

public class Input {

    //定义用户名变量
    private String name;

    //定义密码变量
    private String password;

    //构造方法
    public Input() {
    }

    public Input(String name, String password) {
        this.name = name;
        this.password = password;
    }

    //set and  get 方法


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //接受用户键盘输入方法
    public void keyInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入用户名：");
        this.name = sc.next();
        System.out.print("请输入密码：");
        this.password = sc.next();
    }
}

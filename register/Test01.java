package com.hbfybj.javase.study.register;

public class Test01 {
    public static void main(String[] args) {

        //定义返回结果
        Boolean result = true;

        //调用注册方法提示输入相关信息直至注册成功
        do {
            //创建用户注册对象
            Input input = new UserService();


            //接受用户输入的用户名和密码，
            input.keyInput();

            //开始注册。
            if (input instanceof UserService) {
                UserService userSer = (UserService) input; //强制类型转换
                result = userSer.register(input.getName(), input.getPassword());//调用注册方法开始注册。
                if(result == true)  System.out.println(userSer.user.toString());//注册成功后返回注册相关信息
            }
        }while (result == false);

    }
}

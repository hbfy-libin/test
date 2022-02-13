package com.hbfybj.javase.study.hotel;

public class Test {
    public static void main(String[] args) {
/*        Room s = new Room();
        s.createRoom();
        s.check();
        s.reserveRoom();
        s.check();
        s.reserveRoom();
        s.checkOut();*/

        //users对象参与
        Users user1 =new Users(123,"张三",false,"13805611234");
        user1.manges = new Hotel();//多态创建Hotel对象。
        user1.manges.createRoom();
        user1.manges.toString();
        user1.manges.check();
        user1.manges.reserveRoom(1,1);
        user1.manges.reserveRoom(1,1);
        user1.manges.reserveRoom(1,2);
        user1.manges.chekOut(1,1);
        user1.manges.check();
    }
}

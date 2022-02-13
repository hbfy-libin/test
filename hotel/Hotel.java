
/*
* 实体酒店类：包括如下属性：酒店名称、酒店编号、酒店地址、酒店房间对象。
* */
package com.hbfybj.javase.study.hotel;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Hotel implements  HotelMange{

    //定义每层房间的数量
    final  static int ROOMNUM = 7;

    //定义楼层数
    final static int FLOOR = 5;

    //定义酒店名称
    private String hotelName;

    //定义酒店编号
    private int hotelId;

    //定义酒店地址
    private String hotelAddress;

    //定义酒店房间属性
    private Room[][] rooms;

    //构造方法
    public Hotel() {
        this.hotelName = hotelName;
        this.hotelId = hotelId;
        this.hotelAddress = hotelAddress;
        this.rooms = new Room[FLOOR][ROOMNUM];
    }

    public Hotel(String hotelName, int hotelId, String hotelAddress, Room[][] rooms) {
        this.hotelName = hotelName;
        this.hotelId = hotelId;
        this.hotelAddress = hotelAddress;
        this.rooms = new Room[FLOOR][ROOMNUM];
    }

    //set and get方法

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    //HotelMange 方法覆盖
    //查询房间状态方法
    @Override
    public void check() {
        //for循环遍历二位数组
        for (int i = 0; i < FLOOR; i++) {
            for (int j = 0; j < ROOMNUM; j++) {
                System.out.print("{" + rooms[i][j].getRoomId() + " "+ rooms[i][j].getRoomType() + " " + (rooms[i][j].getRoomStatus()? "有客":"空闲") + "} ");
            }
            System.out.println("");//一层进行换行
        }
        System.out.println("分割线  ========================================================================================================================== 分割线");
    }
    //定义退房方法
    @Override
    public void checkOut() {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入需要退房的楼层》》");
        int i = s.nextInt();
        System.out.println("请输入退房的房间编号》》");
        int j = s.nextInt();
        //判断房间的使用状态
        if (!rooms[i - 1][j - 1] .getRoomStatus()){
            System.out.println("对不起，你输入的房间为空闲状态，不可退订！");
            return;
        }else {
            rooms[i - 1][j - 1].setRoomStatus(false);//房间已退，状态为false。
            System.out.println("恭喜您  " + (i * 100 + j) + " 已退订成功！");
            return;
        }
    }
    //checkOut方法重载。
    @Override
    public void chekOut(int i, int j) {
        //判断房间的使用状态
        if (!rooms[i - 1][j - 1] .getRoomStatus()){
            System.out.println("对不起，你输入的房间已经为空闲状态，不可退订！");
            return;
        }else {
            rooms[i - 1][j - 1].setRoomStatus(false);//房间已退，状态为false。
            System.out.println("恭喜您  " + (i * 100 + j) + " 已退订成功！");
            return;
        }
    }

    //重写订房方法
    @Override
    public void reserveRoom() {
        //调用check方法查询房间信息
        this.check();
        Scanner s = new Scanner(System.in);
        System.out.println("请输入需要预定房间楼层》》");
        int i = s.nextInt();
        System.out.println("请输入房间编号》》");
        int j = s.nextInt();
        //判断房间的使用状态
        if (rooms[i - 1][j - 1] .getRoomStatus()){
            System.out.println("对不起，你预定的房间已经有客，请选择其他房间");
            return;
        }else {
            rooms[i - 1][j - 1].setRoomStatus(true);//房间已预定，状态为true。
            return;
        }
    }
    //reserveRoom方法重载
    public void reserveRoom(int i,int j ) {
        //判断房间的使用状态
        if (rooms[i - 1][j - 1] .getRoomStatus()){
            System.out.println("对不起，你预定的房间已经有客，请选择其他房间");
            return;
        }else {
            rooms[i - 1][j - 1].setRoomStatus(true);//房间已预定，状态为true。
            return;
        }
    }

    //创建房间基本信息方法
    @Override
    public void createRoom() {
        //for循环
        for (int i = 0; i < FLOOR; i++) {
            for (int j = 0; j < ROOMNUM; j++) {
                //rooms[i][j] = new Room((i + 1) * 100 + (j + 1),this.roomType,false);
                //三目运算
                this.rooms[i][j] = new Room((i + 1) * 100 + (j + 1),i >= 3 ? "商务间" : (i == 2 ? "单人间" : "标准间"),false);
            }
        }
    }

    @Override
    public String toString() {
       return rooms.toString();
    }
}

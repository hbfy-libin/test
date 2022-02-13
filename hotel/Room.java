/*为某个酒店编写程序：酒店管理系统，模拟订房、退房、打印所有房间状态等功能。
	1、该系统的用户是：酒店前台。
	2、酒店使用一个二维数组来模拟。“Room[][] rooms;”
	3、酒店中的每一个房间应该是一个java对象：Room
	4、每一个房间Room应该有：房间编号、房间类型、房间是否空闲.
	5、系统应该对外提供的功能：
		可以预定房间：用户输入房间编号，订房。
		可以退房：用户输入房间编号，退房。
		可以查看所有房间的状态：用户输入某个指令应该可以查看所有房间状态。
*/
package com.hbfybj.javase.study.hotel;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Room{

    //定义房间编号
    private int roomId;

    //定义房间类型
    private String roomType;

    //定义房间状态
    private Boolean roomStatus; //false为空房，ture为有客状态。

    //构造方法

    public Room() {
    }

    public Room(int roomId, String roomType, Boolean roomStatus) {
        this.roomId = roomId; //房间编号
        this.roomType = roomType; //房间类型
        this.roomStatus = roomStatus;//房间状态
    }

    //set and get方法

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Boolean getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(Boolean roomStatus) {
        this.roomStatus = roomStatus;
    }

    //重写toString方法
    @Override
    public String toString() {
        return "[" + this.roomId + this.roomType + (this.roomStatus ? "空闲" : "有客") + "]";
    }

    //重写equals方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Room)) return false;//如果o 为空或者o不能转换为Room 返回false。
        Room room = (Room) o;
        return roomId == room.roomId ;
    }

}

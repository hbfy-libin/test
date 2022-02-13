package com.hbfybj.javase.study.weapon;

public class HongZhaJi extends Weapon implements Moveable,Attackable{
    @Override
    public void attack() {
        System.out.println("已锁定位置，飞机准备轰炸！");
    }

    @Override
    public void move() {
        System.out.println("飞机已准备就绪，准备起飞！");
    }
}

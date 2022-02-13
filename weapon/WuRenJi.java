package com.hbfybj.javase.study.weapon;

public class WuRenJi extends Weapon implements Attackable,Moveable{
    @Override
    public void attack() {
        System.out.println("无人机已锁定目标，准备摧毁敌人！");
    }

    @Override
    public void move() {
        System.out.println("无人机已进入自动驾驶模式！");
    }
}

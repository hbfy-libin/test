package com.hbfybj.javase.study.weapon;

public class Cannon extends Weapon implements Attackable{

    @Override
    public void attack() {
        System.out.println("各单位注意，准备开炮！");
    }

}

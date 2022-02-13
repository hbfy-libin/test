/**
 *  开放型题目，随意发挥：
 * 	写一个类Army,代表一支军队，这个类有一个属性Weapon数组w（用来存储该军队所拥有的所有武器），
 * 	该类还提供一个构造方法，在构造方法里通过传一个int类型的参数来限定该类所能拥有的最大武器数量,
 * 	并用这一大小来初始化数组w。
 *
 * 	该类还提供一个方法addWeapon(Weapon wa),表示把参数wa所代表的武器加入到数组w中。
 * 	在这个类中还定义两个方法attackAll()让w数组中的所有武器攻击；
 * 	以及moveAll()让w数组中的所有可移动的武器移动。
 *
 * 	写一个主方法去测试以上程序。
 *
 * 	提示：
 * 		Weapon是一个父类。应该有很多子武器。
 * 		这些子武器应该有一些是可移动的，有一些
 * 		是可攻击的。
 */
package com.hbfybj.javase.study.weapon;

import com.hbfybj.javase.study.stack.day23.MyException;

public class Test01 {
    public static void main(String[] args) {

        //创建军队对象
        Army army = new Army(5);

        //军队开始获得武器
        try {
            army.addWeapon(new HongZhaJi());
            army.addWeapon(new Cannon());
            army.addWeapon(new Cannon());
            army.addWeapon(new HongZhaJi());
            army.addWeapon(new HongZhaJi());
            army.addWeapon(new HongZhaJi());
            army.addWeapon(new HongZhaJi());
            army.addWeapon(new HongZhaJi());

        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
            army.moveall();
            army.attackall();
    }
}

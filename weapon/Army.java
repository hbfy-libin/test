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

import java.lang.module.FindException;

public class Army {

    //定义军队允许的最大武器数量
    private int maxWeapon;

    private Weapon[] w ;

    //构造方法
    public Army() {
    }

    public Army(int maxWeapon) {
        this.maxWeapon = maxWeapon;

        w = new Weapon[maxWeapon];

    }

    //set and get 方法

    public int getMaxWeapon() {
        return maxWeapon;
    }

    public void setMaxWeapon(int maxWeapon) {
        this.maxWeapon = maxWeapon;
    }

    public Weapon[] getW() {
        return w;
    }

    public void setW(Weapon[] w) {
        this.w = w;
    }


    //定义w数组的索引变量

    private int index;

    //获得武器的方法

    public void  addWeapon(Weapon wa) throws MyException {

        if (index < w.length )  this.w[index++] = wa;  //武器数组中增加wa武器，index自增1
        else   throw new MyException("获得武器失败，武器已超限，请向上级Army申请增加武器数量！");//已经超出军队允许的最大武器数量抛出异常
    }

    //武器移动的方法

    public void moveall(){

        //for循环
        for (int i = 0; i < w.length; i++) {
            if (w[i] == null) return; //避免空指针异常
            if(w[i] instanceof Moveable){ //向下转型！
                ((Moveable) w[i]).move();
            }
        }
    }

    //武器攻击方法

    public void attackall(){
        //for循环
        for (int i = 0; i < w.length; i++) {
            if (w[i] == null) return;//避免空指针异常
            if(w[i] instanceof Attackable){
               ((Attackable) w[i]).attack();//向下强制转型！
            }
        }
    }
}

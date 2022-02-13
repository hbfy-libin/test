/*
* 生成5个随机数放入一维数组中，要求数组中的数不能重复
* */
package com.hbfybj.javase.study.Random;

import java.util.Arrays;
import java.util.Random;

public class RandomTest01 {

    //随机数边界常量声明
    final static int RANDOM = 20;

    //创建Random类的对象
    Random random = new Random();

    //创建int类型数组

    int arr[] = new int[5];

    //for循环遍历数组赋初值

    //定义数组索引index变量
    int index = 0;

    public void arrInsert() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = RANDOM + 10;  //赋初值为边界值+10，这样新生成的随机数排序后永远在左边
        }

        while (index < arr.length) {
            int resValue;

            //生成一个随机数赋值给resValue变量并调用ifExits方法判断数组中是否已存在该value
            if (!ifExits(resValue = random.nextInt(RANDOM))) {
                arr[index++] = resValue;//生成的随机数插入数组中，同时index自增1
            }
        }

        //遍历输出打印
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    //判断数组中是否存在该数据的方法,如果存在返回true,不存在返回false
    public   boolean ifExits(int a){
        //数组排序
          Arrays.sort(arr);

         //二分法查找，查到到该数值返回true，否则false
       return Arrays.binarySearch(arr,a) >= 0;
    }

    public static void main(String[] args) {
        RandomTest01 rd = new RandomTest01();
        rd.arrInsert();
    }

}

package com.hbfybj.javase.study;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection {
    public static void main(String[] args) {
        ArrayList co = new ArrayList();

        Iterator it = co.iterator();

        co.add(123);

        co.add("abcd");

        System.out.println(co.size());

        System.out.println(co.contains("abcd"));
        co.remove(1);

        System.out.println(co.contains("abcd"));

        co.add(32);


        //删除int类型元素32，无法自动装箱。
        co.remove(Integer.valueOf(32));

        String.valueOf(32);

        co.add("hello");

        //集合结构发生改变了，必须重新获取迭代器
        Iterator it1 = co.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
//            co.remove(it1.next()); 不能直接调用co对象的remove方法，需要重新获取迭代器
            it1.remove();
        }

        System.out.println("==" + co.size());


    }
}
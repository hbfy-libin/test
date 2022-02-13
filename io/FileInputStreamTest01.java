package com.hbfybj.javase.study.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest01 {
    public static void main(String[] args) {

        //定义byte数字
        byte[] by = new byte[1024];
        //创建输入流
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:\\Java学习\\day30作业.txt");

            //读数据
/*            fis.read(by);
            String res = new String(by);
            System.out.println(res);*/
            int num = 0;
            while((num = fis.read(by)) != -1 ){
                System.out.println(new String(by,0,fis.read(by)));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

package com.atguigu.exercise.homework2;

import java.io.File;
import java.io.IOException;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/3/2023 6:55 PM
 */
public class HomeWork2 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:/testIO/a.txt");
        System.out.println("D:/testIO/a.txt是否存在:"+f1.exists());

        System.out.println(f1.createNewFile());

        //文件名
        System.out.println(f1.getName());
        // 文件大小
        System.out.println(f1.length());
        // 文件的绝对路径
        System.out.println(f1.getAbsolutePath());
        // 文件的父路径
        System.out.println(f1.getParentFile());

        //判断File file = new File("d:\testIO");是否文件,是文件则输出：xxx是一个文件，是否文件夹,是文件夹则输出：xxx是一个文件夹
        File file = new File("D:/testIO");
        if (file.isFile()) {
            System.out.println(file+"是文件");
        }else if(file.isDirectory()){
            System.out.println(file+"是文件夹");
        }

        //删除a.txt文件
        System.out.println(f1.delete());

        //删除当前项目下的testIO文件夹下的1.txt文件,然后删除testIO文件夹
        File f2 = new File("testIO/1.txt");
        System.out.println(f2.delete());

        File f3 = new File("testIO");
        System.out.println(f3.delete());
    }
}

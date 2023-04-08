package com.atguigu.exercise.homework1;

import java.io.File;
import java.io.IOException;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/3/2023 6:40 PM
 * 1、使用绝对路径，在D盘下创建一个testIO文件夹，然后在testIO文件夹中创建一个1.txt文件
 * 2、使用相对路径，在当前项目下创建一个testIO文件夹，然后在testIO文件夹中创建一个1.txt文件
 */
public class HomeWork1 {
    public static void main(String[] args) throws IOException {
        //在D盘下创建一个testIO文件夹
        File f1 = new File("D:/testIO");
        f1.mkdir();


        //在testIO文件夹种创建一个1.txt文件
        File f2 = new File("D:/testIO/1.txt");
        f2.createNewFile();

        //相对路径
        File f3 = new File("testIo");
        System.out.println(f3.mkdir());

        File f4 = new File("testIO/1.txt");
        System.out.println(f4.createNewFile());

    }
}

package com.atguigu.file;

import java.io.File;
import java.util.Arrays;

/*
String[] list(): 获取到文件夹里所有的直接子文件(夹)组成的字符串数组
File[] listFiles(): 获取到文件夹里所有的直接子文件(夹)组成的File数组
 */
public class FileDemo2 {
    static int count = 0;

    public static void main(String[] args) {
        File f = new File("C:/Users/70794/Desktop");
        readFiles(f);
        /*String[] names = f.list();
        for(String name: names) {
            System.out.println(name.toUpperCase());
        }
        File[] files = f.listFiles();
       for(File file : files) {
           System.out.println(file.getName() + " is File = " + file.isFile());
       }*/
    }

    public static void readFiles(File f) {
        /*if (f.isFile()) {
            // 如果是一个文件，直接打印
            count++;
            System.out.println(f.getAbsolutePath());
        } else {
            // 如果是一个文件夹
            for (File file : f.listFiles()) {
                readFiles(file);
            }
        }*/
        if (f.isDirectory()) {
            for (File file : f.listFiles()) {
                readFiles(file);
            }
        } else {
            count++;
            System.out.println(f);
        }
    }
}

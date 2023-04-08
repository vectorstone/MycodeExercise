package com.atguigu.close;

import com.atguigu.bean.Person;

import java.io.*;
import java.util.Scanner;

/*
JDK7新增了 try...with...resources 语法，用来快速的关闭IO流
try...with...resources语法是对try...catch语句的修改
try(类型1 变量1 = new 类型1(); ... ... ){
}catch(异常类型 变量) {
}

try() 里创建的实例对象必须要实现AutoCloseable接口
*/
public class CloseDemo3 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("1.txt");
             FileOutputStream fos = new FileOutputStream("2.txt");
             FileWriter writer = new FileWriter("2.txt");
             Scanner scanner = new Scanner(System.in);
             Person p = new Person()) {
            // 操作流的代码
            for (int i = 0; i < 10000000; i++) {
                System.out.println(i);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

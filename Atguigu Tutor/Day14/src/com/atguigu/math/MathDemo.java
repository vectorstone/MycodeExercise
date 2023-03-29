package com.atguigu.math;

import java.util.Random;

/*
Math类用来实现数学相关的操作
    sqrt(double b): 开方
    pow(double m,double n): m的n次方
    abs(int x):绝对值
    round(double d):四舍五入保留到整数位
    floor(double d): 向下取整
    ceil(double d): 向上取整
    random(): 生成 [0,1)的随机浮点数
*/
public class MathDemo {
    public static void main(String[] args) {
        System.out.println(Math.sin(Math.PI / 6));
        System.out.println(Math.toRadians(180));
        System.out.println(Math.toDegrees(Math.PI));
        System.out.println(Math.sqrt(100));
        System.out.println(Math.pow(2, 10)); // 1024
        System.out.println(Math.round(6.723));

        System.out.println(Math.floor(3.98));  // 3.0
        System.out.println(Math.floor(-3.098));  // -4.0

        System.out.println(Math.ceil(3.098));  // 4.0
        System.out.println(Math.ceil(-3.98));  // -3

        for (int i = 0; i < 10000; i++) {
            System.out.println(Math.random());
        }

        // 生成 [0,100]的随机整数   5,90
        int x = (int) (Math.random() * 101);  // [0,101)
        int y = (int) (Math.random() * 86) + 5;  // [0,85]+5-->[5,90]
        // 生成[m,n]的随机整数
        // (int)(Math.random() * (n-m+1)) + m;


        // java.util.Random类也可以返回一个随机数
        Random random = new Random();

        // nextInt(int bound) 生成 [0,bound)的随机整数
        System.out.println(random.nextInt(101));
    }
}

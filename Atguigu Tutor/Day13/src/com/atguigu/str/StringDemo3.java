package com.atguigu.str;

import java.util.Arrays;

/*
将字符串分割成为字符串数组  split()
将字符串数字转换成为字符串  String.join()

String.format()
*/
public class StringDemo3 {
    public static void main(String[] args) {
        String str = "张三1tom2tony3王五4jerry5李四6henry";
        String[] names = str.split("\\d");
        System.out.println(Arrays.toString(names));
        System.out.println(names[5]);

        String[] heroes = {"孙悟空", "猪八戒", "程咬金", "东皇太一", "嫦娥"};
        // 孙悟空+猪八戒+程咬金+东皇太一+嫦娥
        String x = String.join("+", heroes);
        /*for (int i = 0; i < heroes.length; i++) {
            x += heroes[i];
            if (i != heroes.length - 1) x += "+";
        }*/
        System.out.println(x);

        System.out.printf("我是练习长达%.1f年的%02d号选手%s", 2.5, 8, "坤坤");
        String s = String.format("我是练习长达%.1f年的%02d号选手%s", 2.5, 8, "坤坤");
    }
}

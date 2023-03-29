package com.atguigu.regex;

import java.util.Arrays;

/*
正则表达式: 字母前面加 \\ 的特殊含义
    \\d 表示数字，等价于 [0-9]
    \\D 表示非数字，等价于 [^0-9]
    \\w 表示数字，字母和下划线，等价于 [0-9a-zA-Z_]
    \\W 表示非数字，字母和下划线，等价于 [^0-9a-zA-Z_]
    \\n 表示换行
    \\r 表示回车
    \\t 表示制表符
*/
public class RegexDemo3 {
    public static void main(String[] args) {
        System.out.println("h324r".matches("h\\d+r"));  // true

        String str = "zhangsan1lisi2jack3tony4jerry5";
        String[] names = str.split("[0-9]");
        System.out.println(Arrays.toString(names));

        System.out.println("heij_+()?<>r".matches("h\\D+r"));  // true
        System.out.println("heij_+(5?<>r".matches("h\\D+r"));  // false

        System.out.println("h23_ddui_r".matches("h\\w+r"));  // true
        System.out.println("h23-ddui_r".matches("h\\w+r"));  // false

        char c = '\n';
    }
}

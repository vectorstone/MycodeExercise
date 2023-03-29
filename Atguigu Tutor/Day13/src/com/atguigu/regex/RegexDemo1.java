package com.atguigu.regex;

import java.util.Arrays;

/*
String里的方法，形参名是 regex都表示需要一个正则表达式字符串
正则表达式是一个字符串，这个字符串可以对指定的字符串进行查询检索和替换
matches() / split() / replaceAll()

正则匹配规则:
1. 数字和字母表示它本身，没有特殊含义
2. 绝大部分标点符号都有特殊含义,如果想要表示字符串本身，需要加 \\
3. 部分字母前面加 \\ 会有特殊含义
*/
public class RegexDemo1 {
    public static void main(String[] args) {
        String s1 = "h4e4l45l3o".replaceAll("4", "x");
        System.out.println(s1); // hxexlx5l3o

        String s2 ="jack+tony+张三+henry+李四+merry";
        String[] names = s2.split("\\+");
        System.out.println(Arrays.toString(names));

        String s3 = "a2x";
        System.out.println(s3.matches("a\\dx"));
    }
}

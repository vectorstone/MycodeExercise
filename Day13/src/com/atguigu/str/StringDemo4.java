package com.atguigu.str;

/*
字符串的内存分析:  字符串是引用数据类型， == 比较的是内存地址

*/
public class StringDemo4 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");

        String s = "java";

        // 字符串是可以共享的,s1创建了hello字符串对象以后,s2没有创建，直接使用的s1的对象
        // 共享的前提是 字符串是不可变数据类型!
        System.out.println(s1 == s2);  // true

        System.out.println(s1 == s3);  // false

        // 使用"" 直接写的字符串字面量，会存入到 字符串常量池
        // 使用 关键字new 创建 字符串对象，存储在 堆里

        String s4 = "he";
        String s5 = "llo";

        // 变量使用+拼接，创建了三个字符串对象 "he"  "llo"   new String("hello")
        System.out.println(s4 + s5 == s1);  // false

        // "he" + "llo" --> 使用字符串的字面量直接相加，编译器会直接把它当做 "hello"
        System.out.println("he" + "llo" == s1); // true
    }
}

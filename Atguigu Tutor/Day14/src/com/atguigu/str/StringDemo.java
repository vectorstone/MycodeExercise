package com.atguigu.str;

/*
String字符串源码分析:
    JDK8以前，String内部维护了一个被   private final char[] value
    从JDK9开始，String内部维护了一个被 private final byte[] value

    目的是为了节省内存空间  char占用两个字节, byte占用1个字节
*/
public class StringDemo {
    public static void main(String[] args) {
        String s1 = new String("hello");
        // private final char []value = {'h','e','l','l','o'};

        String s2 = new String("world");

        s1 = s1 + s2;  // 如果字符串追加，效率是比较低
        System.out.println(s1);

        System.out.println(s1.length());  // 字符串的length方法

        int[] arr = {3, 7, 9};
        System.out.println(arr.length);  // 数组的属性

        /*
        JDK8->char[] value = {'a','b','c'}  --> {00000000 01100001,00000000 01100010, 00000000 01100011}
        JDK9->byte[] value= {97,98,99} --> {01100001, 01100010, 01100011};
        */
        String s3 = "abc";

        /*
        JDK8--> char[] value = {'伀','好','O'};
        JDK9-->byte[] value= { 0, 79, 125, 89, 79, 0}
         */
        String s4 = "伀好O";
        System.out.println(s4.length());  // 3
        System.out.println((char) 79);

        String x = "abc";
        System.out.println(x.length());  //  value.length >> 0

        String y = "你好a";
        System.out.println(y.length());  // value.length >> 1
    }
}

package com.atguigu.homework1;

public class Test03 {
    public static void main(String[] args) {
        /*String s = "hello world";
        s = s.substring(2, 7);
        System.out.println(s);*/

        String bigStr = "no hello world hello good yes hello ok";
        String smallStr = "hello";

        int count = 0;

        /*int index = bigStr.indexOf(smallStr);
        if (index != -1) {
            count++;
        }
        bigStr = bigStr.substring(index + smallStr.length());
        index = bigStr.indexOf(smallStr);
        if (index != -1) {
            count++;
        }*/
        int index;
        while ((index = bigStr.indexOf(smallStr)) != -1) {
            count++;
            bigStr = bigStr.substring(index + smallStr.length());
        }

        System.out.println(count);
    }
}

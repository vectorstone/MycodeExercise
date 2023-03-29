package com.atguigu.homework;

public class Test04 {
    public static void main(String[] args) {
        String bigStr = "no he+llo world he+llo good yes he+llo ok";
        String smallStr = "he+llo";

        String newStr = bigStr.replace(smallStr, "");
        System.out.println(newStr);

        System.out.println((bigStr.length() - newStr.length()) / smallStr.length());
    }
}

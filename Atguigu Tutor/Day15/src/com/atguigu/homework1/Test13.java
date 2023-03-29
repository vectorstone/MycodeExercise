package com.atguigu.homework1;

import java.util.Arrays;

public class Test13 {
    public static void main(String[] args) {
        String str = "12.hello245.world3698.java4210.string";

        // str = str.substring(2);
        // str = str.replace("1.","");
        str = str.replaceAll("^\\d+\\.", "");
        String[] words = str.split("\\d+\\.");
        System.out.println(Arrays.toString(words));
    }
}

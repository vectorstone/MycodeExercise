package com.atguigu.exercse;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/11/2023 10:20 PM
 */
public class test02 {
    public static void main(String[] args) {

        int length = args.length;
        System.out.println(length);
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}

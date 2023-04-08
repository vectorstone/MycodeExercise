package com.atguigu.exercise.reflect;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/7/2023 6:12 PM
 */
public class test01 {
    public static void main(String[] args) {
        Class<Integer> c1 = int.class;
        Class<Void> c2 = void.class;

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);


    }
}

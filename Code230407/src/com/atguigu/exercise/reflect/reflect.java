package com.atguigu.exercise.reflect;

import java.lang.reflect.Constructor;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/7/2023 9:18 PM
 */
public class reflect {
    public static void main(String[] args) throws ClassNotFoundException {
        //先获得类对象
        Class<?> clz = Class.forName("com.atguigu.exercise.reflect.Person");

        //获得类对象的所有空参构造方法
        Constructor<?>[] constructors = clz.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println(constructors.length);


    }
}

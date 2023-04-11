package com.atguigu.reflect;

import java.lang.reflect.Array;

/*
java.util.Arrays 是一个用来操作数组的工具类，可以对数组进行 sort(),toString(),equals() 方法
java.lang.reflect.Array 是反射包里的一个类，可以用来创建任意类型的数组

常见方法:
    Array.newInstance(Class<?> componentType, int length):
    Array.newInstance(Class<?> componentType, int... dimensions)
    Array.set(Object obj,int index,Object value)
    Array.get(Object obj,int index)
*/
public class ArrayDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        // int[] arr = new int[5];
        Object o1 = Array.newInstance(int.class, 5);
        Array.set(o1, 0, 7);  // arr[0] = 7;
        Array.set(o1, 1, 3); // arr[1] = 3
        System.out.println(Array.get(o1, 3));  // arr[3]


        // int[][] arr = new int[3][5];
        Object o2 = Array.newInstance(String.class, 3, 5);


        Object o3 = createArr("java.lang.String", 5);
        Object o4 = createArr("com.atguigu.bean.Person", 2);
    }

    public static Object createArr(String className, int length) throws ClassNotFoundException {
        Class<?> clz = Class.forName(className);
        return Array.newInstance(clz, length);
    }
}

package com.atguigu.box;

/*
基本数据类型 --> 基本包装类型  装箱
    1. 调用构造方法，将基本数据类型传入
    2. 调用静态方法 valueOf(基本数据类型)
    3. 直接将基本数据类型赋值给基本包装类型  自动装箱

基本包装类型 --> 基本数据类型  拆箱
    1. 调用 对象.xxxValue()方法就可以拆箱
    2. 自动拆箱

自动装箱和自动拆箱只对单个数值有效
 */
public class BoxDemo2 {
    public static void main(String[] args) {
        byte b = 2;
        // Byte a = new Byte(b);
        // Byte a = Byte.valueOf(b);
        Byte a = b;

        int x = 5;
        // Integer i = new Integer(x);
        // Integer i = Integer.valueOf(x);
        Integer i = x;


        Long l = new Long(2134542345L);
        // long m = l.longValue();
        long m = l;  // 自动拆箱

        int[] arr = {1, 2, 3};
        test1(arr);  // Object obj = arr;


        // 报错
        // test2(arr);
        // Object[] objs = new int[]{2, 1, 3};

        Integer[] nums = new Integer[]{1, 2, 3};
        test1(nums);  // Object obj = new Integer[]{1,2,3};
        test2(nums);  // Object[] objs = new Integer[]{1,2,3};
    }

    public static void test1(Object obj) {

    }

    public static void test2(Object[] objs) {

    }
}

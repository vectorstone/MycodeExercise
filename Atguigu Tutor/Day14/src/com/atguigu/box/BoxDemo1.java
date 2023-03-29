package com.atguigu.box;

/*
Java提供基本数据类型和引用数据类型，基本包装类型 是引用数据类型!!!

有一些情况下，需要将基本数据类型变成  对应的引用数据类型(基本包装类型)
    1. 泛型里只能使用引用数据类型，不能使用基本数据类型
    2. 数据库里整数类型的数据，如果没有值，默认值是 null;如果此时java里使用的是基本数据类型，会报错
    3. 数组里的特殊情况  Object[] objs = new int[]{1,2,3}; 报错
        Object[] objs = new Integer[]{1,2,3};  正确

  基本数据类型    基本包装类型(引用数据类型)
    byte           Byte
    short          Short
    int            Integer
    long           Long
    float          Float
    double         Double
    char           Character
    boolean        Boolean
*/
public class BoxDemo1 {
    public static void main(String[] args) {
        // 基本数据类型的特点: 不能使用面向对象的语法调用方法，访问属性
        int a = 0;
        // System.out.println(a.hashCode());  基本数据类型不能调用任何的方法

        String s = "hello";
        System.out.println(s.length());
        System.out.println(s.hashCode());
    }
}

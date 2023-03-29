package com.atguigu.box;

public class BoxDemo3 {
    public static void main(String[] args) {
        Integer i = 128;
        int x = 5;
        int y = 128;
        Integer j = 128;
        System.out.println(y == j);

        // 将 Integer类型的i自动拆箱成为int类型的数字
        System.out.println(i + x);
        System.out.println(i > x);

        // 将int类型的变量x自动装箱成为Integer类型的对象
        System.out.println(i.compareTo(x));

        // 基本数据类型的y和引用数据类型i做 == 比较，把引用数据类型的i拆箱了
        System.out.println(i == y);  // true

        // i和j都是引用数据类型 之间使用 == 比较的内存地址
        // 基本包装类型的整数如果在[-128,127]是同一块内存，超过127以后，会创建新的空间
        System.out.println(i == j); // false
        System.out.println(i.equals(j));  // true

        /*Student s1 = new Student("jack", 19, 98);
        Student s2 = new Student("tony", 20, 96);
        System.out.println(s1 == s2);*/

        Integer m = new Integer(20);
        Integer n = new Integer(20);
        System.out.println(m == n);

        // 引用数据类型不要使用 == 和 != 比较内容!!!! 调用equals()方法来比较
    }
}

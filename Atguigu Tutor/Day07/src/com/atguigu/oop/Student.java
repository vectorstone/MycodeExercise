package com.atguigu.oop;

public class Student {
    String name;
    int age = 19;
    String gender;
    int score;

    public static String job = "学生";

    public void eat() {
        System.out.println(name + "正在吃东西");
        System.out.println(job);
        study();
        test();
    }

    public void study() {
        System.out.println(name + "正在学习");
    }

    public static void demo() {
        System.out.println("good");
    }

    public static void test() {
        // study();
        demo();
        System.out.println(job);
        // System.out.println(name);
        System.out.println("hello");
    }
}


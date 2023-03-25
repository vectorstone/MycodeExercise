package com.atguigu.bean;

public class Student extends Person {
    public int x = 1;
    public int y = 2;

    public Student() {
        super();
        System.out.println("Student的构造方法被调用了" + this);
    }

    @Override
    public void eat() {
        System.out.println("学生正在吃东西");
    }

    public void study() {
        System.out.println("学生正在学习");
    }
}

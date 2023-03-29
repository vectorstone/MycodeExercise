package com.atguigu.bean;

public class Animal {
    public int x = 10;

    public Animal() {
        System.out.println("Animal的构造方法被调用了" + this);
        demo();
    }

    public void eat() {
        System.out.println("动物正在吃东西");
    }

    public void demo() {
        eat();
    }
}

package com.atguigu.bean;

public class Person extends Animal {
    public Person() {
        System.out.println("Person的构造方法被调用了" + this);
    }

    public int x = 5;

    @Override
    public void eat() {
        System.out.println("人正在吃东西");
    }

    public void useTools() {
        System.out.println("人正在使用工具");
    }

}

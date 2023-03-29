package com.atguigu.test.base;

public class Dog {
    private String name;
    private String color;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void work() {
        System.out.println("狗正在工作");
    }
}

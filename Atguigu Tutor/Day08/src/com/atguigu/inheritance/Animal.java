package com.atguigu.inheritance;

public class Animal {
    public String name;
    protected int age;
    String color;
    private double weight;

    public String x = "Animal";

    public void eat() {
        System.out.println("动物正在吃东西");
    }

    public void test() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(color);
        System.out.println(weight);
    }

    private void demo() {
        System.out.println("我是父类的私有方法demo");
    }

    protected Animal foo() {
        System.out.println("我是父类里的foo方法");
        return null;
    }

    public static void bar() {
        System.out.println("我是父类的静态方法bar");
    }
}

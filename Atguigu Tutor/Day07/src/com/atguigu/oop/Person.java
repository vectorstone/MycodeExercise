package com.atguigu.oop;

/*
类是对很多具有共同特征和行为的事物抽象统称
特征: 也被称为属性，在代码里以变量的形式表示
行为: 在代码里以方法的形式表示
*/
public class Person {
    String name;
    int age;
    String gender;
    double height;
    double weight;

    public void eat() {
        System.out.println("人正在吃东西");
    }

    public void sleep() {
        System.out.println("人正在睡觉");
    }

    public static void main(String[] args) {
        // 使用关键字new 创建了一个Person 类型的实例对象
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();

        // 可以通过对象访问类里定义的属性
        p1.name = "jack";
        p1.age = 18;

        p2.gender = "女";
        p2.height = 1.65;
        p2.weight = 51.5;

        p3.name = "jerry";
        p3.gender = "男";

        // 调用类里定义的方法
        p1.eat();
        p2.sleep();
    }
}

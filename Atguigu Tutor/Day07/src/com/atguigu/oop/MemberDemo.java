package com.atguigu.oop;

/*
一个.java文件里可以出现多个 class,但是最多只能有一个类被public修饰。而且被public修饰的类名必须要和文件名同名!
不推荐在一个 .java文件里定义多个类，标准的写法应该是一个.java文件出现一个外部类

局部变量: 定义在方法里的变量
成员变量: 定义在类里方法外的变量
区别:
    1. 定义的位置不同:
        局部变量定义在方法里
        成员变量定义在类里方法外
    2. 作用域不同: 变量能够被访问的范围
        局部变量: 只能在定义它的方法(或者{})里访问
        成员变量: 可以在本类里访问
    3. 默认值不同
        局部变量: 没有默认值，如果不赋值，不能使用
        成员变量: 有默认值，默认值和变量类型有关
            byte / short / int / long类型  默认值是0
            float / double 类型 默认值是0.0
            char类型   默认值是 编码为0的空字符
            boolean类型 默认值是 false
            引用数据类型 默认值是 null
    4. 存储的位置不同
        局部变量: 存储在栈区
        成员变量: 存储在堆区创建的实例对象上
    5. 生命周期不同(一个事物从产生到消亡的过程)
        局部变量: 方法调用时创建,方法调用结束就销毁
        成员变量: 随着对象的创建而创建，对象的销毁而销毁

*/
public class MemberDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.sleep();
        System.out.println(d.height);
        System.out.println(d.gender);
        System.out.println("hello");
    }
}

class Dog {
    int age;
    String gender;
    double height;
    double weight;

    public void eat() {
        int x = 5;
        /*int t;
        System.out.println(t);*/

        System.out.println(age);
        System.out.println("狗正在吃东西");
    }

    public void sleep() {
        // System.out.println(x);
        System.out.println("狗正在睡觉");
        System.out.println(gender);
    }
}

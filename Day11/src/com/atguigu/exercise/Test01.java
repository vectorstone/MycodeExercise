package com.atguigu.exercise;

class HelloA {
    public HelloA() {
        System.out.println("HelloA");
    }

    {
        System.out.println("I'm A Class");
    }
}

class HelloB extends HelloA {
    public HelloB() {
        System.out.println("HelloB");
    }

    {
        System.out.println("I'm B Class");
    }
}

public class Test01 {
    public static void main(String[] args) {
        /*
        实例对象的初始化过程:
        1. HelloB里的非静态成员变量设置默认值
        2. 调用构造器里的 super() /this() 初始化父类空间
            2.1  HelloA里的非静态成员变量设置默认值
            2.2 调用HelloA构造器里的 super() /this() 初始化HelloA的父类空间
            2.3 执行HelloA构造代码块以及给非静态成员变量赋值
            2.4 执行HelloA构造器里其他代码
        3. 执行构造代码块以及给非静态成员变量赋值
        4. 执行构造器里其他代码
         */
        new HelloB();
    }
}


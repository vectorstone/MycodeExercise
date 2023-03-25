package com.atguigu.test05;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/23/2023 8:52 PM
 */
public class Test05 {

    public static void main(String[] args) {
        new A(new B());
    }
}

class A {
    public A() {
        System.out.println("A");
    }

    public A(B b) {
        this();//这个是不是调用空参构造器的意思
        System.out.println("AB");
    }
}

class B {
    public B() {
        System.out.println("B");
    }
}
package com.atguigu.exercise;

public class Test05 {
    public static void main(String[] args) {
       /* B b = new B();  // B
        A a = new A(b);  // A AB*/
        new A(new B());
    }
}

class A {
    public A() {
        System.out.println("A");
    }

    public A(B b) {
        this();
        System.out.println("AB");
    }
}

class B {
    public B() {
        System.out.println("B");
    }
}

package com.atguigu.exercise;

public class Exercise2 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();
        System.out.println("(1)" + a1.show(b));  // A and A
        /*
        A a2 = new B();  有多态
        编译看左边声明的类型 A,已经决定了只能调用 show(A obj)这个方法!!!
        运行看右边对象的类型 B,会执行 B类里的 show(A obj)方法
         */
        System.out.println("(2)" + a2.show(d));

        System.out.println("(3)" + b.show(c));  // A and C
        System.out.println("(4)" + b.show(d));  // B and B
    }
}

class A {
    public String show(C obj) {
        return ("A and C");
    }

    public String show(A obj) {  // A obj = d;
        return "A and A";
    }
}

class B extends A {
    public String show(B obj) {
        return "B and B";
    }

    public String show(A obj) {
        return "B and A";
    }
}

class C extends B {

}

class D extends B {

}
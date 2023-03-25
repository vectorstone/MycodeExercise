package com.atguigu.bean.polymorphism.test05;

/**
 * @Description: test05
 * @Author: Gavin
 * @Date: 3/21/2023 10:38 AM
 */
public class Test05 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();
        System.out.println("(1)" + a1.show(b));//(1)A and A
        System.out.println("(2)" + a2.show(d));//(2)B and A  好奇怪
        /*
        * A a2 = new B(); 有多态
        * 编译看左边声明的类型A,已经决定了只能调用show(A obj)这个方法!!!
        * 运行看右边对象的类型B,会执行B类里面的show(A obj)方法
        * */
        System.out.println("(3)" + b.show(c));//(3)A and C
        System.out.println("(4)" + b.show(d));//(4)B and B
    }
}

class A {
    public String show(C obj) {
        return ("A and C");
    }

    public String show(A obj) {
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

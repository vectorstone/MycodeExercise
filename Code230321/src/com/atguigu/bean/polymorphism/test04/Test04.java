package com.atguigu.bean.polymorphism.test04;

/**
 * @Description: test04
 * @Author: Gavin
 * @Date: 3/21/2023 10:34 AM
 */
public class Test04 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();
        System.out.println("(1)" + a1.show(b));//编译看A,运行看A  (1)A and A
        System.out.println("(2)" + a2.show(d));//编译看A,运行看B  (2)A and D
        System.out.println("(3)" + b.show(c));//编译B,运行B      (3)B and B
        System.out.println("(4)" + b.show(d));//               (4)A and D
    }
}
class A{
    public String show(D obj){
        return ("A and D");
    }
    public String show(A obj){
        return "A and A";
    }
}
class B extends A{
    public String show(B obj){
        return "B and B";
    }
    public String show(A obj){
        return "B and A";
    }
}
class C extends B{

}
class D extends B{

}
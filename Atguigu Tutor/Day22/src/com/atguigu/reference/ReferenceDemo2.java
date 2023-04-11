package com.atguigu.reference;

import com.atguigu.bean.Person;
import org.junit.Test;

/*
lambda表达式的方法引用:
    类名A:: 静态方法名
        接口里的抽象方法没有用到 A类，只是在实现抽象方法时，调用了 A类里的静态方法
        而且静态方法里的参数正好就是抽象方法里的参数
    实例对象名:: 实例方法名
    类名:: 实例方法名
*/
public class ReferenceDemo2 {
    // 演示  类名::静态方法名
    public void reference1(A a) {
        a.aFunction();
    }

    public void reference1(B b, int m, int n, int t) {
        b.bFunction(m, n, t);
    }

    @Test
    public void testReference1() {
        /*reference1(new A() {
            @Override
            public void aFunction() {
                Person.demo();
            }
        });*/
        // reference1(()-> Person.demo());
        reference1(Person::demo);

        /*reference1(new B() {
            @Override
            public void bFunction(int x, int y, int z) {
                Person.foo(x, y, z);
            }
        }, 5, 6, 7);*/
        reference1(Person::foo, 3, 4, 5);
    }
}

@FunctionalInterface
interface A {
    void aFunction();
}

@FunctionalInterface
interface B {
    void bFunction(int x, int y, int z);
}


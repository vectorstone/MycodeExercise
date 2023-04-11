package com.atguigu.reference;

import com.atguigu.bean.Person;
import org.junit.Test;

/*
lambda表达式:
    方法引用:
        类名::静态方法名
            接口里的抽象方法没有用到类A,只是在实现抽象方法时，调用到了A类的静态方法
            同时A类静态方法里形参和抽象方法里的形参一致
        对象名::实例方法名
            接口的抽象方法没有用到对象a,只是在实现抽象方法时，调用到了对象a的实例方法
            同时a实例方法的形参和抽象方法的形参一致
        类名::实例方法名
            接口的抽象方法需要一个实例对象a作为参数，实现抽象方法时，调用了a对象的实例方法
            同时a对象的实例方法形参和抽象方法的形参一致
    构造器引用:   类名::new
        实现抽象方法时，调用构造方法创建了一个实例对象a，并且构造方法里的参数和抽象方法里的参数一致
        通常抽象方法的返回值不是void,而是一个 a类型
    数组引用:    类名[]::new
        实现抽象方法时，创建了一个数组，长度正好是抽象方法的形参
        要求:抽象方法必须要返回一个数组
 */
public class ReferenceDemo1 {
    Person p = new Person("jack", 18);

    public void ref1(int x, int y, A a) {
        int m = a.aFunction(x, y);
        System.out.println(m);
    }

    public void ref2(B b) {
        b.bFunction();
    }

    public void ref3(String x, C c) {
        c.cFunction(x);
    }

    public void ref4(Person a, D d) {
        d.dFunction(a);
    }

    public void ref5(Person a, String s, E e) {
        e.eFunction(a, s);
    }

    @Test
    public void testClassStaticRef() {
        // 类名:: 静态方法名 的方法引用
        ref1(2, 4, Integer::sum);
    }

    @Test
    public void testInstanceMethodRef() {
        // 实例对象名:: 实例方法名 的方法引用
        /*ref2(new B() {
            @Override
            public void bFunction() {
                p.eat();
            }
        });*/
        // ref2(() -> p.eat());
        ref2(p::eat);

        /*ref3("教室", new C() {
            @Override
            public void cFunction(String s) {
                p.sleep(s);
            }
        });*/
        // ref3("教室", s -> p.sleep(s));
        ref3("教室", p::sleep);
    }

    @Test
    public void testClassMethodRef() {
        // 类名:: 实例方法  方法引用
        /*ref4(p, new D() {
            @Override
            public void dFunction(Person x) {
                x.eat();
            }
        });*/
        // ref4(p, x -> x.eat());
        ref4(p, Person::eat);

        /*ref5(p, "床上", new E() {
            @Override
            public void eFunction(Person x, String s) {
                x.sleep(s);
            }
        });*/
        // ref5(p, "床上", (x, s) -> x.sleep(s));
        ref5(p, "床上", Person::sleep);
    }
}

interface A {
    int aFunction(int a, int b);
}

interface B {
    void bFunction();
}

interface C {
    void cFunction(String s);
}

interface D {
    void dFunction(Person x);
}

interface E {
    void eFunction(Person x, String s);
}

package com.atguigu.inter;

public class Son extends Father implements Demo, A {
    @Override
    public void demo() {
        System.out.println("Son实现了Demo接口里的demo方法");
    }

    @Override
    public void aMethod() {

    }

    public void test1() {
        System.out.println("我是Son里的test1方法");
    }

    @Override
    public void test4() {
        // System.out.println("我是Son里的test4方法");

        // 如果在重写时想要调用某个父接口里的方法，可以使用 父接口名.super.方法名();
        Demo.super.test4();
    }
}

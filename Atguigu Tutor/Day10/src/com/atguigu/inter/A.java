package com.atguigu.inter;

public interface A extends B, C {
    void aMethod();

    public default void test1() {
        System.out.println("我是A接口里的test1方法");
    }

    public default void test2() {
        System.out.println("我是A接口里的test2方法");
    }

    public default void test4() {
        System.out.println("我是A接口里的test4方法");
    }
}

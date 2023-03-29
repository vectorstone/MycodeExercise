package com.atguigu.inter;

public interface Demo {
    /*public static final*/ int x = 10;

    /*public abstract*/ void demo();

    /*public*/ default void test() {
        System.out.println("我是有方法体的test方法");
    }

    /*public*/ static void foo() {
        System.out.println("我是接口里的静态方法foo");
    }
    private void bar() {
        System.out.println("我是接口里的私有方法bar");
    }

    public default void test1() {
        System.out.println("我是Demo接口里的test1方法");
    }
    public default void test2() {
        System.out.println("我是Demo接口里的test2方法");
    }
    public default void test3() {
        System.out.println("我是Demo接口里的test3方法");
    }

    public default void test4() {
        System.out.println("我是Demo接口里的test4方法");
    }
}

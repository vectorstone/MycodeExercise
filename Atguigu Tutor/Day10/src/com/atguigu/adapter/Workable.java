package com.atguigu.adapter;

public interface Workable {
    default void beforeWork() {
        test();
        System.out.println("工作之前先吃东西");
    }
    private void test() {
        System.out.println("hello");
    }

    void work();

    default void afterWork() {
        System.out.println("工作之后休息");
    }
}

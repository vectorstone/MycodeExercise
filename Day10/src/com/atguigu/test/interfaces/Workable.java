package com.atguigu.test.interfaces;

public interface Workable {
    default void beforeWork() {
        System.out.println("工作之前吃东西");
    }

    void work();

    default void afterWork() {
        System.out.println("工作之后休息");
    }
}

package com.atguigu.adapter;

public class Dog implements Workable {
    @Override
    public void work() {
        System.out.println("狗正在看门");
    }
}

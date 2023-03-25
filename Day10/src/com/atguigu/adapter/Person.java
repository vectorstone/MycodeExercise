package com.atguigu.adapter;

public class Person implements Workable {
    @Override
    public void work() {
        System.out.println("人正在公司写代码");
    }

    @Override
    public void afterWork() {
        System.out.println("人工作完了玩儿游戏");
    }
}

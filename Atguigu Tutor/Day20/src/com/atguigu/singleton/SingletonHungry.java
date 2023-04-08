package com.atguigu.singleton;

public class SingletonHungry {
    private final static SingletonHungry instance = new SingletonHungry();

    private SingletonHungry() {
    }

    public static SingletonHungry getInstance() {
        return instance;
    }
}

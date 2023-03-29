package com.atguigu.test;


import com.atguigu.test.interfaces.Workable;

public class Person {
    private String name;
    private Workable workable;

    public Person(String name, Workable workable) {
        this.name = name;
        this.workable = workable;
    }

    public void workWithWorkable() {
        this.workable.work();
    }
}

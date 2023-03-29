package com.atguigu.permission;

import com.atguigu.inheritance.Animal;

public class Dog extends Animal {
    public void watchHome() {
        System.out.println(name);
        System.out.println(age);
        // System.out.println(color);
        System.out.println("狗正在看家");
    }
}

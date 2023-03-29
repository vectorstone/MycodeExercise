package com.atguigu.test;

public class LeadingDog extends Dog {

    public LeadingDog(String name, String color) {
        super(name, color);
    }

    @Override
    public void work() {
        System.out.println("导盲犬正在领路");
    }
}

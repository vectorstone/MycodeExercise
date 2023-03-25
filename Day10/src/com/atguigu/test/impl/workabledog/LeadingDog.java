package com.atguigu.test.impl.workabledog;

import com.atguigu.test.abs.WorkableDog;

public class LeadingDog extends WorkableDog {

    public LeadingDog(String name, String color) {
        super(name, color);
    }

    @Override
    public void work() {
        System.out.println("导盲犬正在领路");
    }
}

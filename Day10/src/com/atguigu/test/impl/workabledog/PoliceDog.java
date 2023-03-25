package com.atguigu.test.impl.workabledog;

import com.atguigu.test.abs.WorkableDog;

public class PoliceDog extends WorkableDog {
    public PoliceDog(String name, String color) {
        super(name, color);
    }

    @Override
    public void work() {
        System.out.println("警犬正在攻击敌人");
    }
}

package com.atguigu.test;

public class PoliceDog extends Dog {
    public PoliceDog(String name, String color) {
        super(name, color);
    }

    @Override
    public void work() {
        System.out.println("警犬正在攻击敌人");
    }
}

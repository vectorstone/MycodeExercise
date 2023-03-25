package com.atguigu.test;

public class DrugDog extends Dog {
    public DrugDog(String name, String color) {
        super(name, color);
    }

    @Override
    public void work() {
        System.out.println("缉毒犬正在搜毒");
    }
}

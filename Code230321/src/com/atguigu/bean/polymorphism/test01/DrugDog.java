package com.atguigu.bean.polymorphism.test01;

/**
 * @Description: watchdog
 * @Author: Gavin
 * @Date: 3/21/2023 6:53 PM
 */
public class DrugDog extends dog {

    public DrugDog(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println("缉毒犬查找毒品");
    }
}

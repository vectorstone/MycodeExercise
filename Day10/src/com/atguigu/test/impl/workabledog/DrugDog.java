package com.atguigu.test.impl.workabledog;

import com.atguigu.test.abs.WorkableDog;
import com.atguigu.test.base.Dog;
import com.atguigu.test.interfaces.Workable;

public class DrugDog extends Dog implements Workable {
    public DrugDog(String name, String color) {
        super(name, color);
    }

    @Override
    public void work() {
        System.out.println("缉毒犬正在搜毒");
    }
}

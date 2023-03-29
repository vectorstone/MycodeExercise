package com.atguigu.test.impl.workabledog;

import com.atguigu.test.abs.WorkableDog;

public class SearchDog extends WorkableDog {
    public SearchDog(String name, String color) {
        super(name, color);
    }

    @Override
    public void work() {
        System.out.println("搜救犬正在搜寻生命");
    }
}

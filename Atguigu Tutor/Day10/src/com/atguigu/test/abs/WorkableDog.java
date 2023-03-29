package com.atguigu.test.abs;

import com.atguigu.test.interfaces.Workable;
import com.atguigu.test.base.Dog;

public abstract class WorkableDog extends Dog implements Workable {
    private String place;
    public WorkableDog(String name, String color) {
        super(name, color);
    }
}

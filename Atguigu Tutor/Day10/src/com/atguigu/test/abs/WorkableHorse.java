package com.atguigu.test.abs;


import com.atguigu.test.base.Horse;
import com.atguigu.test.interfaces.Workable;

public abstract class WorkableHorse extends Horse implements Workable {
    private String workPlace;

    public WorkableHorse(String name, String color, String workPlace) {
        super(name, color);
        this.workPlace = workPlace;
    }
}

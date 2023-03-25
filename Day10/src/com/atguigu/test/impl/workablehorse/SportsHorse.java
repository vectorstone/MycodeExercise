package com.atguigu.test.impl.workablehorse;

import com.atguigu.adapter.Workable;
import com.atguigu.test.abs.WorkableHorse;
import com.atguigu.test.base.Horse;

public class SportsHorse extends WorkableHorse {
    public SportsHorse(String name, String color, String workPlace) {
        super(name, color, workPlace);
    }

    @Override
    public void work() {
        System.out.println("马正在赛跑");
    }
}

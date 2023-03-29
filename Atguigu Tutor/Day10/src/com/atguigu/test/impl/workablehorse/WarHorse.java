package com.atguigu.test.impl.workablehorse;

import com.atguigu.test.abs.WorkableHorse;

public class WarHorse extends WorkableHorse {
    public WarHorse(String name, String color, String workPlace) {
        super(name, color, workPlace);
    }

    @Override
    public void work() {
        System.out.println("战马正在冲锋");
    }
}

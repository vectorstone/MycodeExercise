package com.atguigu.poly;

public class PoliceDog {
    private String name;
    private String color;

    public PoliceDog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void attackEnemy() {
        System.out.println("警犬正在攻击敌人");
    }
}

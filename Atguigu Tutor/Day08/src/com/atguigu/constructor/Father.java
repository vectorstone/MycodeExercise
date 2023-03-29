package com.atguigu.constructor;

public class Father {
    public int x;

    public Father() {
        System.out.println("Father的构造方法被调用了");
    }

    public Father(int x) {
        this.x = x;
    }
}

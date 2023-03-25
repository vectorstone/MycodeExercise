package com.atguigu.constructor;

public class Son extends Father {
    public int y;

    public Son() {
        System.out.println("Son的构造方法被调用了");
    }

    public Son(int x) {
        super(x);
    }

    public Son(int x, int y) {
        super(x);
        this.y = y;
    }
}

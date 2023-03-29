package com.atguigu.block;

public class ConstructorBlock extends Father {
    int a = 2;

    String s;

    {
        System.out.println("创建了ConstructorBlock实例对象了!!!");
        System.out.println("构造代码块里的a = " + a);
        test();
    }

    int b = 6;

    public ConstructorBlock() {
        System.out.println("构造方法被调用了");
    }

    public ConstructorBlock(int a) {
        this.a = a;
    }

    public ConstructorBlock(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public ConstructorBlock(int a, String s) {
        this.a = a;
        this.s = s;
    }

    public ConstructorBlock(int a, int b, String s) {
        this.a = a;
        this.b = b;
        this.s = s;
    }

    public void test() {
        System.out.println("test方法里,b = " + b);
    }
}

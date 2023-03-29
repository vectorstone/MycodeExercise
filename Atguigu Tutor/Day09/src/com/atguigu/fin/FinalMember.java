package com.atguigu.fin;

public class FinalMember {
    int x;  // 没有被final修饰，成员变量如果不赋值，有默认值
    final int a = 5;  // 直接赋值

    private final int b;  // 在构造方法里赋值

    private final int c;  // 在构造代码块里赋值(不推荐)

    {
        c = 7;
    }

    public final static int X = 3;  // 最常用的，静态成员常量

    public FinalMember(int b) {  // 在构造方法里给被final修饰的变量赋值
        this.b = b;
    }

    public FinalMember(int b, int x) {
        this.b = b;
        this.x = x;
    }

    // public FinalMember(){}  在这个构造方法里，没有给final变量b赋值
}

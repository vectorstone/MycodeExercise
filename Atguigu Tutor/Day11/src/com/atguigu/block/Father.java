package com.atguigu.block;

public class Father {
    int m = 3;
    {
        System.out.println("Father构造代码块被调用了");
    }

    public Father(){
        System.out.println("Father的空参数构造器被调用了");
    }

    public Father(boolean x) {
        System.out.println("Father里有参构造方法被调用了");
    }

    static {
        System.out.println("父类里访问子类的静态成员变量" + StaticBlock.x);
        System.out.println("Father类被加载了");
    }
}

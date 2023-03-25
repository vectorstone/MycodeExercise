package com.atguigu.block;

public class StaticBlock extends Father{
    public static int x = 10;

    static {
        System.out.println("StaticBlock被加载到内存的方法区了");
        // System.out.println(a);
        System.out.println(x);  // 静态代码块只能访问静态属性
        demo();
    }

    static int y = 4;

    public static void test() {
        System.out.println("StaticBlock里的静态方法test被调用了");
    }

    public static void demo() {
        System.out.println("demo方法里的y = " + y);
    }

}

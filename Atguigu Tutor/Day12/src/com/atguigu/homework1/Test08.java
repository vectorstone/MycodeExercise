package com.atguigu.homework1;

/*
一、类的初始化
    1. 静态成员变量设置默认值
    2. 初始化父类
        2.1 父类静态成员变量设置默认值
        2.2 初始化父类的父类
        2.3 父类静态成员变量赋值以及执行静态代码块
            （1）i -> 0
            （3）父类静态代码块 ->1
    3. 静态成员变量赋值以及执行静态代码块
        （6）k -> 0
        （8）子类静态代码块 -> 1

二、实例对象的初始化
    1. 非静态成员变量设置默认值
    2. 调用构造方法里的 super() / this() 初始化父类空间
        2.1 父类非静态成员变量设置默认值
        2.2 父类调用构造方法里的 super() / this() 初始化父类空间
        2.3 执行父类构造代码块以及给非静态成员变量赋值
            （2）j->1
            （4）父类非静态代码块，又称为构造代码块->2
        2.4 执行父类构造方法里的其他代码
            （5）父类构造器 -> 2
    3. 执行构造代码块以及给非静态成员变量赋值
        （7）h->1
        （9）子类非静态代码块，又称为构造代码块->2
    4. 执行构造方法里的其他代码
        （10）子类构造器 -> 2
 */
public class Test08 {
    public static void main(String[] args) {
        Zi z = new Zi();
    }
}

class Fu {
    private static int i = getNum("（1）i");
    private int j = getNum("（2）j");

    static {
        print("（3）父类静态代码块");
    }

    {
        print("（4）父类非静态代码块，又称为构造代码块");
    }

    Fu() {
        print("（5）父类构造器");
    }

    public static void print(String str) {
        System.out.println(str + "->" + i);
    }

    public static int getNum(String str) {
        print(str);
        return ++i;
    }
}

class Zi extends Fu {
    private static int k = getNum("（6）k");
    private int h = getNum("（7）h");

    static {
        print("（8）子类静态代码块");
    }

    {
        print("（9）子类非静态代码块，又称为构造代码块");
    }

    Zi() {
        print("（10）子类构造器");
    }

    public static void print(String str) {
        System.out.println(str + "->" + k);
    }

    public static int getNum(String str) {
        print(str);
        return ++k;
    }
}


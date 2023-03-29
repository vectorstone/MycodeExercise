package com.atguigu.homework1;

/*
一、类的初始化
    1. 静态成员变量设置默认值
    2. 初始化父类
        2.1 父类静态成员变量设置默认值
        2.2 初始化父类的父类
        2.3 父类静态成员变量赋值以及执行静态代码块
    3. 静态成员变量赋值以及执行静态代码块
        静态成员变量t1的初始化:
             1:j i=0 n=0
             2:构造块 i=1 n=1
             3:t1 i=2 n=2
         静态成员变量t2的初始化:
            4:j i=3 n=3
            5:构造块 i=4 n=4
            6:t2 i=5 n=5
        静态成员变量i的初始化
            7:i i=6 n=6
        静态代码块:
            8:静态块 i=7 n=99
二、实例对象的初始化
    1. 非静态成员变量设置默认值
    2. 调用构造方法里的 super() / this() 初始化父类空间
        2.1 父类非静态成员变量设置默认值
        2.2 父类调用构造方法里的 super() / this() 初始化父类空间
        2.3 执行父类构造代码块以及给非静态成员变量赋值
        2.4 执行父类构造方法里的其他代码
    3. 执行构造代码块以及给非静态成员变量赋值
    4. 执行构造方法里的其他代码

*/
public class T {
    public static int k = 0;
    public static T t1 = new T("t1");
    public static T t2 = new T("t2");
    public static int i = print("i");
    public static int n = 99;

    public int j = print("j");

    {
       print("构造块");
    }

    static {
        print("静态块");
    }

    public T(String str) {
        System.out.println((++k) + ":" + str + "  i=" + i + "  n=" + n);
        ++n;
        ++i;
    }

    public static int print(String str) {
        System.out.println((++k) + ":" + str + "  i=" + i + "  n=" + n);  //7:i i=6 n=6
        ++n;
        return ++i;
    }

    public static void main(String[] args) {
        System.out.println(T.k); // 8
        System.out.println(T.i); // 8
        System.out.println(T.n); // 100
        System.out.println(T.t1.j);  // 1
        System.out.println(T.t2.j); // 4
    }
}

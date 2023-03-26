package com.atguigu.exception;

import java.io.FileNotFoundException;

/*
throw 用在方法体里，表示往外抛出一个异常
    如果在方法调用的过程中，一直没有方法处理这个异常，最终会抛给 main方法
    main方法处理异常的默认方式是，通知JVM终止程序，并以退出码1告知操作系统
throws 用在方法声明上，声明这个方法抛出了一个异常
    如果方法体里抛出的异常类型是 RuntimeException,方法声明上的throws可以省略
    如果方法体里抛出的不是运行时异常，方法声明上的 throws不能省略!
 */
public class ThrowDemo {
    public static void main(String[] args) {
        int a = demo(12, 2);
        System.out.println(a);

        try {
            demo(1, 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("除数不能为0");
        }

        System.out.println("hello");
    }

    public static int demo(int x, int y) {
        return test(x, y);
    }

    public static int test(int x, int y) {
        return divide(x, y);
    }

    public static int divide(int x, int y) {
        if (y != 0)
            return x / y;
        throw new ArithmeticException("除数不能为0");
    }

    public static void xxx() throws FileNotFoundException {
        throw new FileNotFoundException();
    }
}

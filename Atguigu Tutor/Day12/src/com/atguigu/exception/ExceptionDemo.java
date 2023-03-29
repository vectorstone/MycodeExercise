package com.atguigu.exception;

/*
异常就是程序运行过程中出现的不正常的情况:
Throwable类:
    |-- Error: 错误，程序员不应该尝试解决，只能在前期避免的问题
    |-- Exception: 异常，程序员应该尝试解决的问题
        |-- RuntimeException: 运行时异常,编译能够通过，运行时如果有错误会报错
            |-- ArrayIndexOutOfBoundsException 数组下标越界异常
            |-- StringIndexOutOfBoundsException 字符串下标越界异常
            |-- NullPointerException   空指针异常
            |-- ClassCastException     类型转换异常
            |-- NumberFormatException  数字格式异常
            |-- InputMismatchException 输入不匹配异常
            |-- ArithmeticException    算法异常
        非运行时异常，也叫编译时异常，如果有异常编译都无法通过
        |--IOException
            |-- UnsupportedEncodingException: 不支持的编码异常
            |-- FileNotFoundException: 文件未找到异常
        |-- ParseException


异常Exception又分为两大类:
    运行时异常: 继承自 RuntimeException的异常，成为运行时异常。
        编译可以通过，运行时如果有问题，会报错
    编译时异常: 没有继承 RuntimeException,直接继承 Exception的异常称为 编译时异常
        编译时异常，编译都无法通过

异常处理的两大方式:
    1. 规避，使用条件判断语句，提前避开出现异常的条件，让异常不要发生
        规避只能用来避开 运行时异常RuntimeException 或者 错误Error 编译时异常无法提前规避!
    2. 处理异常:
        (1) 使用try...catch语句
        (2) 使用throw/throws抛出异常
        (3) try...finally / try...catch...finally语句
*/

import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {
        int x = sum(100);
        System.out.println(x);

        divide(10, 0);
    }

    public static int sum(int n) {
        if (n == 1) return 1;
        return n + sum(n - 1);
    }

    public static void divide(int num1, int num2) {
        if (num2 != 0)
            System.out.println("两个数字相处的结果是" + (num1 / num2));
        else System.out.println("除数不能为0");

    }
}

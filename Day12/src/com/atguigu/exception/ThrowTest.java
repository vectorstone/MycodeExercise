package com.atguigu.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
什么情况下要抛出异常: 当定义方法时，方法体里的代码有可能出现异常，但是定义这个方法的类不知道该怎么解决这个问题，可以将异常抛出
Scanner.java --> nextInt()

自定义异常不要继承自 Throwable,因为Throwable有两个子类 Error和Exception
自定义异常通常继承 Exception 或者 RuntimeException


e.printStackTrace() 做的工作:
    先打印异常的类型: Throwable类里的detailMessage
    打印方法的调用栈
*/
public class ThrowTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名:");
        String username = scanner.next();
        scanner.close();

        try {
            checkUsername(username);
        } catch (UsernameInvalidException e) {
            e.printStackTrace();
            System.out.println("用户名不合法");
            username = "jack";
        }

        System.out.println("将" + username + "写入到数据库");
    }

    // 用来检测用户名是否合法，要求用户名长度是[4,14]位
    public static void checkUsername(String x) throws UsernameInvalidException {
        if (x.length() >= 4 && x.length() <= 14) {
            System.out.println("合法");
        } else {
            // throw new RuntimeException();
            throw new UsernameInvalidException("用户名的长度必须在[4,14]位");
        }
    }
}

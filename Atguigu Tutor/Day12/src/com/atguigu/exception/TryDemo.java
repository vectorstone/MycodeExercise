package com.atguigu.exception;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
try {
    // 可能出现异常的代码
}catch(异常类型1 变量名) {
    // 1. 记录异常信息
    // 2. 给用户一个友好的提示
}catch(异常类型2 变量名) {
}... ...
如果多个catch之间有继承关系，父类的catch必须要写在子类的后面
如果多个catch之间处理异常的语句一样，可以将多个catch合并成为一个catch,catch里多个异常之间使用 | 连接。
多个catch合并成为一个catch时，要求异常类型不能再有继承关系

如果try里的代码没有出现异常，会将try代码块里的内容执行完;
如果try里的代码出现异常，会立刻跳转到catch语句里处理异常!

记录异常的信息: e.printStackTrace();
 */
public class TryDemo {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        int[] nums = {8, 5, 7, 3, 2, 9};

        int x;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入一个数字:");
            int i = scanner.nextInt();
            scanner.close();

            x = nums[i];
            System.out.println("第" + i + "个数字是" + x);

            System.out.println(1 / i);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | InputMismatchException e) {
            e.printStackTrace();
            System.out.println("出错了");
        }
        /*catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("输入的下标不合法");
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("除数不能为0");
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("输入的不是数字");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("出现异常了");
        }*/


        Thread.sleep(100);
        System.out.println("hello");
        System.out.println("good");

    }
}

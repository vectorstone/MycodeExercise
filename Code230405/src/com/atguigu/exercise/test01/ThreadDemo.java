package com.atguigu.exercise.test01;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/5/2023 7:58 PM
 * 多线程方法练习
 */
public class ThreadDemo {
    public static void main(String[] args) {
        // 声明一个匿名内部类继承Thread类,重写run方法,实现打印[1,100]之间的偶数,要求每个1秒打印1个偶数
        Thread s1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i += 2) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("偶数------>" + i);
                }
            }
        };
        s1.start();


        // 声明一个匿名内部类继承Thread类,重写ruan方法,实现答应[1,100]之间的奇数
        Thread s2 = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i < 100; i += 2) {
                    if (i == 5) {
                        // Thread.yield();
                        try {
                            s1.join(10000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println("奇数--->" + i);
                }
            }
        };
        s2.start();
        Thread sss= new Thread("我是线程");

    }
}

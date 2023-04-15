package com.atguigu.exercse.test;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/12/2023 10:35 PM
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyThread m = new MyThread();
        Thread t = new Thread(m);
        t.start();

        // t.join();

        int j = m.i;
        System.out.println(j);
    }
}

package com.atguigu.exercise;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/5/2023 8:46 PM
 */
public class TestThread {
    public static void main(String[] args) {
        MyDaemon m = new MyDaemon();
        m.setDaemon(true);
        m.start();

        for (int i = 1; i <= 100; i++) {
            System.out.println("main:" + i);
        }
    }
}

class MyDaemon extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("我一直守护者你...");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
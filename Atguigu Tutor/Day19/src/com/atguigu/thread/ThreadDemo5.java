package com.atguigu.thread;

public class ThreadDemo5 {
    public static void main(String[] args) {
        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i += 2) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("偶数线程---->" + i);
                }
            }
        };
        t2.start();

        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i < 100; i += 2) {
                    if (i == 5) {
                        // Thread.yield();
                        try {
                            t2.join(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("奇数线程->" + i);
                }
            }
        };
        t1.start();


    }
}

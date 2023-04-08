package com.atguigu.sync;

/*
死锁: 线程锁也被称为同步锁，排他锁
*/
public class DeadLock {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (sb1) {
                    sb1.append("a");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (sb2) {
                        sb2.append("1");
                    }
                }
            }
        },"t1").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (sb2) {
                    sb2.append("2");
                    synchronized (sb1) {
                        sb1.append("b");
                    }
                }
            }
        },"t2").start();


        System.out.println("sb1 = " + sb1 + ",sb2 = " + sb2);
    }
}

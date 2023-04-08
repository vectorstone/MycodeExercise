package com.atguigu.thread;

/*
多线程:  使用Thread类表示一个线程，所谓的多线程就是创建并启动一个 Thread对象

构造方法:
    Thread(): 创建一个线程，不指定行为
    Thread(String name): 创建一个线程，并指定线程的名字，不指定行为
    Thread(Runnable target): 创建一个线程，并指定线程的行为
    Thread(Runnable target,String name): 创建一个线程，并指定线程的行为和线程的名字

常见方法:
    start(): 启动一个线程
*/
public class ThreadDemo1 {
    public static void main(String[] args) throws InterruptedException {

        DanceTarget x = new DanceTarget();
        Thread t1 = new Thread(x);
        t1.start();


        class RapTarget implements Runnable {

            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("RAP");
                }
            }
        }

        Thread t2 = new Thread(new RapTarget());  // 命名类型 + 匿名对象
        t2.start();


        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("篮球");
                }
            }
        });
        t3.start();
    }
}

class DanceTarget implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("唱跳");
        }
    }
}

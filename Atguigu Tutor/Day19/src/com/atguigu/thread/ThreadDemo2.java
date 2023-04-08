package com.atguigu.thread;

/*
Thread() / Thread(String name)

Thread implements Runnable Thread类实现了Runnable接口，并重写了run()方法

调用 Thread的start()方法，最终会执行 Thread对象里的run()方法
Thread里的run()方法会判断target是否是null,如果target!=null,会调用 target.run()
*/
public class ThreadDemo2 {
    public static void main(String[] args) {
        /*MyThread mt = new MyThread();
        mt.start();*/


        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("good");
                }
            }
        };
        t1.start();

        Thread t2 = new Thread("线程2") {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("yes");
                }
            }
        };
        System.out.println(t2.getClass());
        t2.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);
                System.out.println("hello");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

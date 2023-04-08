package com.atguigu.thread;

public class ThreadDemo4 {
    public static void main(String[] args) {
        System.out.println("开始");
        Thread t1 = new Thread("线程1") {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(getName() + " 打印good");
                }
            }
        };

        Thread t2 = new Thread("线程2") {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(getName() + " 打印yes");
                }
            }
        };

        Thread t3 = new Thread() {
            @Override
            public void run() {
                for (int i = 1; ; i++) {
                    try {
                        Thread.sleep(50);
                        System.out.println("第" + i + "次执行代码");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        System.out.println(Thread.currentThread().getPriority());
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setDaemon(true);  // 设置守护线程

        t1.start();
        t2.start();
        t3.start();

        System.out.println("结束");
    }
}

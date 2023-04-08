package com.atguigu.sync;

/*
StringBuilder/StringBuffer   ArrayList/Vector   HashMap/HashTable

线程的安全问题:  多个线程操作同一个数据，可能会导致线程的安全问题。

线程安全问题可以通过加锁(synchronized代码块或者synchronized方法)的方式来解决

synchronized代码块可以用来对代码添加线程锁

synchronized(锁对象) {
    需要加锁的代码
}
锁对象可以使用this; 也可以使用 类名.class; 还可以使用其他对象
*/
public class SyncDemo {
    public static void main(String[] args) {
        /*new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 100; i >= 1; i--) {
                    System.out.println(Thread.currentThread().getName() + "卖出了第" + i);
                }
            }
        }, "窗口1").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 100; i >= 1; i--) {
                    System.out.println(Thread.currentThread().getName() + "卖出了第" + i);
                }
            }
        }, "窗口2").start();*/

        TicketTarget target = new TicketTarget();

        Thread t1 = new Thread(target, "窗口1");
        Thread t2 = new Thread(target, "窗口2");
        Thread t3 = new Thread(target,"窗口3");

        // t1.start()方法最终会调用到 t1.run()方法,t1的run方法又调用到了 target的run方法
        t1.start();
        t2.start();
        t3.start();
    }
}

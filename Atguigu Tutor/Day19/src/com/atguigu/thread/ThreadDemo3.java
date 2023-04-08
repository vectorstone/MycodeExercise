package com.atguigu.thread;

/*
Thread里的常见方法:
    start(): 用来启动一个线程，最终会调用到 Thread里的run()方法
    run(): 不要手动调用!!! 通过调用start()方法，来执行run()方法
    getName(): 获取线程的名字
    setPriority(): 设置线程的优先级
    getPriority(): 获取线程的优先级
    setDaemon(boolean b): 设置为守护线程
    join(): 如果在t1线程里调用了 t2.join()  t1线程会挂起，等到t2执行完成以后才会继续执行
    join(long time):

静态方法:
    Thread.currentThread(): 获取到当前线程
    Thread.sleep(long time): 让线程至少等待指定的时间，单位是毫秒
    Thread.yield(): 线程交出CPU的使用权，让CPU重新调度
*/
public class ThreadDemo3 {
    public static void main(String[] args) {
        Thread t1 = new Thread("线程1") {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println(this.getName() + "在打印 good");
                }
            }
        };
        t1.start();


        Runnable x = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + "yes");
                }
            }
        };
        Thread t2 = new Thread(x, "线程2");
        t2.start();
    }
}

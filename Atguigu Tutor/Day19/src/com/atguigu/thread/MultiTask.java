package com.atguigu.thread;

/*
多个任务同时执行代码的实现方式:
    多进程+多线程  / 单进程+多线程
*/
public class MultiTask {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("唱跳");
        }

        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("RAP");
        }

        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("篮球");
        }
    }
}

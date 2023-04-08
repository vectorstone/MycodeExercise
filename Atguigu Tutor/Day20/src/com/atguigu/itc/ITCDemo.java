package com.atguigu.itc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
线程间通信InterThreadCommunication
线程间通信也叫线程的等待唤醒机制，依赖于线程的状态切换
典型的案例: 生产消费者模式
*/
public class ITCDemo {
    public static void main(String[] args) {
        // LinkedList<String> queue = new LinkedList<>();
        List<String> queue = new ArrayList<>();

        ProduceThread p1 = new ProduceThread("producer1", queue);
        ProduceThread p2 = new ProduceThread("producer2", queue);
        p1.start();
        p2.start();

        ConsumeThread c1 = new ConsumeThread("consumer1", queue);
        ConsumeThread c2 = new ConsumeThread("consumer2", queue);
        ConsumeThread c3 = new ConsumeThread("consumer3", queue);
        c1.start();
        c2.start();
        c3.start();
    }
}

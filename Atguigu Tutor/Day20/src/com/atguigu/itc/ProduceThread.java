package com.atguigu.itc;

import java.util.LinkedList;
import java.util.List;

public class ProduceThread extends Thread {
    List<String> queue;

    public ProduceThread(String name, List<String> queue) {
        super(name);
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (queue) {
                String product = getName() + " " + i;
                System.out.println("生产了 -> " + product);
                queue.add(product);
                queue.notify();
            }
        }
    }
}

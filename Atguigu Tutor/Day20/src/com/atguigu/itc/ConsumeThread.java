package com.atguigu.itc;

import java.util.LinkedList;
import java.util.List;

public class ConsumeThread extends Thread {
    private List<String> queue;

    public ConsumeThread(String name, List<String> queue) {
        super(name);
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (queue) {
                if (queue.isEmpty()) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    String x = queue.remove(0);
                    System.out.println(getName() + "买到了" + x);
                }
            }
        }
    }
}

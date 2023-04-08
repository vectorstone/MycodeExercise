package com.atguigu.sync;

public class TicketTarget implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        while (ticket >= 1) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (this) {
                if (ticket >= 1) {
                    System.out.println(Thread.currentThread().getName() + "卖出了第 " + ticket + " 张票");
                    ticket--;
                }
            }
        }

    }
}

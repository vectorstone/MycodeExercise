package com.atguigu.thread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThreadClose {
    private static FileInputStream fis = null;

    public static void main(String[] args) throws InterruptedException {
        new Thread() {
            @Override
            public void run() {
                try {
                    fis = new FileInputStream("1.txt");
                    System.out.println(1 / 0);
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } finally {
                    if (fis != null) {
                        try {
                            System.out.println("关闭流");
                            fis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }.start();

        while (true) {
            Thread.sleep(100);
            System.out.println("hello");
        }
    }
}

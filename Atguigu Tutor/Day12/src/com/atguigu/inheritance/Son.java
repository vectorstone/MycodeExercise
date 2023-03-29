package com.atguigu.inheritance;

import java.io.IOException;

public class Son extends Father implements Comparable{
    @Override
    public void test1() throws RuntimeException {

    }

    @Override
    public void test2() throws IOException {
        // 假如子类的代码调用了一个方法，这个方法抛出了 InterruptedException
        // 子类只能try...catch解决 InterruptedException 不能再抛出了

        // Thread.sleep(1000);

    }

    @Override
    public void test3() {

    }

    @Override
    public void test4() {
    }

    @Override
    public int compareTo(Object o) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }
}

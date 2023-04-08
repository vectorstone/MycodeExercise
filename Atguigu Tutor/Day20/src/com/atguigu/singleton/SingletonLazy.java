package com.atguigu.singleton;

public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() {
    }

    /*public static SingletonLazy getInstance() {
        synchronized (SingletonLazy.class) {
            if (instance == null) {
                try {
                    int x = (int) (Math.random() * 100) + 100;
                    Thread.sleep(x);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                instance = new SingletonLazy();
            }
            return instance;
        }
    }*/

    /*public synchronized static SingletonLazy getInstance() {
        // 如果一个方法里所有的方法体都被synchronized代码块包裹，可以将这个方法定义为 synchronized 同步方法
        if (instance == null) {
            try {
                int x = (int) (Math.random() * 100) + 100;
                Thread.sleep(x);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            instance = new SingletonLazy();
        }
        return instance;
    }*/

   /* private static final class InstanceHolder {
        private static final SingletonLazy instance = new SingletonLazy();
    }
    public static SingletonLazy getInstance() {
        return InstanceHolder.instance;
    }*/

    public static SingletonLazy getInstance() {
        if (instance == null) {
            synchronized (SingletonLazy.class) {
                if (instance == null)
                    instance = new SingletonLazy();
            }
        }
        return instance;
    }

}

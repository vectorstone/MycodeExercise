package com.atguigu.singleton;

/*
单例设计模式: 如果一个类只能创建一个实例对象，可以将这个类设计为单例。

Runtime 就是一个典型的单例设计模式，程序在执行时，只有一个Runtime对象

饿汉式单例设计模式的步骤:
    1. 构造方法私有化，禁止外部创建实例对象
    2. 在类的内部创建一个被static final 修饰的实例对象，再通过静态方法返回这个实例对象
    饿汉式单例设计模式不会有线程的安全问题

懒汉式单例设计模式的步骤:
    1. 构造方法私有化，禁止外部创建实例对象
    2. 在类的内部定义一个static的成员变量，没有赋值
    3. 在类的内部定义一个 public static 方法返回这个实例对象
        在返回之前判断对象是否为null,如果为null就创建对象

    懒汉式有线程安全的风险,懒汉式单例设计模式 DCL 双层校验
*/
public class SingletonDemo {
    public static void main(String[] args) {
        /*Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime);*/

        // SingletonLazy s1 = new SingletonLazy();
        SingletonHungry s1 = SingletonHungry.getInstance();
        SingletonHungry s2 = SingletonHungry.getInstance();
        System.out.println(s1 == s2);



        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "里 = " + SingletonLazy.getInstance());
            }
        }, "t1").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "里 = " + SingletonLazy.getInstance());
            }
        }, "t2").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "里 = " + SingletonLazy.getInstance());
            }
        }, "t3").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "里 = " + SingletonLazy.getInstance());
            }
        }, "t4").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "里 = " + SingletonLazy.getInstance());
            }
        }, "t5").start();
    }
}

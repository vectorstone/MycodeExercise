package com.atguigu.inheritance.test;

/**
 * @Description: son
 * @Author: Gavin
 * @Date: 3/20/2023 7:17 PM
 */
public class father {
    private int a;
    private int b;
    public father(){

    }

    public father(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("我是父类构造器");
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}

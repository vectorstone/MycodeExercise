package com.atguigu.interfaceexercise.homework1;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/22/2023 6:33 PM
 */
public abstract class A {
    private int numa = 10;

    public A(){}
    public A(int numa) {
        this.numa = numa;
    }

    public int getNuma() {
        return numa;
    }

    public void setNuma(int numa) {
        this.numa = numa;
    }

    public abstract void showA();
}

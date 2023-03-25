package com.atguigu.interfaceexercise.homework1;

/**
 * @Description: B
 * @Author: Gavin
 * @Date: 3/22/2023 6:37 PM
 */
public abstract class B extends A {
    private int numb = 20;

    public B(){}
    public B(int numa, int numb) {
        super(numa);
        this.numb = numb;
    }

    public int getNumb() {
        return numb;
    }

    public void setNumb(int numb) {
        this.numb = numb;
    }

    public abstract void showB();
}

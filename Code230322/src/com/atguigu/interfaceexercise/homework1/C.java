package com.atguigu.interfaceexercise.homework1;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/22/2023 6:38 PM
 */
public class C extends B{
    private int numc = 30;
    public C(){}

    public C(int numa, int numb, int numc) {
        super(numa, numb);
        this.numc = numc;
    }

    public int getNumc() {
        return numc;
    }

    public void setNumc(int numc) {
        this.numc = numc;
    }

    @Override
    public void showA() {
        System.out.println("numa = " + getNuma());
    }

    @Override
    public void showB() {
        System.out.println("numb = " + getNumb());
    }
    public void showC(){
        System.out.println("numc = " + numc);
    }
}

package com.atguigu.inheritance.homework3;

/**
 * @Description: Rectangle
 * @Author: Gavin
 * @Date: 3/20/2023 8:29 PM
 */
public class Rectangle extends Graphic{
    private double l;
    private double w;
    public Rectangle(){
        super();
    }
    public Rectangle(double l,double w){
        this.l = l;
        this.w = w;
    }
    public void setL(double l){
        this.l = l;
    }
    public double getL(){
        return l;
    }
    public void setW(double w){
        this.w = w;
    }
    public double getW(){
        return w;
    }

    @Override
    public double getArea() {
        return l * w;
    }

    @Override
    public double getPermeter() {
        return (l + w) * 2;
    }
}

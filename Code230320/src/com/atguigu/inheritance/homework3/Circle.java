package com.atguigu.inheritance.homework3;

/**
 * @Description: Circle
 * @Author: Gavin
 * @Date: 3/20/2023 8:26 PM
 */
public class Circle extends Graphic{
    private double r;
    public Circle(){
        super();
    }
    public Circle(double r){
        this.r = r;
    }
    public void setR(double r){
        this.r = r;
    }
    public double getR(){
        return r;
    }

    @Override
    public double getArea() {
        return 3.14 * r * r;
    }

    @Override
    public double getPermeter() {
        return 2 * 3.14 * r;
    }
}

package com.atguigu.inheritance.homework3;

/**
 * @Description: Triangle
 * @Author: Gavin
 * @Date: 3/20/2023 8:32 PM
 */
public class Triangle extends Graphic{
    private int a;
    private int b;
    private int c;
    public Triangle(){}
    public Triangle(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void setA(int a){
        this.a = a;
    }
    public int getA(){
        return a;
    }
    public void setB(int b){
        this.b = b;
    }
    public int getB(){
        return b;
    }
    public void setC(int c){
        this.c = c;
    }
    public int getC(){
        return c;
    }
    @Override
    public double getArea() {
        if ( a + b > c && a + c > b && b + c > a){
            double p =(double)(( a + b + c) / 2);
            return Math.sqrt(p *( p - a) * (p - b)* (p - c));
        }
        return 0;
    }
    @Override
    public double getPermeter() {
        if ( a + b > c && a + c > b && b + c > a){
            return a + b + c;
        }
        return 0;
    }
}

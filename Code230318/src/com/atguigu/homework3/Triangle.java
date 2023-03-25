package com.atguigu.homework3;

/**
 * @Description: 三角形
 * @Author: Gavin
 * @Date: 3/18/2023 8:14 PM
 * （1）声明一个三角形类Triangle，包含属性：a,b,c，都是double类型，表示三条边，包含几个方法：
 * - boolean isTriangle()：判断是否是一个三角形
 * - boolean isRightTriangle()：判断是否是一个直角三角形
 * - boolean isIsoscelesTriangle()：判断是否是一个等腰三角形
 * - boolean isEquilateralTriangle()：判断是否是一个等边三角形
 * - double area()：根据三条边，用海伦公式求面积
 * - double perimeter()：求周长
 */
public class Triangle {
    private double a;
    private double b;
    private double c;
    public Triangle (){}
    public Triangle(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void setA(double a){
        this.a = a;
    }
    public double getA(){
        return a;
    }
    public void setB(double b){
        this.b = b;
    }
    public double getB(){
        return b;
    }
    public void setC(double c){
        this.c = c;
    }
    public double getC(){
        return c;
    }

    //boolean isTriangle()：判断是否是一个三角形
    public boolean isTriangle(){
        return a + b > c && a + c > b && b + c > a;
    }
    //boolean isRightTriangle()：判断是否是一个直角三角形
    public boolean isRightTriangle(){
        return (a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a);
    }


    //boolean isIsoscelesTriangle()：判断是否是一个等腰三角形
    public boolean isIsoscelesTriangle(){
        if(isTriangle()) return a == b || a == c || b == c;
        return false;
    }
    //boolean isEquilateralTriangle()：判断是否是一个等边三角形
    public boolean isEquilateralTriangle(){
        if(isTriangle()) return a == b && a == c && b == c;
        return false;
    }


    //double area()：根据三条边，用海伦公式求面积
    public double area(){
        double p = (a + b + c) / 2 ;
        if(isTriangle()) return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return 0.0;
    }
    //double perimeter()：求周长
    /*public double perimeter(double a,double b,double c){
        return a + b + c;
    }*/
    public double perimeter(){
        if(isTriangle()) return a + b + c;
        return 0.0;
    }
}

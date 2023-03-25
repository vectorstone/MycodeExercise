package com.atguigu.homework3;

/**
 * @Description: 求三角形面积和周长
 * @Author: Gavin
 * @Date: 3/18/2023 8:34 PM
 * 在测试类的main方法中创建三角形对象，将三角形的三条边设置为3,4,5，调用方法测试。
 */
public class HomeWork3 {
    public static void main(String[] args) {
        //创建三角形对象(创建时直接赋值,或者可以通过set方法来进行赋值)
        Triangle tri = new Triangle(3,4,5);
        //判断是否是三角形
        System.out.println("三条边分别为:"+tri.getA()+","+tri.getB()+","+tri.getC()+",是否可以构成三角形:"+tri.isTriangle());

        System.out.println("三条边分别为:"+tri.getA()+","+tri.getB()+","+tri.getC()+",是否可以构成直角三角形:"+tri.isRightTriangle());

        System.out.println("三条边分别为:"+tri.getA()+","+tri.getB()+","+tri.getC()+",是否是一个等腰三角形:"+tri.isIsoscelesTriangle());

        System.out.println("三条边分别为:"+tri.getA()+","+tri.getB()+","+tri.getC()+",是否是等边三角形:"+tri.isEquilateralTriangle());

        System.out.println("三条边分别为:"+tri.getA()+","+tri.getB()+","+tri.getC()+",组成三角形的面积是:"+tri.area());

        System.out.println("三条边分别为:"+tri.getA()+","+tri.getB()+","+tri.getC()+",组成三角形的周长是:"+tri.perimeter());
    }
}

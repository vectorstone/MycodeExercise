package com.atguigu.inheritance.homework3;

/**
 * @Description: Graphic
 * @Author: Gavin
 * @Date: 3/20/2023 8:44 PM
 */
public class GraphicTest {
    public static void main(String[] args) {
        //创建圆对象
        Circle c1 = new Circle(3);
        System.out.println("圆的面积是:"+c1.getArea());
        System.out.println("圆的周长是:"+c1.getPermeter());
        System.out.println("圆的信息是:"+c1.getInfo());
        //创建矩形对象
        Rectangle r1 = new Rectangle(4,3);
        System.out.println("长方形的面积是:"+r1.getArea());
        System.out.println("长方形的周长是:"+r1.getPermeter());
        System.out.println("长方形的信息是:"+r1.getInfo());
        //创建三角形对象
        Triangle t1 = new Triangle(3,4,5);
        System.out.println("三角形的面积是:"+t1.getArea());
        System.out.println("三角形的周长是:"+t1.getPermeter());
        System.out.println("三角形的信息是:"+r1.getInfo());

        //测试方法1和2
        System.out.println("圆和长方形的面积相等吗?" + AreaEqual(c1.getArea(),r1.getArea()));
        System.out.println("圆形和长方形中面积最大的面积是多少:" + AreaMax(c1.getArea(),r1.getArea()));
    }
    public static boolean AreaEqual(double a,double b){
        return a == b;
    }
    public static double AreaMax(double a,double b){
        return (a > b) ? a : b ;
    }
}

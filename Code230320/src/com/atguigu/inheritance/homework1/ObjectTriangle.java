package com.atguigu.inheritance.homework1;

/**
 * @Description: 继承相关, object类的方法
 * @Author: Gavin
 * @Date: 3/20/2023 6:06 PM
 * 知识点：Object类的方法
 */
public class ObjectTriangle {
    //声明三角形类，包含a,b,c三边
    private int a;
    private int b;
    private int c;
    public ObjectTriangle(){}
    public ObjectTriangle(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //属性私有化，提供无参，有参构造，提供get/set
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
    //重写：toString()

    @Override
    public String toString() {
        return "a = "+a+", b = "+b+", c = "+c;
    }
    //（3）重写：hashCode和equals方法

    @Override
    public int hashCode() {
        return 31 * a + 31 * b + c;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if ((obj == null) || obj.getClass() != ObjectTriangle.class) return false;
        ObjectTriangle s = (ObjectTriangle) obj;//先强转对象
        return this.a == s.a && this.b == s.b && this.c == s.c;

    }
    //（4）编写  public double getArea()：求面积方法
    public double getArea(){
        if ( a + b > c && a + c > b && b + c > a){
            double p =(double)(( a + b + c) / 2);
            return Math.sqrt(p *( p - a) * (p - b)* (p - c));
        }
        return 0;
    }

    //(5)编写 public double getPiremeter()：求周长方法
    public double getPremeter(){
        if ( a + b > c && a + c > b && b + c > a){
            return a + b + c;
        }
        return 0;
    }
}

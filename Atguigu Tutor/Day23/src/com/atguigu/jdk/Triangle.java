package com.atguigu.jdk;

/*
record 本质是一个被final修饰的类,声明这个record的时候，就要在 () 里列出它的所有属性
 */
public record Triangle(double a, double b, double c) {

    public Triangle(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("不能组成三角形");
            throw new RuntimeException("三条边不能组成三角形");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getLength() {
        return a + b + c;
    }
}

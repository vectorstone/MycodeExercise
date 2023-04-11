package com.atguigu.jdk;

import org.junit.Test;

public class TestRecord {
    @Test
    public void test1() {
        // 可以自定义构造方法，在这个构造方法里，一定要给属性赋值
        Triangle t = new Triangle(5, 5, 7);
        System.out.println(t.a());

        System.out.println(t.getLength());

        System.out.println(t);  // 重写了toString()方法

        Triangle t1 = new Triangle(5, 5, 7);
        System.out.println(t.equals(t1));  // 重写了equals方法
        System.out.println(t.hashCode() == t1.hashCode()); // 重写了hashCode()方法
    }
}

/*
public final class Triangle {
    private final double a;
    private final double b;
    private final double c;
    public Triangle(double a,double b,double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double a() {
        return a;
    }
    public double b() {
        return b;
    }
    public double c() {
        return c;
    }
}
*/

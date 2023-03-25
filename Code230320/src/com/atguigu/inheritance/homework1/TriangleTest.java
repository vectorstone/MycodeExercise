package com.atguigu.inheritance.homework1;

/**
 * @Description: test
 * @Author: Gavin
 * @Date: 3/20/2023 6:29 PM
 */
public class TriangleTest {
    public static void main(String[] args) {
        ObjectTriangle triangle1 = new ObjectTriangle(3,4,5);
        ObjectTriangle triangle2 = new ObjectTriangle(4,5,6);

        System.out.println(triangle1.toString());
        System.out.println(triangle2.toString());

        System.out.println("三角形1的hashcode值是:"+triangle1.hashCode());
        System.out.println("三角形2的hashcode值是:"+triangle2.hashCode());

        System.out.println("两个三角形相等吗?"+triangle1.equals(triangle2));

        System.out.println("三角形1的面积是:"+triangle1.getArea());
        System.out.println("三角形2的面积是:"+triangle2.getArea());

        System.out.println("三角形1的周长是:"+triangle1.getPremeter());
        System.out.println("三角形2的周长是:"+triangle2.getPremeter());

    }
}

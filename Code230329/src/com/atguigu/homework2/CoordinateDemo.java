package com.atguigu.homework2;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/29/2023 9:03 PM
 */
public class CoordinateDemo {
    public static void main(String[] args) {
        Coordinate<String> c1 = new Coordinate<>("10°","2°");
        //x和y需要的是引用数据类型,所以赋值的时候进行了自动装箱
        Coordinate<Double> c2 = new Coordinate<>(10.0,2.0);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}

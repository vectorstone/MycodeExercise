package com.atguigu.inheritance.homework3;

/**
 * @Description: test1
 * @Author: Gavin
 * @Date: 3/20/2023 8:56 PM
 */
public class GraphicTest1 {
    public static void main(String[] args) {
    //在主方法中，创建1个圆、1个矩形、1个三角形对象，放到数组中，遍历显示，然后排序后再遍历显示
        Graphic[] arr = new Graphic[3];
        arr[0] = new Circle(3);
        arr[1] = new Rectangle(4,3);
        arr[2] = new Triangle(3,4,5);
        System.out.println(ergodic(arr));
        sort(arr);
        System.out.println(ergodic(arr));

    }
    //设计一个方法,用来遍历一个图形数组
    public static String ergodic(Graphic[] all){
        String s = "";
        for (int i = 0; i < all.length; i++) {
            s += all[i].getInfo() + "\n";
        }
        return s;
    }
    //设计一个方法,用于给一个图形数组按照面积从小到大排序
    public static void sort(Graphic[] arr){
        boolean status = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j].getArea() > arr[j+1].getArea()){
                    Graphic temp = new Graphic();
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

package com.atguigu.homework3;

import java.util.Arrays;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/29/2023 9:07 PM
 */
public class HomeWork3 {
    public static void main(String[] args) {
        // 泛型里面好像不能使用基本数据类型,要使用包装类
        Integer[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        try {
            method(arr, 3, 6);
            //[0, 1, 2, 6, 4, 5, 3, 7, 8, 9]
            System.out.println(Arrays.toString(arr));
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("给定的数据有误");
        }

        String[] ss = {"张三", "李四", "王五", "龙六", "没名"};
        try {

            method(ss, 2, 8);
            System.out.println(Arrays.toString(ss));
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("给定的数据有误");
        }


    }

    public static <T> void method(T[] arr, int a, int b) {
        /*boolean a1 = (a < 0 || a >= arr.length);
        boolean b1 = (b < 0 || b >= arr.length);
        if (a1 || b1) {
            System.out.println("给定的" + a + ",和" + b + "有误");
        } else {

        }*/
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

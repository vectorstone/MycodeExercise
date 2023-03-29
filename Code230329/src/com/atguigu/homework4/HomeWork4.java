package com.atguigu.homework4;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/29/2023 9:23 PM
 */


import java.util.Arrays;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/29/2023 9:07 PM
 */
public class HomeWork4 {
    public static void main(String[] args) {
        // 泛型里面好像不能使用基本数据类型,要使用包装类
        Integer[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("反转前:");
        System.out.println(Arrays.toString(arr));
        reverse(arr);

        System.out.println("反转后:");
        //[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]
        System.out.println(Arrays.toString(arr));

        System.out.println("-------------------------");


        String[] ss = {"张三", "李四", "王五", "龙六", "没名"};

        System.out.println("反转前:");
        System.out.println(Arrays.toString(ss));
        reverse(ss);
        System.out.println("反转后:");
        //[没名, 龙六, 王五, 李四, 张三]
        System.out.println(Arrays.toString(ss));


    }

    public static <T> void reverse(T[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            T temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}

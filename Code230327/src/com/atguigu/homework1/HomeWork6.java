package com.atguigu.homework1;

import java.util.Arrays;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/27/2023 8:15 PM
 * * 定义数组，存入多个字符串。
 * * 删除长度大于5的字符串，打印删除后的数组。
 */
public class HomeWork6 {
    public static void main(String[] args) {
        String[] arr = {"sdf","今天天气好","sdfd","sef","w342sf xcvxv"};
        System.out.println("删除前的数组为:"+Arrays.toString(arr));

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length() > 5){
                count++;
            }
        }
        String[] arr1 = new String[arr.length - count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length() <= 5){
                arr1[index] = arr[i];
                index++;
            }
        }
        System.out.println("删除后的数组为:"+Arrays.toString(arr1));
    }
}

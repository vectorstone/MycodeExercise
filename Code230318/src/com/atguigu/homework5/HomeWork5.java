package com.atguigu.homework5;

/**
 * @Description: 测试数组工具类
 * @Author: Gavin
 * @Date: 3/18/2023 10:05 PM
 * （2）在测试类的main方法中，调用方法测试，例如：
 */
public class HomeWork5 {
    public static void main(String[] args) {
        int[] arr = {1,2,10,4,5,10,7,8,9,10};
        ArrayTools tool = new ArrayTools();
        //int sum(int[] arr)：求所有元素总和
        System.out.println("所有元素总和为:"+tool.sum(arr));
        //int max(int[] arr)：求所有元素的最大值
        System.out.println("所有元素中的最大值为:"+tool.max(arr));
        //int indexOf(int[] arr, int value)：查找value在arr数组中第一次出现的下标，如果不存在返回-1
        System.out.println(10+"在arr数组中第一次出现的下标为:"+tool.indexOf(arr,10));
        System.out.println(3+"在arr数组中第一次出现的下标为:"+tool.indexOf(arr,3));
        //int lastIndexOf(int[] arr, int value)：查找value在arr数组中最后一次出现的下标，如果不存在返回-1
        System.out.println(10+"在arr数组中最后一次出现的下标为:"+tool.lastIndexOf(arr,10));
        System.out.println(3+"在arr数组中最后一次出现的下标为:"+tool.lastIndexOf(arr,3));
    }
}

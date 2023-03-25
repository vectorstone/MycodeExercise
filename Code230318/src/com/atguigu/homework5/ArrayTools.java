package com.atguigu.homework5;

/**
 * @Description: 数组类工具
 * @Author: Gavin
 * @Date: 3/18/2023 9:52 PM
 * （1）声明一个数组工具类ArrayTools，包含如下方法：
 */
public class ArrayTools {
    //定义属性(其实系统默认有一个无参构造方法,不创建带参构造方法的话不需要手动创建无参构造方法)先手动创建一个
    private int arr[];
    //创建无参构造方法
    public ArrayTools(){}
    //创建带参构造方法(好像数组不能创建带参构造方法)
    /*public ArrayTools(int arr[]){
        this.arr[] = arr[];
    }*/

    //int sum(int[] arr)：求所有元素总和
    public int sum(int[] arr){
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }
    //int max(int[] arr)：求所有元素的最大值
    public int max(int[] arr){
        int Max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(Max < arr[i]) Max = arr[i];
        }
        return Max;
    }
    //int indexOf(int[] arr, int value)：查找value在arr数组中第一次出现的下标，如果不存在返回-1
    public int indexOf(int[] arr,int value){
        for (int i = 0; i < arr.length; i++) {
            if(value == arr[i]) return i;
        }
        return -1;
    }

    //int lastIndexOf(int[] arr, int value)：查找value在arr数组中最后一次出现的下标，如果不存在返回-1
    public int lastIndexOf(int[] arr,int value){
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) index = i;
        }
        return index;
    }
}

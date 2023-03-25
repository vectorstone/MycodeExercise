package com.atguigu.homework7;

/**
 * @Description: 数组工具类
 * @Author: Gavin
 * @Date: 2023/3/19 11:44
 * （1）声明一个数组工具类ArrayTools，包含如下方法：
 *
 */
public class ArrayTools {


    //int max(int[] arr)：求所有元素的最大值
    public int max(int[] arr){
        int Max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (Max < arr[i]) Max = arr[i];
        }
        return Max;
    }

    //int valueCount(int[] arr, int value)：查找value在arr数组中出现的次数，如果不存在返回0
    public int valueCount(int[] arr,int value){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(value == arr[i]) count++;
        }
        return count;
    }

    //int[] maxIndex(int[] arr)：找出所有最大值
    /*
    1.首先要知道最大值是多少
    2.然后记录最大值有几个
    3.将所有最大值的下标放到一个新的数组中
     */
    public int[] maxIndex(int[] arr){
        int Max = max(arr);//找出最大值
        int num = valueCount(arr,Max);//判断最大值的个数
        int[] arr1 = new int[num];//创建新的数组
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(Max == arr[i]){
                arr1[j] = i;
                j++;
            }
        }
        return arr1;
    }
    //void sort(int[] arr)：实现元素从小到大排序
    public void sort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            boolean status = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
            if (arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
            }
            if(!status) return ;
        }
    }

    //void reverse(int[] arr, int start, int end)：反转[start,end]范围内的元素
    public void reverse(int[] arr,int start,int end){
        for (int i = 0; i < (end - start) / 2; i++) {
            int temp = arr[start + i];
            arr[start + i] = arr[end - i];
            arr[end - i] = temp;
        }
    }

    /*int[] copyOf(int[] arr, int newLength)：复制arr数组，新数组的长度newLength。
    如果newLength<=arr.length，则复制arr数组的[0, newLength-1]范围的元素，
    如果newLength>arr.length，则复制arr数组的所有元素到新数组，剩下的元素则默认就可以。*/
    public int[] copyOf(int[] arr,int newLength){
        int[] arr2 = new int[newLength];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }

    /*
    boolean equals(int[] arr1, int[] arr2)：
    判断两个数组的长度和元素是否都相等，如果两个数组以相同顺序包含相同的元素，则两个数组是相等的。
     */
    public boolean equals(int[] arr1,int[] arr2){
        if(arr1.length == arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                if(arr1[i] != arr2[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    //void fill(int[] arr, int start, int end,  int value) ：将arr数组[start,end]范围的元素赋值为value。
    public void fill(int[] arr,int start,int end,int value){
        for (int i = start; i <= end ; i++) {
            arr[i] = value;
        }
    }

    //String toString(int[] arr)：将元素拼接为"{元素1，元素2，......}"的字符串返回。
    public String toString(int[] arr){
        String x = "{";
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length -1) x += arr[i];
            else x += arr[i] + ", ";
        }
        return x + "}";
    }
}

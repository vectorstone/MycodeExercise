package com.atguigu.homework7;

/**
 * @Description: 测试类
 * @Author: Gavin
 * @Date: 2023/3/19 11:46
 */
public class ArrayToolsDemo {
    public static void main(String[] args) {
        //创建tool对象
        ArrayTools tool = new ArrayTools();
        //创建数组
        int[] arr = {1,2,10,4,5,10,7,8,9,10};
        //int max(int[] arr)：求所有元素的最大值
        System.out.println("所有元素的最大值是:"+tool.max(arr));

        //int valueCount(int[] arr, int value)：查找value在arr数组中出现的次数，如果不存在返回0
        System.out.println(10+"在arr数组中出现的次数:"+tool.valueCount(arr,10));
        System.out.println(3+"在arr数组中出现的次数:"+tool.valueCount(arr,3));

        //int[] maxIndex(int[] arr)：找出所有最大值
        int[] max = tool.maxIndex(arr);
        System.out.println("最大值下标为:"+tool.toString(max));

        //void sort(int[] arr)：实现元素从小到大排序
        tool.sort(arr);
        //查看下是否按照要求排序了
        System.out.println(tool.toString(arr));

        //void reverse(int[] arr, int start, int end)：反转[start,end]范围内的元素
        tool.reverse(arr,2,8);
        System.out.println(tool.toString(arr));

    /*int[] copyOf(int[] arr, int newLength)：复制arr数组，新数组的长度newLength。
    如果newLength<=arr.length，则复制arr数组的[0, newLength-1]范围的元素，
    如果newLength>arr.length，则复制arr数组的所有元素到新数组，剩下的元素则默认就可以。*/
        int[] arrTest = tool.copyOf(arr,15);
        System.out.println(tool.toString(arrTest));

    /*
    boolean equals(int[] arr1, int[] arr2)：
    判断两个数组的长度和元素是否都相等，如果两个数组以相同顺序包含相同的元素，则两个数组是相等的。
     */
        System.out.println("arr和arrTest两个数组是否相等:" + tool.equals(arr,arrTest));

        //void fill(int[] arr, int start, int end,  int value) ：将arr数组[start,end]范围的元素赋值为value。
        tool.fill(arr,2,7,0);
        System.out.println(tool.toString(arr));

        //String toString(int[] arr)：将元素拼接为"{元素1，元素2，......}"的字符串返回。
    }
}

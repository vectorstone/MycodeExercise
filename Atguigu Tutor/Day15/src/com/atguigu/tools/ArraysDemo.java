package com.atguigu.tools;

import java.util.Arrays;

/*
Arrays工具类用来实现数组相关的操作
    Arrays.toString(): 将数组转换成为 [元素1,元素2...]格式的字符串
    Arrays.equals(): 用来比较数组里的元素是否相同
    Arrays.deepToString() / Arrays.deepEquals():多维数组
    copyOf(int[] src,int length): 从 src数组里第0个元素开始，赋值length长度的数据，生成一个新的数组
    copyOfRange(int[] src,int start,int end): 从src数组的 start(包含)位置开始复制，复制到end(不包含)
    sort(Object[] objects): 对元素进行排序,要求存入的元素必须要实现 Comparable接口
    sort(Object[] objects,Comparator comparator): 传入一个比较器对元素进行排序
    binarySearch(): 二分查找
    fill():对数组进行填充
*/
public class ArraysDemo {
    public static void main(String[] args) {
        int[] nums1 = {5, 6, 8, 2, 1, 4};
        int[] nums2 = {5, 6, 8, 2, 1, 4};


        System.out.println(Arrays.toString(nums1));

        System.out.println(nums1 == nums2); // false
        System.out.println(Arrays.equals(nums1, nums2));  // true

        String[] names = {"jack", "tony", "jerry", "tom", "rose", "henry"};
        String[] names1 = Arrays.copyOf(names, 4);
        System.out.println(Arrays.toString(names1));//[jack, tony, jerry, tom]


        String[] names2 = Arrays.copyOfRange(names, 2, 5);
        System.out.println(Arrays.toString(names2));//[jerry, tom, rose]

        int[] arr = new int[10];
        Arrays.fill(arr, 2);
    }
}

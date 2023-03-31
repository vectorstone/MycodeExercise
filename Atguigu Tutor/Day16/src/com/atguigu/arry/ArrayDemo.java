package com.atguigu.arry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
数组和List的相互转换
数组的特点:
    1. 有序
    2. 长度固定
    3. 存储兼容类型
List的特点:
    1. 有序
    2. 存储兼容类型

Arrays.asList(T...t)方法可以将一个数组转换成为集合
注意事项:
    1. 如果是一个基本数据类型的数组，调用asList方法，得到的List并不是数组里的每个元素
        集合里的元素是 一个数组!!!
    2. asList生成的List集合，不允许增删.
        因为asList方法返回的List集合，它不是 java.util.ArrayList类型
        而是 Arrays.java里的一个私有静态内部类ArrayList
*/
public class ArrayDemo {
    public static void main(String[] args) {
        int[] nums = {4, 9, 3, 1, 2, 7};

        /*list 存储的数据不是 [4, 9, 3, 1, 2, 7] int类型的值，  而是  int数组
        asList(Object...objs)   objs = nums;*/
        List<int[]> list = Arrays.asList(nums);
        System.out.println(list.get(0));


        Integer[] arr = {4, 9, 3, 1, 2, 7};
        List<Integer> integers = Arrays.asList(arr);
        System.out.println(integers.get(0));  // 4
        integers.add(8);//Exception in thread "main" java.lang.UnsupportedOperationException

        List<String> words = new ArrayList<>();
        words.add("hello");
    }
}

package com.atguigu.compare;

import com.atguigu.bean.Computer;

import java.util.Arrays;

/*
Comparable接口
Arrays.sort(Object[] arr) 要求数组里存储的元素必须要实现Comparable接口
实现了 Comparable接口的类，必须要实现 compareTo方法，在compareTo方法里定义比较的规则
根据compareTo()方法的返回值判断是否要交换位置:
*/
public class ComparableDemo {
    public static void main(String[] args) {
        Computer[] computers = {
                new Computer("MateBook", 8000, 1.2),
                new Computer("MacBookPro", 16000, 1.15),
                new Computer("Lenovo", 4500, 2.5),
                new Computer("Alien", 20000, 3)
        };

        Arrays.sort(computers);

        System.out.println(Arrays.toString(computers));
    }

    public static void bubbleSort(Computer[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                // if (arr[i].getPrice() > arr[i + 1].getPrice()) {
                int x = arr[i].compareTo(arr[i + 1]);
                if (x > 0) {
                    Computer c = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = c;
                }
            }
        }
    }
}

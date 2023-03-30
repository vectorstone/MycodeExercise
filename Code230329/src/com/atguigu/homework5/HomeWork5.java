package com.atguigu.homework5;

import com.atguigu.homework1.Student;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/30/2023 9:15 AM
 */
public class HomeWork5 {
    public static void main(String[] args) {
        Integer[] Int = {23, 45, 6, 334, 1, 34, 67, 876, 34, 34};
        sort(Int);
        System.out.println(Arrays.toString(Int));

        // 字符串好像是默认按照首字母的顺序来进行比较的
        String[] s = {"gavin", "sara", "jerry", "tom", "harvey", "brian"};
        sort(s);
        System.out.println(Arrays.toString(s));

        System.out.println("----------------comparator方法-------------------");
        // comparator验证1
        Double[] dd = {22.0, 34.0, 11.0, 56.0, 36.0, 356.0, 98.0};
        sort(dd, new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return (int) (o1 - o2);
            }
        });
        System.out.println(Arrays.toString(dd));
        // comparator验证2
        Student[] st = {
                new Student("张三", 20, 70.0),
                new Student("李四", 34, 89.0),
                new Student("王五", 18, 79.0),
                new Student("龙六", 18, 79.6),
                new Student("阿七", 28, 99.0),
        };
        sort(st, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 按照分数排序,如果分数一样,按照年龄排序
                if (o1.getScore() > o2.getScore()) {
                    return 1;
                } else if (o1.getScore() < o2.getScore()) {
                    return -1;
                } else {
                    return o1.getAge() - o2.getAge();
                }
            }
        });
        for (Student student : st) {
            System.out.println(student.toString());
        }


    }

    public static <T extends Comparable<T>> void sort(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static <T> void sort(T[] arr, Comparator<T> c) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (c.compare(arr[j], arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

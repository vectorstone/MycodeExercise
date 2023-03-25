package com.atguigu.compare;

import com.atguigu.bean.Student;

import java.util.Arrays;

/*
Comparator 比较器接口
sort(Object[] a, Comparator c)
*/
public class ComparatorDemo {
    public static void main(String[] args) {
        Student[] students = {
                new Student("jack", 18, "上海", 89),
                new Student("tony", 19, "南京", 82),
                new Student("jerry", 17, "杭州", 90),
                new Student("merry", 20, "北京", 87),
                new Student("tom", 19, "苏州", 95),
                new Student("henry", 17, "驻马店", 88)
        };
        // Arrays.sort(students);   要求Student必须要实现Comparable接口
        AgeComparator comparator1 = new AgeComparator();
        Arrays.sort(students, comparator1);
        System.out.println(Arrays.toString(students));

        ScoreComparator comparator2 = new ScoreComparator();
        Arrays.sort(students, comparator2);
        System.out.println(Arrays.toString(students));
    }
}

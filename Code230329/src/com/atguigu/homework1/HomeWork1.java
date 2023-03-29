package com.atguigu.homework1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/29/2023 7:57 PM
 */
public class HomeWork1 {
    public static void main(String[] args) {
        Student[] st = {
                new Student("liusan",20,90.0),
                new Student("lisi",22,90.0),
                new Student("wangwu",20,99.0),
                new Student("sunliu",22,100.0)
        };
        Arrays.sort(st);


        System.out.println("按照成绩和年龄排序:");
        show(st);

        System.out.println("-------------------------------");

        //匿名内部类的方式完成对Comparable接口的compare方法的重写
        Arrays.sort(st, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //将名字转换成为数组
                char[] o1Name = o1.getName().toCharArray();
                char[] o2Name = o2.getName().toCharArray();
                //比较名字第一位字母的大小
                if(o1Name[0] > o2Name[0]){
                    return 1;
                }else if(o1Name[0] < o2Name[0]){
                    return -1;
                }else {
                    //假设名字第一位相同,那么就比较名字的长度
                    return o1Name.length - o2Name.length;
                }
            }
        });
        System.out.println("按照姓名排序:");
        show(st);
    }
    public static void show(Student[] s){
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].toString());
        }
    }
}

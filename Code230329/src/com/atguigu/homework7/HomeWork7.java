package com.atguigu.homework7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/30/2023 10:10 AM
 */
public class HomeWork7 {
    public static void main(String[] args) {
        List<Student> st = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        do{
            System.out.print("选择 (1, 录入;  0, 退出 ) :");
            int i1 = input.nextInt();

            if(i1 == 0) {
                break;
            }
            System.out.print("姓名: ");
            String s = input.next();

            System.out.print("年龄: ");
            int i = input.nextInt();

            st.add(new Student(s,i));
        }while(true);
        input.close();
        //增强for方式循环遍历

        for (Student student : st) {
            System.out.println(student.toString());
        }

        System.out.println("---------------我是分割线----------------");
        //迭代器方式循环遍历
        Iterator<Student> iterator = st.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }

    }
}

package com.atguigu.exercise.homework2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/30/2023 3:58 PM
 */
public class HomeWork2 {
    public static void main(String[] args) {
        // 生成[m,n]的随机整数   m = 0 n = poker.size() - 1
        //(int)(Math.random()*(n-m+1))+m;
        List<Integer> official = new ArrayList<>();
        List<Integer> myNumber = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int index = (int) (Math.random() * 50) + 1;
            if (!official.contains(index)) {
                official.add(index);
            }
        }

        // 键盘录入10个整数并放到集合中
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("请输入第" + i + "个数字[1-50]:");
            int i1 = input.nextInt();
            if (myNumber.contains(i1)) {
                System.out.print("输入数字有重复,请重新输入:");
                i--;
            } else if (i1 < 0 || i1 > 50) {
                System.out.print("输入数字不在范围内,");
                i--;
            } else {
                myNumber.add(i1);
            }
        }
        System.out.println("您输入的号码为:" + myNumber.toString());
        System.out.println("乐透号码为:" + official.toString());

        int count = 0;
        for (int i = 0; i < myNumber.size(); i++) {
            if (official.contains(myNumber.get(i))) {
                count++;
            }
        }
        System.out.println("猜中了:" + count + "个数字");


    }
}

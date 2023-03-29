package com.atguigu.homework1;

import java.util.Scanner;

/**
 * @Description: 键盘录入QQ号码, 验证格式的正确性
 * @Author: Gavin
 * @Date: 3/27/2023 6:35 PM
 */
public class HomeWork2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入QQ号:");
        String i = input.next();
        input.close();

        //[1-9]表示第一位只能是1-9
        //\\d表示是数字{4,11}表示前面的数字可以出现4-11次,加上第一位刚好5,12位
        String regex = "[1-9]\\d{4,11}";
        System.out.println(i.matches(regex));
    }
}

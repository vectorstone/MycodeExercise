package com.atguigu.homework1;

import java.util.Scanner;

/**
 * @Description:反转键盘录入的字符串
 * @Author: Gavin
 * @Date: 3/27/2023 4:52 PM
 */
public class HomeWork1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("录入的字符串: ");
        String next = input.next();
        input.close();

        char[] chars = next.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length- 1 - i];
            chars[chars.length - 1 - i] = temp;
        }
        String s = new String(chars);
        System.out.println("反转的字符串: "+ s);
    }
}

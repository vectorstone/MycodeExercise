package com.atguigu.homework1;

import java.util.Scanner;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/27/2023 8:28 PM
 * 判断回文字符串。如果一个字符串，从前向后读和从后向前读，都是一个字符串，称为回文串，比如mom，dad，noon。
 */
public class HomeWork7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入字符串内容:");
        String i = input.next();
        input.close();

        String before = i.substring(0,i.length() / 2);
        String after = i.substring(i.length()/2);
        String afterReverse = reverse(after);
        System.out.println(i+"是回文字符串吗?"+(before.equals(afterReverse)));

    }
    public static String reverse(String s){
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length- 1 - i];
            chars[chars.length - 1 - i] = temp;
        }
        return new String(chars);
    }
}

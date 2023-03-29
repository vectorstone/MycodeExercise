package com.atguigu.homework1;

import java.util.Arrays;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/27/2023 10:41 PM
 * 有一个字符串String abc = “342567891”，
 * 请写程序将字符串abc进行升序，可以使用JDK API中的现有的功能方法。
 */
public class HomeWork11 {
    public static void main(String[] args) {
        String abc = "342567891";
        char[] chars = abc.toCharArray();
        Arrays.sort(chars);
        /*for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length- 1 - i];
            chars[chars.length - 1 - i] = temp;
        }*/
        System.out.println(new String(chars));
    }
}

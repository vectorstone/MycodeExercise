package com.atguigu.homework1;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/27/2023 11:22 PM
 * 案例：已知字符串String str = "1.hello2.world3.java4.string";要求拆分出每一个单词，并遍历显示
 */
public class HomeWork13 {
    public static void main(String[] args) {
        String str = "1.hello2.world3.java4.string";
        str = str.replaceAll("1.","");
        System.out.println(str);
        String[] x = str.split("\\d\\.");
        // System.out.println(Arrays.toString(x));
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }

}

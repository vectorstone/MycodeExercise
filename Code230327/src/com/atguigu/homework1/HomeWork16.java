package com.atguigu.homework1;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/28/2023 6:04 PM
 */
public class HomeWork16 {
    private static void change(String s, StringBuffer sb) {
        s = "aaaa";
        sb.setLength(0);
        sb.append("aaaa");
    }

    public static void main(String[] args) {
        String s = "bbbb";
        StringBuffer sb = new StringBuffer("bbbb");
        change(s, sb);
        //bbbbaaaa
        System.out.print(s + sb);
    }
}

package com.atguigu.exercse.test;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/13/2023 5:17 PM
 */
public class Test17 {
    public static void main(String[] args) {
        String str = "aabbccbb";
        String[] bbs = str.split("bb");
        System.out.println("分割后的数量:"+bbs.length);
        StringBuilder sb = new StringBuilder();
        for (String bb : bbs) {
            sb.append(bb).append("dd");
        }
        System.out.println(sb);

        String[] bbs1 = str.split("bb", 3);
        for (String s : bbs1) {
            System.out.println(s);
        }
    }
}

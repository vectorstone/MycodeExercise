package com.atguigu.homework1;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/28/2023 6:19 PM
 */
public class HomeWork20 {
    public static void main(String[] args) throws Exception {
        String str = "中国";
        System.out.println(str.getBytes("UTF-8").length);//6
        System.out.println(str.getBytes("GBK").length);//4
        System.out.println(str.getBytes("ISO-8859-1").length);//2
        System.out.println(new String(str.getBytes("ISO-8859-1"),"ISO-8859-1"));//??
        System.out.println(new String(str.getBytes("UTF-8"),"UTF-8"));//中国
        System.out.println(new String(str.getBytes("GBK"),"GBK"));//中国
    }
}

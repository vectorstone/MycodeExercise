package com.atguigu.exercse.test;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/12/2023 11:34 PM
 */
public class ExtName {
    public static void main(String[] args){
        String str = fileExtNameFromUrl("http://localhost:8080/testweb/index.html");
        System.out.println(str);
    }

    public static String fileExtNameFromUrl(String url){
        //获取"."在字符串中的下标
        int index = url.indexOf(".");
        url = url.substring(index + 1);
        return url;
    }
}

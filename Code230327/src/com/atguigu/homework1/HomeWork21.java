package com.atguigu.homework1;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/28/2023 6:23 PM
 */
public class HomeWork21 {
    public static void link(String a) {
        a += "world";

    }

    public static void main(String[] args) {
        String a = "Hello";
        link(a);
        //结果是Hello,有点想不通,似乎link方法里面的操作根本不影响a的值
        System.out.println(a);

        a = a + "111";
        System.out.println(a);

        //true 编译器里面"ja" + "va"就是"java"
        System.out.println("ja" + "va" == "java");

        final String str = "java";
        System.out.println(str == "java");//true
    }
}

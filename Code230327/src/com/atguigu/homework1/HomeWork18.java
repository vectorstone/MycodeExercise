package com.atguigu.homework1;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/28/2023 6:10 PM
 */
public class HomeWork18 {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        operate(a, b);
        //结果是AB,B   字符串作为形参,修改后不影响原本的值
        System.out.println(a + "," + b);
    }

    public static void operate(StringBuffer x, StringBuffer y) {
        x.append(y);
        y = x;
    }
}

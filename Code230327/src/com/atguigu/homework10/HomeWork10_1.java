package com.atguigu.homework10;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/27/2023 9:46 PM
 * 匿名内部类
 */
public class HomeWork10_1 {
    public static void main(String[] args) {
        HomeWork10_1 c = new HomeWork10_1();
        int n = 4;
        String num = "23.23456789";
        System.out.println("原数字:" + num);
        c.conversion(num, n, new Handleable() {
            @Override
            public String handleString(String num) {
                int index = num.indexOf('.');
                return num.substring(0, index);
            }
        });
    }


    public void conversion(String s, int n, Handleable obj) {
        String m = obj.handleString(s);
        System.out.println("取整后:"+m);

    }
}

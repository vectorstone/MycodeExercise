package com.atguigu.homework10;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/27/2023 9:46 PM
 * 匿名内部类
 */
public class HomeWork10_2 {
    public static void main(String[] args) {
        HomeWork10_1 c = new HomeWork10_1();
       final int n = 4;
        String num = "23.23456789";
        System.out.println("原数字:" + num);

        c.conversion(num, n, new Handleable() {
            @Override
            public String handleString(String num) {
                int index = num.indexOf('.');
                char[] arr = num.toCharArray();
                if (arr[index + n + 1] >= 5) {
                    arr[index + n] += 1;
                }
                return (new String(arr)).substring(0,index+n+1);
            }
        });
    }


    public void conversion(String s, int n, Handleable obj) {
        String m = obj.handleString(s);
        System.out.println("保留"+n+"位小数,四舍五入后:"+m);

    }
}

package com.atguigu.homework1;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/27/2023 7:48 PM
 * 生成一个随机100内小数，转换为保留两位小数的字符串，不考虑四舍五入的问题。
 */
public class HomeWork5 {
    public static void main(String[] args) {

        // 先生成100以内的随机小数
        double small = Math.random() * 100;

        String num = String.valueOf(small);
        System.out.println("转换前的小数为:"+num);
        //substring(start,end) 不包括end
        //.开始的位置是num.indexOf
        num = num.substring(0,num.indexOf('.')+3);
        System.out.println("转换后的小数为:"+num);

    }
}

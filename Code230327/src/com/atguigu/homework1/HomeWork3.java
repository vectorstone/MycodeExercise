package com.atguigu.homework1;

import java.util.Scanner;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/27/2023 6:42 PM
 *
 * * 键盘录入一个大字符串，再录入一个小字符串。
 * * 统计小字符串在大字符串中出现的次数。
 */
public class HomeWork3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入大字符串:");
        String big = input.nextLine();
        System.out.println();
        System.out.print("请输入小字符串:");
        String small = input.nextLine();
        input.close();

        //方法一
        /*String replace = big.replace(small, "");
        int count = (big.length() - replace.length()) / small.length();
        System.out.println(small+"在"+big+"中出现的次数是:"+count);*/

        //方法二
        int count = 0;
        int index;
        //如果字符串big中不含有small,那么indexOf方法会返回-1,这个时候就不会进入循环
        while((index = big.indexOf(small)) != -1){
            //从指定位置开始截取内容一直到最后
            big = big.substring(index+small.length());
            count++;
        }
        System.out.println(small+"在"+big+"中出现的次数是:"+count);

    }
}

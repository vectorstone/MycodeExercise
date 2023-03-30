package com.atguigu.extraexercise;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/30/2023 10:23 AM
 * 格式化输出方法
 * 输入1   输出1s
 * 输入61  输出1min1s
 * 格式  ?h?min?s
 */
public class TimeDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("请输入秒数:");
            int i = input.nextInt();
            int second = i % 60;
            int min = (i / 60) % 60;
            int h = i / 60 / 60;
            System.out.println(h+"h "+min+"min "+second+"s");


        }catch (InputMismatchException e){
            e.printStackTrace();
            System.err.println("输入的数据有误");
        }


    }
}

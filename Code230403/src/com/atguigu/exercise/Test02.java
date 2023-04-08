package com.atguigu.exercise;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/5/2023 10:42 AM
 */
public class Test02 {
    public static void main(String[] args) {
        print(40);
    }
    public static void print(int n){
        //an = a1 + (n-1)d
        //外循环控制行数
        for (int i = 0; i < n; i++) {
            //内循环控制每行的打印内容
            //打印空格,最后一行没有空格
            for (int j = 0; j <n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i - 1; j++) {
                System.out.print("*");
            }
            //每行打印完就换行
            System.out.println();
        }

    }
}

package com.atguigu.homework1;

import java.util.Scanner;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/27/2023 8:41 PM
 * 校验密码是否合法。
 * * 必须至少9个字符。
 * * 必须至少2个大写字符。
 * * 必须包含字母和数字。
 */
public class HomeWork8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入密码: ");
        String next = input.next();
        input.close();
        char[] arr = next.toCharArray();
        int upCase = 0;
        int lowCase = 0;
        int num = 0;
        boolean status;
        if(arr.length >= 9){
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] >= '0' && arr[i] <= '9'){
                    num++;
                }else if(arr[i] >= 'a' && arr[i] <= 'z'){
                    lowCase++;
                }else if(arr[i] >= 'A' && arr[i] <= 'Z'){
                    upCase++;
                }
            }
            status = num > 0 && upCase >= 2 && lowCase > 0 ;
        }else{
            status = false;
        }
        System.out.println(next+"是否合法:"+status);
    }
}

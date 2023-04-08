package com.atguigu.exercise;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/5/2023 10:35 AM
 */
public class Test01 {
    public static void main(String[] args) {
        //非递归的方式 f4 = 4+3+2+1=10 f5=15
        System.out.println(sum(5));
        System.out.println(sum(4));
        System.out.println(multiply(3));//3*2*1=6
        System.out.println(multiply(4));//24
    }
    public static int sum(int n ){
        int sum = 0;
        for (int i = n; i > 0; i--) {
            sum += i;
        }

        return sum;
    }
    public static int multiply(int n){
        int mul = 1;
        for (int i = n; i > 0; i--) {
            mul *= i;
        }
        return mul;
    }
}

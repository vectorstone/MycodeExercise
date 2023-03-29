package com.atguigu.fin;

import java.util.Arrays;

public class FinallyTest {
    public static void main(String[] args) {
        int x = test();
        System.out.println(x);

        int[] arr = demo();
        System.out.println(Arrays.toString(arr));
    }

    public static int test() {
        int result = 5;
        try {
            result = result / 0;
            return result;
        } catch (Exception e) {
            System.out.println("Exception");
            result = -1;
            return result;//(1)先把-1放到操作数栈（2）走finally（3）结束
        } finally {
            result = 10;
            System.out.println("I am in finally.");
        }
    }

    public static int[] demo() {
        int[] result = {1, 2, 3};
        try {
            int a = 1 / 0;
            return result;
        } catch (Exception e) {
            System.out.println("Exception");
            return result;
        } finally {
            result[0] = 5;
            System.out.println("I am in finally.");
        }
    }
}

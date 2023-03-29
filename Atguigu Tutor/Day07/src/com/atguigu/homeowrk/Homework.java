package com.atguigu.homeowrk;

public class Homework {
    public static void main(String[] args) {
        int i = 0;
        change(i);

        /*
         int x = i++;   x=0,i=1
         i = x;
        */
        i = i++;
        System.out.println("i = " + i);  // i = 0

        int[] nums = {1, 2, 3};
        change(nums);
        System.out.println(nums[0]);

    }

    public static void change(int x) { // x = 0;
        x++;  // x=1
    }

    public static void change(int[] arr) {  // int[] arr = nums;
        arr[0] = 10;
    }
}

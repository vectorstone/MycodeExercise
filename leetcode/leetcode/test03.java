package com.atguigu.leetcode;

import java.util.Arrays;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/23/2023 4:53 PM
 */
public class test03 {
    public static void main(String[] args) {
        /*int[] nums = {3,2,4};
        int target = 6;*/
        int[] nums = {3,3};
        int target = 6;
        int[] result = search(nums,target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] search(int[] nums,int target){
        //先排序
    /*    for (int i = 0; i < nums.length-1; i++) {
            boolean status = false;
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    status = true;
                }
            }
            if(!status){
                break;
            }
        }

        int[] sum = new int[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) {
            sum[i] = nums[i] + nums[i+1];
        }
        int index = 0;
        for (int i = 0; i < sum.length; i++) {
            if(target == sum[i]){
                index = i;
            }
        }*/
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(((nums[i]+nums[j]) == target) && i != j){
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }


        return arr;
    }
}

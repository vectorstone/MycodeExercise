package com.atguigu.homework;

import java.util.Arrays;

public class Test06 {
    public static void main(String[] args) {
        // 删除长度大于等于5的数组
        String[] arr = {"hello", "good", "ok", "world", "atguigu", "morning", "apple"};

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < 5) {
                count++;
            }
        }

        String[] result = new String[count];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i].length() < 5) {
                result[j++] = arr[i];
            }
        }

        System.out.println(Arrays.toString(result));
    }
}

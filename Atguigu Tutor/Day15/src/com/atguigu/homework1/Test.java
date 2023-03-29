package com.atguigu.homework1;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String s = "hello";
        demo(arr, s);
        System.out.println(arr[0]);  // 1
        System.out.println(s);  // hello
    }

    public static String demo(int[] arr, String x) {
        // arr[0] = 5;

        // arr = new int[]{9, 87, 6, 5};

        // s = "good";
        x = x.replace("l", "x");
        return x;
    }
}

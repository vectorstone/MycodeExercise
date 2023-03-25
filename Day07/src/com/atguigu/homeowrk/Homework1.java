package com.atguigu.homeowrk;

import java.util.Arrays;

/*
使用二维数组保存扑克牌
 */
public class Homework1 {
    public static void main(String[] args) {
        String[][] arr = {new String[4], new String[13]};

        // 4、把花色和点数放进去
        // 花色
        arr[0][0] = "黑桃";
        arr[0][1] = "红桃";
        arr[0][2] = "梅花";
        arr[0][3] = "方片";

        // 点数
        arr[1][0] = "A";
        for (int i = 1; i <= 9; i++) {// 表示第二行部分下标
            arr[1][i] = i + 1 + "";
        }
        arr[1][10] = "J";
        arr[1][11] = "Q";
        arr[1][12] = "K";

        System.out.println(Arrays.deepToString(arr));
    }
}

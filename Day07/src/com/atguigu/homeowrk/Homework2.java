package com.atguigu.homeowrk;

import java.util.Arrays;
import java.util.Scanner;

/*
输入每组学生的成绩，并进行统计
 */
public class Homework2 {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("请输入有多少组学生:");
        int groupCount = scanner.nextInt();
        int[][] scores = new int[groupCount][];

        for (int i = 0; i < groupCount; i++) {
            System.out.print("请输入第" + (i + 1) + "组学生的个数:");
            int memberCount = scanner.nextInt();
            scores[i] = new int[memberCount];
            for (int j = 0; j < memberCount; j++) {
                System.out.print("第" + (i + 1) + "组第" + (j + 1) + "个学生的成绩是:");
                int score = scanner.nextInt();
                scores[i][j] = score;
            }
        }
        scanner.close();*/
        int[][] scores = {
                {90, 98, 87, 56, 88},
                {92, 78, 97, 60},
                {80, 88, 90, 70, 56, 89},
                {75, 68, 88, 95, 87, 80, 67}
        };


        int max = scores[0][0];
        int min = scores[0][0];
        int sum = 0;
        int count = 0;
        for (int i = 0; i < scores.length; i++) {
            int groupMax = scores[i][0];  // 假设每一组的第0个学生是最高分
            int groupMin = scores[i][0];
            int groupSum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                count++;
                groupSum += scores[i][j];
                if (scores[i][j] > groupMax) {
                    groupMax = scores[i][j];
                }
                if (scores[i][j] < groupMin) {
                    groupMin = scores[i][j];
                }
            }
            sum += groupSum;
            if (groupMax > max) {
                max = groupMax;
            }
            if (groupMin < min) {
                min = groupMin;
            }
            int avg = groupSum / scores[i].length;
            System.out.println("第" + (i + 1) + "组最高分是" + groupMax + "，最低分是" + groupMin + "，平均分" + avg);
        }
        System.out.println(count);
        System.out.println("全班的最低分" + min + ",最高分" + max + "，平均分" + (sum / count));
        System.out.println(Arrays.deepToString(scores));

    }
}

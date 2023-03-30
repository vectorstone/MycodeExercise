package com.atguigu.exercise.homework3;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/30/2023 4:22 PM
 */
public class HomeWork3 {
    public static void main(String[] args) {

        //(int)(Math.random()*(n-m+1))+m;
        // (int)(Math.random()*100+1);
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int m = (int) (Math.random() * 100 + 1);
            num.add(m);
        }
        System.out.println("10个随机值:" + num.toString());
        // 将第一个最值从原有集合中删除,并且放到最值的集合中
        List<Integer> max = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            // 最值添加到最值集合中
            max.add(getMax(num));
            // 删除原有集合中的这个元素
            // 注意这个地方用的remove(Object o),方法,所以需要使用Integer.valueOf方法手动对数据装箱
            num.remove(Integer.valueOf(getMax(num)));
        }
        System.out.println("前3个最大的:" + max.toString());
        System.out.println("删除后:" + num.toString());


    }

    // 最大值方法
    public static int getMax(List<Integer> num) {
        int max = num.get(0);
        for (int i = 0; i < num.size(); i++) {
            if (max < num.get(i)) {
                max = num.get(i);
            }
        }
        return max;
    }
}

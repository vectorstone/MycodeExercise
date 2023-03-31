package com.atguigu.exercise.homework7;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/31/2023 9:12 PM
 */
public class HomeWork7 {
    public static void main(String[] args) {

        Set<Integer> red = new TreeSet<>();
        // 生成红色号码
        // Integer默认实现了Comparable接口
        /*for (int i = 0; i < 6; i++) {
            boolean add = red.add(generateNumber(1, 33));
            if (!add) {
                // 如果添加不成功,那么i--,重新生成随机数再添加
                i--;
            }
        }*/
        while(red.size()<6){
            red.add(generateNumber(1,33));
        }
        // 生成蓝色号码(蓝色号码使用ArrayList放,为什么不用treeSet,因为tree放的时候会给排序,排完序就不知道谁是蓝色号码了
        List<Integer> num = new ArrayList<>();
        num.addAll(red);
        num.add(generateNumber(1, 16));
        System.out.println("双色球所有号码:" + num);
        System.out.print("红色号码:");
        for (int i = 0; i < 6; i++) {
            System.out.print(num.get(i) + " ");
        }
        System.out.println("蓝色号码:" + num.get(6));
    }
    // 定义个方法用来生成随机数
    public static int generateNumber(int start, int end) {
        return (int) (Math.random() * (end - start + 1)) + start;
    }
}

package com.atguigu.exercise.homework6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/31/2023 9:07 PM
 * 使用HashSet
 */
public class HomeWork6_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入字符:");
        String next = input.next();

        input.close();
        System.out.println("去重前:"+next);
        //使用split方法将字符串进行分割并转换成String数组
        String[] split = next.split("");
        //将该数组存入HashSet中
        Set<String> ss = new HashSet<>();
        for (int i = 0; i < split.length; i++) {
            ss.add(split[i]);
        }
        System.out.print("去重后:");
        Iterator<String> itr = ss.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next());
        }
    }
}

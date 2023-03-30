package com.atguigu.exercise.homework4;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/30/2023 6:23 PM
 */
public class HomeWork4 {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            //(int)(Math.random()*(n-m+1))+m;
            int n = (int)(Math.random()*(100-2+1))+2;
            if(!num.contains(n)){
                num.add(n);
            }
        }
        System.out.println("随机数为:"+num.toString());
        //获取其中的质数
        List<Integer> prime = new ArrayList<>();

        for (int j = 0; j < num.size(); j++) {
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(num.get(j)) ; i++) {
                if(num.get(j) % i  == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                prime.add(num.get(j));
            }
        }
        System.out.println("其中的质数为:"+prime.toString());

    }
}

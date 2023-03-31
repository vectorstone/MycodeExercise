package com.atguigu.exercise.homework5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/31/2023 7:53 PM
 * 用list和set方法统计字符出现的次数(后面用map改进一下)
 */
public class HomeWork5 {
    public static void main(String[] args) {
        List<Character> alphabet = new ArrayList<>();
        //随机生成30个小写字符放到集合中,随机数的范围[97,122]
        //随机生成[m,n]范围的随机数 (int)(Math.random()*(n+1 -m)) +m
        for (int i = 0; i < 30; i++) {
            int x = (int)(Math.random()*(122+1 - 97))+97;
            alphabet.add((char)x);
        }
        System.out.println(alphabet);

        //再来创建一个集合,用来存放每个字符出现的次数
        List<Integer> num = new ArrayList<>();
        for (char i = 'a'; i <='z' ; i++) {
            int count = 0;
            for (int j = 0; j < alphabet.size(); j++) {
                if(i == alphabet.get(j)){
                    count++;
                }
            }
            num.add(count);
        }
        // System.out.println(num);
        //循环遍历
        for (int i = 0; i < num.size(); i++) {
            System.out.println((char)(i+97)+":"+num.get(i));
        }
        System.out.println("--------------------------");
        //用map的方式再来一次
        Map<Character,Integer> status = new HashMap<>();
        for (int i = 0; i < alphabet.size(); i++) {
           char x = alphabet.get(i);
            Integer s = status.getOrDefault(x, 0);
            status.put(x,++s);
        }
        System.out.println(status);
    }
}

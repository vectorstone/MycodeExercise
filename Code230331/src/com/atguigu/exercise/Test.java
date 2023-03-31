package com.atguigu.exercise;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/31/2023 2:10 PM
 */
public class Test {
    public static void main(String[] args) {
        String word = "aaaabbbbcccceeeedddd";
        char[] chars = word.toCharArray();
        Map<Character,Integer> count = new HashMap<>();
        for (char i = 'a'; i < 'z' ; i++) {
            int num = 0;
            for (int j = 0; j < chars.length; j++) {
                if(i == chars[j]){
                    num++;
                }
            }
            count.put(i,num);
        }
        System.out.println(count);
    }

}

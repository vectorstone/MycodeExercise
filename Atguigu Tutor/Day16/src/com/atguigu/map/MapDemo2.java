package com.atguigu.map;

import java.util.HashMap;
import java.util.Map;

/*
统计字符串里每个字符出现的次数
 */
public class MapDemo2 {
    public static void main(String[] args) {
        String word = "amcmcaccmcx";

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int count = map.getOrDefault(c, 0);
            map.put(c, ++count);
        }

        // {a=2, c=5, x=1, m=3}
        System.out.println(map);
    }
}

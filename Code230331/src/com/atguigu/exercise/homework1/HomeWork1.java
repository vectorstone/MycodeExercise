package com.atguigu.exercise.homework1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/31/2023 9:46 PM
 */
public class HomeWork1 {
    public static void main(String[] args) {
        String str = "Your future depends on your dreams, so go to sleep.";
        // 使用正则表达式将非字母的东西去掉
        // 记得要重新复制,修改并不会改变原有字符串的值
        str = str.replaceAll("[^a-zA-Z]", "");
        System.out.println(str);

        // 字母出现的次数
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            int s = map.getOrDefault(x, 0);
            map.put(x, ++s);
        }
        //Map集合的遍历
        Set<Map.Entry<Character,Integer>> entrySet = map.entrySet();
        for (Map.Entry<Character, Integer> s : entrySet) {
            System.out.println(s.getKey()+" = "+s.getValue());
        }
    }
}

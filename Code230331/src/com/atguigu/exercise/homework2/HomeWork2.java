package com.atguigu.exercise.homework2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/31/2023 9:57 PM
 */
public class HomeWork2 {
    public static void main(String[] args) {
        Map<String,String> album = new HashMap<>();
        String songs1 = "[ <<一路上有你>>,<<吻别>>,<<一千个伤心的理由>> ]";
        String songs2 = "[ <<红豆>>,<<传奇>>,<<容易受伤的女人>> ]";
        album.put("张学友",songs1);
        album.put("王菲",songs2);

        //Map集合的遍历
        Set<Map.Entry<String,String>> entryset = album.entrySet();
        for (Map.Entry<String, String> s : entryset) {
            System.out.println(s.getKey()+" = "+s.getValue());
        }
    }
}

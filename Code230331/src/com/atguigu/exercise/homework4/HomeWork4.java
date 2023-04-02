package com.atguigu.exercise.homework4;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/1/2023 9:50 PM
 */
public class HomeWork4 {
    public static void main(String[] args) {
        Map<String, String[]> map = new HashMap<>();
        map.put("浙江省", new String[]{"绍兴市", "温州市", "湖州市", "嘉兴市", "台州市", "金华市", "舟山市", "衢州市", "丽水市", "杭州市", "宁波市"});
        map.put("海南省", new String[]{"海口市", "三亚市"});
        map.put("北京市", new String[]{"北京市"});

        for (Map.Entry<String, String[]> s : map.entrySet()) {
            System.out.println(s.getKey() + ":");
            for (String s1 : s.getValue()) {
                System.out.println("\t" + s1);
            }
        }
    }
}

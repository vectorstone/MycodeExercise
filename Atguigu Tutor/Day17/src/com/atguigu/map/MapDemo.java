package com.atguigu.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
values(): 获取到所有的value组成的Collection类型的集合
keySet(): 获取到所有的key组成的 Set集合
entrySet(): 将 每个键值对 都封装成为一个 Entry类型的对象，然后将所有的键值对存入到Set集合里
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("绿巨人", "浩克");
        map.put("美国队长", "史蒂夫罗杰斯");
        map.put("天蓬元帅", "猪八戒");
        map.put("齐天大圣", "孙悟空");
        map.put("二郎真君", "杨戬");
        map.put("弼马温", "孙悟空");

        // 遍历所有的value
        Collection<String> values = map.values();
        for (String v : values) {
            System.out.println(v);
        }
        System.out.println("-----------------");

        // 获取到所有的key组成的Set集合
        /*Set<String> keys = map.keySet();
        for (String k : keys) {
            System.out.println(k + " = " + map.get(k));
        }*/
        for (String k : map.keySet()) {
            System.out.println(k + " = " + map.get(k));
        }
        System.out.println("----------------------");

        /*Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            // System.out.println(entry.getClass());
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }*/

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

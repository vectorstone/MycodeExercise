package com.atguigu.map;

import java.util.HashMap;
import java.util.Map;

/*
Map是集合框架里的一个接口，用来存储成对的数据
    HashMap / HashTable / TreeMap / LinkedHashMap

Map里的key不允许重复，如果重复，后一个出现的value会覆盖前一个出现的value
怎样判断key是否重复呢?
    HashMap: 先看哈希值，然后再调用equals
    TreeMap:要求key必须要实现Comparable接口，调用compareTo

map里的常见方法:
    put(K k,V v): 存入一个键值对。如果key已经存在，后一个value会覆盖前一个value
    putIfAbsent(K k,V v): 存入一个键值对，如果key已经存在，后一个value不再写入
    get(Object key): 根据key获取到value,如果key不存在，返回null
    getOrDefault(K k,V defaultValue): 如果key存在获取到对应value,如果key不存在使用defaultValue
    replace(K k,V v): 根据k找到并替换对应的value
    remove(K k): 根据k删除键值对，返回值是删除的 value
*/
public class MapDemo1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("钢铁侠", "托尼史塔克");
        map.put("蜘蛛侠", "彼得帕克");
        map.put("齐天大圣", "孙悟空");
        map.put("弼马温", "孙悟空");
        map.put("及时雨", "宋江");
        map.put("黑旋风", "李逵");
        map.put("黑旋风", "李鬼");
        map.putIfAbsent("及时雨", "宋公明");

        System.out.println(map);

        System.out.println(map.get("弼马温"));
        System.out.println(map.get(3));

        System.out.println(map.getOrDefault("齐天大圣", "张三"));
        System.out.println(map.getOrDefault("天蓬元帅", "张三"));

        map.replace("黑旋风", "李逵");
        map.replace("卷帘大将", "沙僧");

        map.replace("及时雨", "宋公明", "张三");
        System.out.println(map);

        String x = map.remove("xxx");
        System.out.println(map);
        System.out.println(x);

        map.remove("黑旋风","李鬼");
        System.out.println(map);
    }
}

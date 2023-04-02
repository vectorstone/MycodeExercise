package com.atguigu.srouce;

import java.util.HashMap;

/*
HashMap源码分析: 底层使用的是 数组+单向链表 或者 数组+二叉树结构

1. 构造器:
    HashMap(): 空参数构造方法，将 成员变量 loadFactor设置为 DEFAULT_LOAD_FACTOR 0.75
    HashMap(int initialCapacity): 创建 HashMap并指定 初始容量
    HashMap(int initialCapacity,float loadFactor): 创建 HashMap并指定 初始容量 和 加载因子

    initialCapacity     table.length
         13                  16
         7                    8
         25                   32
         4                    4
    table的长度是第一个大于等于  initialCapacity的2的n次方的值。

2. 成员变量
    size: 表示键值对的个数
    Node[] table: 用来存储 Map里的键值对数据
        如果table不指定长度，默认长度是 16, table的长度始终是 2的n次方
        使用的是懒加载的形式，如果不存入数据，table是null; 当调用 put方法存入键值对时，table才会初始化
    loadFactor: 加载因子，默认值是 0.75
    threshold:  阈值，就是临界值  threshold = table.length * loadFactor

    DEFAULT_INITIAL_CAPACITY: table长度的默认值,16

3. 方法:
    put(K k,V v): 存入一个键值对，调用 putVal(hash(key), key, value, false, true)
        hash(key):  重算key的哈希值 (h=key.hashCode()) ^ (h >>> 16)


HashMap存入元素时，下标的计算规则: 使用 (table.length - 1) & key重算后的哈希值x 得到下标
    x&(table.length-1)  和  x%table.length 结果是一样的，但是推荐使用   x&(table.length-1)
    位运算的计算效率是最高的

思考:
    1. 为什么长度不直接使用 initialCapacity,而是要使用 第一个大于等于 initialCapacity的2的n次方的值?
        原因: 因为下标的计算规则  (table.length - 1) & key重算后的哈希值
            如果table的长度是2的n次方，table.length - 1 的二进制是 全1, 做按位与运算更加快捷
            如果table的长度是2的n次方, 下标就是取重算后哈希值二进制的后n位

    2. 为什么不直接使用key的哈希值?而是要重算哈希值?
        原因: 计算下标时，只取后n位，直接使用 哈希值，就会出现 如果两个key完全不同，只有二进制的后n位相同会存入到同一个下标
            重算哈希值，让 key的高位也参与下标的计算，尽可能的避免不同的key存储在同一个位置的概率

    3. 数组里的元素在什么情况下会变成二叉树结构？
        同时满足以下两个条件:
        a. 同一个位置上，元素的个数超过8个，从第9个开始，考虑变成树形结构
        b. 如果长度不够64位，会先将数组的长度扩容为原来的2倍，直到table的长度是64
        同一个位置上的元素超过8个，同时table的长度达到64才从链表变成树形结构!
    4. 为什么同一个位置上的元素超过了8个，不是变成树，而是扩容数组的长度到64?
    5. 什么情况下，数组会扩容?
        a. 如果同一个位置上的元素怒超过8个，同时table的长度不够64,会扩容到64
*/
public class MapSource {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("黑旋风", "李逵");
        map.put("E", "hello");

        map.put("3Qj", "value1");
        map.put("2pj", "value2");
        map.put("2qK", "value3");
        map.put("2r,", "value4");
        map.put("3RK", "value5");
        map.put("3S,", "value6");
        map.put("42j", "value7");
        map.put("43K", "value8");
        map.put("44,", "value9");


    }
}

package com.atguigu.collection;

import java.util.ArrayList;
import java.util.HashMap;

/*
容器: 可以用来存储多个数据元素   数组是一个按照顺序用来存储兼容类型元素的固定长度的容器

数组的特点:
    1. 元素有序
    2. 存储兼容类型
    3. 长度固定，不可增删

集合框架: 新的容器
    Collection接口: 存储的是单个数据
        List接口: 存储的数据有序，且允许重复
            ArrayList: 可变数组
            LinkedList: 双向链表结构
            Vector: 和 ArrayList类似
        Set接口: 存储的数据无序，且不允许重复
            HashSet: 使用的哈希表结构的Set集合
            TreeSet: 使用二叉树结构的Set集合
            LinkedHashSet: 链表+哈希表结构的Set集合
    Map接口: 存储的是数据是成对的数据
        HashMap:
        TreeMap:
        LinkedHashMap:
        HashTable:
*/
public class CollectionDemo1 {
    public static void main(String[] args) {
        // String[] names = new String[10];
        ArrayList list = new ArrayList();
        list.add("hello");

        // fewoijfdlkjiherr
        HashMap map = new HashMap();
        map.put("f", 2);
        map.put("e", 2);
        map.put("w", 1);
    }
}

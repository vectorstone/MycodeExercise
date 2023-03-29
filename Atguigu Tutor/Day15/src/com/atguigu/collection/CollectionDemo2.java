package com.atguigu.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/*
Collection是接口，JDK里没有提供此接口的直接实现子类
Collection有两个子接口:List 和 Set
Collection里定义的非私有方法，List和Set都可以使用

Collection里的方法:
    size(): 表示元素的个数
    isEmpty(): 判断Collection是否为空
    contains(Object obj) / containsAll(Collection c): 判断元素是否存在
    iterator(): 获取到Collection的迭代器
    toArray() / toArray(T[] a): 转换成为数组

    add(E e) / addAll(Collection c): 添加元素
    remove(Object o) / removeAll(Collection c):移除元素
    removeIf(Predicate<? super E> filter): 按照条件删除
    clear():清空
    stream():获取到 Stream 流

没有通过下标操作元素的方法!!!
*/
public class CollectionDemo2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("hello");
        list.add("good");
        list.add(5);
        list.add(3.14);
        list.add(true);

        HashSet set = new HashSet();
        set.add("ok");
        set.add(7);
        list.addAll(set);

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("good"));
        Object[] objects = list.toArray();
        System.out.println(Arrays.toString(objects));

        list.remove("ok");
        System.out.println(list);  // list重写了toString()方法
        list.clear();
        System.out.println(list);
    }
}

package com.atguigu.srouce;

import java.util.*;

/*
List的源码分析:
    ArrayList:  底层使用的是数组结构     查询快，增删慢,适用于查询多 增删少的场景
    LinkedList: 底层使用的是双向链表结构  查询慢，增删快
    Vector: 实现和ArrayList基本相似，但是它是线程安全的，效率低

ArrayList源码分析:
    1. 构造器:
        ArrayList(): 空参数构造方法，将 elementData 设置为 {}
        ArrayList(int initialCapacity): 创建一个ArrayList并指定 elementData 的初始容量
    2. 成员变量:
        Object[] elementData: 用来存储所有数据的数组
        int modCount: 表示修改的次数，每次add/remove都会 modCount++
        size: 表示元素的个数，默认值是 0
    3. 方法:
        add(E e): 第一次添加时，如果elementData是空数组，添加的元素个数不超过10, elementData的长度会被初始化为10
            如果第一次一次性添加的元素个数超过10, elementData的长度会被初始化为
            如果添加的元素个数超出了 elementData的长度，会重新计算容量  newCapacity = oldCapacity + (oldCapacity >> 1)
            newCapacity是原来长度的1.5倍   elementData = Arrays.copyOf(elementData,newCapacity)

LinedList源码分析：
    1. 构造器:
        LinkedList(): 空参数构造方法
    2. 成员变量:
        size:表示元素的个数
        Node first: 表示第一个元素,默认值是null
        Node last: 表示最后一个元素,默认值是null
    3. 方法:
        add(E e):
*/
public class ListSource {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("hello0");
        list.add("hello1");
        list.add("hello2");
        list.add("hello3");

        list.add("hello4");
        list.add("hello5");
        list.add("hello6");
        list.add("hello7");
        list.add("hello8");
        list.add("hello9");
        list.add("hello10");
        list.add(3, "good");

        // list.remove("hello9");
        list.remove(9);

        System.out.println(list.get(4));

        /*Collection<String> collection = new HashSet<>();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.add("4");
        collection.add("5");
        collection.add("6");
        collection.add("7");
        collection.add("8");
        collection.add("9");
        collection.add("10");
        collection.add("11");
        list.addAll(collection);  // minCapacity --> 11 default-->10  elementData.length --> 11*/
    }

}

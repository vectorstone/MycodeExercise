package com.atguigu.iterator;

import java.util.*;

/*
Collection里有一个 iterator()方法返回一个迭代器对象
迭代器对象可以对 Collection集合里的元素进行遍历
*/
public class IteratorDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("good");
        list.add("ok");
        list.add("yes");

        // 方式一: 使用for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("--------------------------");
        // 方式二:使用迭代器遍历
        Iterator<String> itr = list.iterator();  // 获取到迭代器对象
        while (itr.hasNext()) {
            String x = itr.next();
            System.out.println(x);
        }
        // 方式三: 增强for循环，本质就是迭代器语法简写
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("-------------------------");

        // 增强for循环可以用来遍历所有的Collection对象
        Set<String> names = new HashSet<>();
        names.add("jack");
        names.add("tony");
        names.add("jerry");
        names.add("henry");
        names.add("tom");

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("---------------------------");

        // 数组也可以使用增强for循环，但是它和Collection的增强for循环不一样
        // Collection里的增强for循环是迭代器语法; 数组里的增强for循环本质是 fori 循环
        int[] nums = {8, 3, 1, 7, 5, 6, 4, 2};
        for (int x : nums) {
            System.out.println(x);
        }

    }
}

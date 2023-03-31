package com.atguigu.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
Set接口继承自Collection,没有新增方法
Set接口的实现类:  HashSet / TreeSet / LinkedHashSet

特点:
    1. 存储的元素无序，不能通过下标操作元素
    2. 存储的元素不允许重复
*/
public class SetDemo {
    public static void main(String[] args) {
        Set<String> words = new HashSet<>();

        words.add("hello");
        words.add("good");
        words.add("ok");
        words.add("yes");
        words.add("ok");
        words.add(new String("ok"));

        /*Iterator<String> itr = words.iterator();
        System.out.println(itr);
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }*/
        System.out.println(words);

        Set<Integer> nums = new TreeSet<>();
        nums.add(3);
        nums.add(5);
        nums.add(1);
        nums.add(8);
        nums.add(5);
        nums.add(Integer.valueOf(5));
        System.out.println(nums);
    }
}

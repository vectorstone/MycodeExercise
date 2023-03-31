package com.atguigu.set;

import com.atguigu.bean.Phone;

import java.util.Set;
import java.util.TreeSet;

/*
TreeSet存储的元素必须要实现 Comparable接口

TreeSet判断元素是否重复的依据:
    调用对象的compareTo方法进行比较，如果大于0往右，小于0往左，等于0就不再写入
*/
public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> nums = new TreeSet<>();
        nums.add(6);
        nums.add(7);
        nums.add(5);
        nums.add(3);
        nums.add(8);
        nums.add(7);
        nums.add(4);

        System.out.println(nums);

        Set<String> words = new TreeSet<>();
        words.add("hello");
        words.add("good");
        words.add("ok");
        words.add("yes");
        System.out.println(words);

        Set<Phone> phones = new TreeSet<>();
        phones.add(new Phone("苹果", 9888, 1.3));
        phones.add(new Phone("华为", 8888, 1.5));
        phones.add(new Phone("8848", 19888, 2.3));
        System.out.println(phones);
    }
}

package com.atguigu.collections;

import com.atguigu.bean.Person;
import com.atguigu.bean.Phone;

import java.util.*;

/*
Collection是接口，有两个子接口  List和Set
Collections是工具类，用来快速操作 Collection类型对象

Collections里的常见方法:
addAll(Collection c,T...elements): 将多个数据添加到集合里。
    返回布尔类型的值，表示是否添加成功。只要有一个元素被添加进去了都视为添加成功
sort(List list):排序
shuffle(List list): 重新随机排序

public static <T extends Comparable<? super T>> void sort(List<T> list){}
*/
public class CollectionsDemo {
    public static void main(String[] args) {
        Integer[] nums = {4, 7, 8, 2, 1, 3, 5};
        // List<Integer> integers = Arrays.asList(nums);

        List<Integer> x = new ArrayList<>();
        Collections.addAll(x, nums);
        Collections.shuffle(x);
        System.out.println(x);


        Set<String> y = new HashSet<>();
        boolean b = Collections.addAll(y, "hello", "good", "yes", "hello");
        System.out.println(b);
        System.out.println(y);


        /*List<Person> people = new ArrayList<>();
        Collections.sort(people);*/
        List<Phone> phones = new ArrayList<>();
        Collections.sort(phones);

    }
}

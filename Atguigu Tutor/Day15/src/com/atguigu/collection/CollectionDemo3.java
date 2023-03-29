package com.atguigu.collection;

import com.atguigu.bean.Dog;

import java.util.*;

/*
Collection接口没有通过下标操作元素的方法!
    List接口存储的元素有序，可以通过下标操作元素
        List在Collection接口的继承上新增了通过下标操作元素的方法!
            get(int index) / set(int index,E e) / add(int index,E e)
            indexOf(Object obj) / lastIndexOf(Object obj)

    Set接口存储的元素无序，不能通过下标操作元素
        Set接口没有在Collection接口的基础上新增方法
*/
public class CollectionDemo3 {
    public static void main(String[] args) {
        /* int[] nums = new int[10];
        String[] names = new String[10];
        Person[] people = new Person[10];*/

        // <> 泛型: 用来规定存储的元素类型
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("good");
        /*list.add(3);
        list.add(new Dog());*/

        // remove(Object obj) 返回的结果是布尔类型的值，表示是否移除成功
        boolean x = list.remove(new Dog());
        System.out.println(x);

        // remove(int index) 返回的结果是 泛型，表示的是移除的结果
        String y = list.remove(0);
        System.out.println(y);  // hello
        System.out.println(list);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(6);
        numbers.add(1);
        numbers.add(0);

        // 如果存储的数据是整数，调用remove()方法执行的是 remove(int index)
        numbers.remove(0);
        System.out.println(numbers);

        numbers.remove(Integer.valueOf(0));
        System.out.println(numbers);

        test(1);  // test(int x)
        test(Integer.valueOf(1)); // test(Object x)
    }

    public static void test(int x) {

    }
    public static void test(Object x) {

    }

}
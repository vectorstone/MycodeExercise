package com.atguigu.generic;

import com.atguigu.bean.Person;

import java.util.*;

/*
Arrays工具类的两个sort方法:
    sort(Object[] objects): 对数组元素的类型没有任何的要求
        如果数组里的元素没有实现Comparable接口，在代码编译时不会报错，但是运行时报错
    <T> void sort(T[] a, Comparator<? super T> c)

Collections工具类的sort方法:
<T extends Comparable<? super T> > void sort(List<T> list):    T = Person类型
    将运行时的异常提前到编译时
*/
public class GenericDemo4 {
    public static void main(String[] args) {
        Person p1 = new Person("jack", 18, "上海", 89);
        Person p2 = new Person("jerry", 19, "北京", 80);
        Person[] people = {p1, p2};

        // Arrays.sort(people);
        /*Arrays.sort(people, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return 0;
            }
        });*/


        // List<Person> list = new ArrayList<>();
        // Collections.addAll(list, people);
        // list.addAll(Arrays.asList(people));

        List<Person> list = new ArrayList<>(Arrays.asList(people));
        // Collections.sort(list);

    }
}

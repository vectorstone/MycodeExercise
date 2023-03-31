package com.atguigu.generic;

import com.atguigu.bean.Animal;
import com.atguigu.bean.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
泛型的使用:
1. 使用 <> 表示泛型
2. 泛型里不允许多态的写法
    List<Animal> animals = new ArrayList<Person>();   报错!
3. 多态可以把它当做类型参数来使用
4. 泛型可以定义在类和方法上
*/
public class GenericDemo1 {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal());
        animals.add(new Person());

        Person[] people = {
                new Person("jack", 18, "上海", 95),
                new Person("tom", 17, "北京", 88),
                new Person("jerry", 19, "南京", 93),
                new Person("tony", 16, "驻马店", 97)
        };
    }
}

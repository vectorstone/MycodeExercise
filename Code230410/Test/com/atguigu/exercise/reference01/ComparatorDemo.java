package com.atguigu.exercise.reference01;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/10/2023 8:55 PM
 */
public class ComparatorDemo {
    @Test
    public void comparatorExercise() {
        List<Person> list = new ArrayList<>();
        list.add(new Person("张三1", 25, "南京1", "男"));
        list.add(new Person("张三2", 29, "南京2", "男"));
        list.add(new Person("张三3", 26, "南京3", "男"));
        list.add(new Person("张三4", 20, "南京4", "男"));

        // 第一种方式,通过匿名内部类的方式给sort一个比较器来完成排序功能
        list.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        for (Person person : list) {
            System.out.println(person);
        }

        // 第二种方式,通过comparator里面的一个方法提供一个比较器给sort方法,也能完成排序
        Comparator<Person> personComparator = Comparator.comparingInt(new ToIntFunction<Person>() {
            @Override
            public int applyAsInt(Person value) {
                return value.getAge();
            }
        });
        list.sort(personComparator);
        // 还可以这样写
        list.sort(Comparator.comparingInt(new ToIntFunction<Person>() {
            @Override
            public int applyAsInt(Person value) {
                return value.getAge();
            }
        }));
        // lambda简化的方法
        list.sort(Comparator.comparingInt(p -> p.getAge()));
        // 还能再进行简化,因为抽象方法用到了实例对象,并且实现抽象方法也是调用实例对象的方法,所以使用类名::实例方法名也可以
        list.sort(Comparator.comparingInt(Person::getAge));
    }
}

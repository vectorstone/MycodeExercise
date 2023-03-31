package com.atguigu.set;

import com.atguigu.bean.Person;

import java.util.HashSet;
import java.util.Set;

/*HashSet判断元素是否重复的依据:
    1. 调用对象的 hashCode()方法，比较哈希值是否相同，如果哈希值不同，直接存入。
    2. 如果哈希值相同，再调用equals方法。
        如果 哈希值相同，equals返回false,也会存入
        如果 哈希值相同，equals返回true,不再存入*/
public class HashSetDemo {
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();

        Person p1 = new Person("3Qj", 18, "上海", 1.75);
        Person p2 = new Person("jerry", 20, "北京", 1.7);
        Person p3 = new Person("henry", 21, "南京", 1.73);
        Person p4 = new Person("2qK", 18, "上海", 1.75);
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        System.out.println(people);

        System.out.println("通话".hashCode());
        System.out.println("重地".hashCode());

        System.out.println("3Qj".hashCode());
        System.out.println("2qK".hashCode());
        System.out.println("3Aɚ".hashCode());
        System.out.println("3BȻ".hashCode());
    }
}

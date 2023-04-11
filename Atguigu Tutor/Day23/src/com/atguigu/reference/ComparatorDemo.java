package com.atguigu.reference;

import com.atguigu.bean.Person;

import java.util.*;
import java.util.function.ToIntFunction;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("jack", 18));
        people.add(new Person("jerry", 20));
        people.add(new Person("henry", 17));
        people.add(new Person("tony", 21));
        people.add(new Person("tom", 19));

        /*people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });*/

        // people.sort((o1, o2) -> o1.getAge() - o2.getAge());

       /*Comparator<Person> c = Comparator.comparingInt(new ToIntFunction<Person>() {
            @Override
            public int applyAsInt(Person p) {
                return p.getAge();
            }
        });
        people.sort(c);*/

        // people.sort(Comparator.comparingInt(p-> p.getAge()));

        people.sort(Comparator.comparingInt(Person::getAge));
    }
}

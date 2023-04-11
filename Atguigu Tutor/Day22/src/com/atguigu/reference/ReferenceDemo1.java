package com.atguigu.reference;

import com.atguigu.bean.Person;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

/*
Runnable接口  Comparator接口

lambda表达式的简化:
    1. 形参的类型可以不写，要么都不省略，要么都省略
    2. 如果抽象方法只有一个参数，小括号可以省略。如果方法没有形参，()不能省略
    3. 如果方法体里只有一行代码, 方法体里的{}可以省略
        {}省略以后，方法体里的代码最后的 ; 不能写
        如果方法有返回值,return 关键字也不能写

 */
public class ReferenceDemo1 {
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("唱跳");
            }
        }).start();

        Person p1 = new Person("jack", 18, "上海", "男");
        Person p2 = new Person("tony", 20, "北京", "男");
        Person p3 = new Person("jerry", 17, "南京", "男");
        Person p4 = new Person("helen", 19, "杭州", "女");

        Person[] people = {p1, p2, p3, p4};

        /*Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });*/

        Arrays.sort(people, (o1, o2) -> o1.getAge() - o2.getAge());

        System.out.println(Arrays.toString(people));


    }

    public void demo(String s, Consumer<String> consumer) {
        consumer.accept(s);
    }

    @Test
    public void testDemo() {
        demo("hello", s -> System.out.println(s.length()));
    }
}

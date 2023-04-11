package com.atguigu.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/*
JDK提供了4类44个函数式接口
Consumer: 有参数没有返回值,抽象方法是 accept(T t)
Supplier: 有返回值，没有参数
Predicate: 有参数，返回布尔类型的值,抽象方法是 test(T t)
Function/Operator: 有参数并且有返回值
*/
public class FunctionalInterfaceDemo {


    private <T> void myForEach(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }

    @Test
    public void testConsumer() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("good");
        list.add("ok");

        /*myForEach(list, new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        /*myForEach(list, (String s) -> {
            System.out.println(s);
        });*/
        list.forEach((String s) -> {
            System.out.println(s);
        });
    }


    private void myRemoveIf(List<String> strings, Predicate<String> predicate) {
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            // if(s.length() > 5) {
            if (predicate.test(s)) {
                iterator.remove();
            }
        }
    }

    @Test
    public void testPredicate() {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("grape");
        fruits.add("pear");
        fruits.add("watermelon");
        fruits.add("peach");
        fruits.add("strawberry");

        /*myRemoveIf(fruits, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("p");
            }
        });*/

        fruits.removeIf((String s) -> {
            return s.contains("p");
        });

        System.out.println(fruits);
    }
}

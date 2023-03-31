package com.atguigu.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("jack");
        words.add("hello");
        words.add("ok");
        words.add("world");
        words.add("hehe");
        words.add("banana");
        words.add("yes");
        words.add("hi");

        /*words.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() >= 5;
            }
        });*/

        // words.removeIf(s->s.startsWith("h"));

        myRemoveIf(words, new Demo() {
            @Override
            public boolean test(String s) {
                return s.length() >= 5;
            }
        });
        // myRemoveIf(words, s -> s.startsWith("h"));
        System.out.println(words);
    }

    public static void myRemoveIf(List<String> list, Demo d) {
        Iterator<String> each = list.iterator();
        while (each.hasNext()) {
            // if (word.length() >= 5) itr.remove();
            if (d.test(each.next())) each.remove();
        }
    }
    /*public static void removeIf1(List<String> list) {
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            String word = itr.next();
            if (word.length() >= 5) itr.remove();
        }
    }

    public static void removeIf2(List<String> list) {
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            String word = itr.next();
            if (word.startsWith("h")) itr.remove();

        }
    }

    public static void removeIf3(List<String> list) {
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            String word = itr.next();
            if (word.indexOf('e') != -1) itr.remove();
        }
    }*/
}

interface Demo {
    boolean test(String s);
}

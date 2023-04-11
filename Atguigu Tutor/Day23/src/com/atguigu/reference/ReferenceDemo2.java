package com.atguigu.reference;

import com.atguigu.bean.Person;
import org.junit.Test;

import java.util.Arrays;

public class ReferenceDemo2 {

    public void constructorRef(String a, int b, X x) {
        Person p = x.xFunction(a, b);
        p.eat();
    }

    public void arrayRef(int m, Y y) {
        y.yFunction(m);
    }

    public String[] arrayRef(int m, String s, Y y) {
        String[] strings = y.yFunction(m);
        for (int i = 0; i < strings.length; i++) {
            strings[i] = s;
        }
        return strings;
    }

    @Test
    public void testConstructorRef() {
        // 构造器引用   类名::new
        constructorRef("张三", 18, new X() {
            @Override
            public Person xFunction(String m, int n) {
                return new Person(m, n);
            }
        });

        // constructorRef("张三", 18, (m, n) -> new Person(m, n));
        constructorRef("张三", 18, Person::new);
    }

    @Test
    public void testArrayRef() {
        /*arrayRef(5, new Y() {
            @Override
            public void yFunction(int a) {
                String[] strings = new String[a];
            }
        });*/
        // arrayRef(5, a -> new String[a]);
        arrayRef(5, String[]::new);

        String[] arr = arrayRef(6, "ok", String[]::new);
        for (String s : arr) {
            System.out.println(s);
        }
    }

}

interface X {
    Person xFunction(String m, int n);
}

interface Y {
    String[] yFunction(int a);
}

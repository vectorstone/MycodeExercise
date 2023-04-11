package com.atguigu.reference;

import com.atguigu.bean.Person;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MethodRefTest {
    List<String> list = new ArrayList<>();

    @Before
    public void before() {
        list.add("hello");
        list.add("good");
        list.add("yes");
    }

    @Test
    public void testRef1() {
        /*list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        // list.forEach(s -> System.out.println(s));

        // 实例对象名:: 实例方法名
        list.forEach(System.out::println);
    }


    @Test
    public void testRef2() throws FileNotFoundException {
        File f = new File("5.txt");
        System.out.println(f.exists());
    }
}

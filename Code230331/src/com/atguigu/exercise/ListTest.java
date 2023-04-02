package com.atguigu.exercise;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/2/2023 1:55 PM
 */
public class ListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello1");
        list.add("hello2");
        list.add("hello3");
        list.remove(2);

        LinkedList<String> list1 = new LinkedList<>();
        list1.add("hello1");
        list1.add("hello2");
        list1.add(1,"good");
        list1.remove(1);
    }
}

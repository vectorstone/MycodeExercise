package com.atguigu.exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/31/2023 8:54 PM
 */
public class Test {
    public static void main(String[] args) {

        List<String> s = new ArrayList<>();
        s.add("h");
        s.add("m");
        s.add("b");
        s.add("b");
        int i = s.indexOf("h");
        int i1 = s.lastIndexOf("h");
        System.out.println(i+","+i1);
    }
}

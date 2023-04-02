package com.atguigu.test;

import java.util.HashMap;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/1/2023 10:20 AM
 */
public class Test01 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        String x1 = map.put("黑旋风", "李逵");
        System.out.println("x1"+x1);
        String x2 =map.put("E", "hello");
        System.out.println("x2"+x2);
        String x3= map.put("E","new");
        System.out.println("x3"+x3);
        String x4 = map.put("3Qj", "value1");
        System.out.println("x4"+x4);
        map.put("2pj", "value2");
        map.put("2qK", "value3");
        map.put("2r,", "value4");
        map.put("3RK", "value4");
        System.out.println(map.put("3RK", "value4"));

        String value5 = map.put("3RK", "value5");
        System.out.println(value5);
        System.out.println(map);


        System.out.println("黑旋风".hashCode());
        System.out.println("E".hashCode());
        System.out.println("3Qj".hashCode());

    }
}

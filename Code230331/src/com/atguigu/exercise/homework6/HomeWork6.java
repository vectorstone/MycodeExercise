package com.atguigu.exercise.homework6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/2/2023 9:48 AM
 */
public class HomeWork6 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1930, "乌拉圭");
        map.put(1934, "意大利");
        map.put(1938, "意大利");
        map.put(1950, "乌拉圭");
        map.put(1954, "西德");
        map.put(1958, "巴西");
        map.put(1962, "巴西");
        map.put(1966, "英格兰");
        map.put(1970, "巴西");
        map.put(1974, "西德");
        map.put(1978, "阿根廷");
        map.put(1982, "意大利");
        map.put(1986, "阿根廷");
        map.put(1990, "西德");
        map.put(1994, "巴西");
        map.put(1998, "法国");
        map.put(2002, "巴西");
        map.put(2006, "意大利");
        map.put(2010, "西班牙");
        map.put(2014, "巴西");
        map.put(2018, "法国");
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个年份:");
        int year = input.nextInt();
        if (map.get(year) != null) {
            System.out.println(year + "年,获得世界冠军的是:" + map.get(year));
        } else {
            System.out.println(year + "年没有举办世界杯");
        }

        System.out.print("请输入一个国家名称:");
        String country = input.next();
        if (map.containsValue(country)) {
            System.out.println("该国球队在如下年份获得过冠军:");
            for (Integer s : map.keySet()) {
                if (map.get(s).equals(country)) {
                    System.out.println(s);
                }
            }
        } else {
            System.out.println(country + "没有获得过世界杯");
        }
        input.close();
    }
}

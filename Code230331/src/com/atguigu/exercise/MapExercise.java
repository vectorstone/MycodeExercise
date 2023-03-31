package com.atguigu.exercise;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/31/2023 4:53 PM
 */
public class MapExercise {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("钢铁侠", "托尼史塔克");
        map.put("蜘蛛侠", "彼得帕克");
        map.put("齐天大圣", "孙悟空");
        map.put("弼马温", "孙悟空");
        map.put("及时雨", "宋江");
        System.out.println(map);
        System.out.println("--------------------");
        boolean remove = map.remove("及时雨", "宋");
        System.out.println(map);
        System.out.println(remove);
        // System.out.println(ss);


    }

}

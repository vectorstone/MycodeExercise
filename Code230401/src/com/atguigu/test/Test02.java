package com.atguigu.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/1/2023 8:51 PM
 */
public class Test02 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        String x = map.put("111","123");
        System.out.println(x);
    }


}

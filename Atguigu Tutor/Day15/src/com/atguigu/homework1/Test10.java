package com.atguigu.homework1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test10 {
    public static void main(String[] args) {
        String str = "23.23456789";

        HandleAble handleAble = new HandleAble() {

            @Override
            public String handleString(String num, int scale) {
                if (scale == 0) {
                    return num.substring(0, num.indexOf("."));
                }
                BigDecimal db = new BigDecimal(num);
                BigDecimal one = new BigDecimal("1");
                return db.divide(one, scale, RoundingMode.HALF_UP).toString();
            }
        };

        System.out.println(handleAble.handleString(str, 0));
        System.out.println(handleAble.handleString(str, 3));
    }
}

interface HandleAble {
    String handleString(String num, int scale);
}

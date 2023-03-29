package com.atguigu.date;

import java.util.Calendar;

/*
通过Calendar对象获取到年月日时分秒信息:
get(int field): get方法传入指定的字段获取到指定的信息.

Calendar的弊端:
    1. 没有 getYear() / getMonth() ... 这些方法，获取年月日信息都是通过
        get(int field) 传入不同的数字获取
    2. 获取月份得到的结果是一个 int类型的值     0表示1月,1表示2月...11表示12月
       获取到星期得到的结果也是一个int类型的值   1表示星期天, 2表示星期一,3表示星期二
 */
public class CalendarDemo2 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        System.out.println(c.get(Calendar.ERA)); // 1
        System.out.println(c.get(Calendar.YEAR));  // 2023
        System.out.println(c.get(Calendar.MONTH));  // 2
        System.out.println(c.get(Calendar.DAY_OF_MONTH));  // 28
        System.out.println(c.get(Calendar.DATE));  // 28
        System.out.println(c.get(Calendar.DAY_OF_WEEK));  // 3

        System.out.println(c.get(Calendar.HOUR));  // 3
        System.out.println(c.get(Calendar.HOUR_OF_DAY));  // 15
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.MILLISECOND));

        System.out.println(c.get(Calendar.WEEK_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        System.out.println("---------------------------");
        for (int i = 0; i < Calendar.FIELD_COUNT; i++) {
            System.out.println(c.get(i));
        }

    }
}

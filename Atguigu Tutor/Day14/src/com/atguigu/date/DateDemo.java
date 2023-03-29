package com.atguigu.date;

import java.util.Date;

/*
Java里的日期时间分为三个版本:
1. JDK1.0 出现的 Date类型
2. JDK1.1 新增了 Calendar类型
3. JDK1.8 新增了 LocalDate/LocalTime/LocalDateTime
*/
public class DateDemo {
    public static void main(String[] args) {
        Date d1 = new Date();  // 创建一个Date类型的对象，表示当前的日期时间
        System.out.println(d1);

        System.out.println(d1.getYear());  // 123  准确的年份 - 1900

        System.out.println(d1.getTime());  // 获取d1的时间戳

        // 时间戳: 从 1970-01-01 00:00:00 UTC 到现在时间毫秒数
        Date d2 = new Date(1000 * 60 * 60 * 24 * 365L);  // 创建Date对象指定时间戳
        System.out.println(d2);


    }
}

package com.atguigu.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;

/*
JDK8.0新增了 LocalDate表示日期  LocalTime表示时间 LocalDateTime表示日期时间

获取到日期时间对象的静态方法:
    now():获取到当前日期 时间
    of(): 传入指定的日期时间
    parse(): 将一个字符串解析成为日期时间类型
 */
public class LocalDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.of(20, 29, 56);
        System.out.println(time);

        // LocalDateTime ldt1 = LocalDateTime.of(2022, 3, 12, 13, 25, 46);
        // LocalDateTime ldt1 = LocalDateTime.of(2022, Month.MARCH, 12, 13, 25, 46);
        LocalDateTime ldt = LocalDateTime.of(date, time);
        System.out.println(ldt);

        // 获取到日期时间对象以后，可以通过日期时间对象获取到年月日时分秒信息
        System.out.println(ldt.getYear());
        System.out.println(ldt.getMonth());
        System.out.println(ldt.getDayOfMonth());
        System.out.println(ldt.getDayOfWeek());
        System.out.println(ldt.getDayOfYear());
        System.out.println(ldt.getHour());
        System.out.println(ldt.getMinute());
        System.out.println(ldt.getSecond());
    }
}

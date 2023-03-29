package com.atguigu.date;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

/*
Period 表示两个日期之间的间隔
Duration 表示两个时间之间的间隔
 */
public class PeriodDurationDemo {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2000, 1, 1);

        Period between = Period.between(date2, date1);
        System.out.println(between.getYears());
        System.out.println(between.getMonths());
        System.out.println(between.getDays());
        System.out.println(between.toTotalMonths());

        LocalTime time1 = LocalTime.now();
        LocalTime time2 = LocalTime.of(9, 40, 36);
        Duration x = Duration.between(time2, time1);
        System.out.println(x.getSeconds());
        System.out.println(x.toHours());
    }
}

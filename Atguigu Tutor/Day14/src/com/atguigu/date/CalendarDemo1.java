package com.atguigu.date;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/*
Calendar是JDK1.1出现的表示日期时间类的API,用来替换Date类型
 */
public class CalendarDemo1 {
    public static void main(String[] args) {
        // Calendar是一个抽象类，可以创建一个子类对象
        Calendar c1 = new GregorianCalendar();
        System.out.println(c1);

        // 还可以通过调用 Calendar里的静态方法返回一个实例对象
        Calendar c2 = Calendar.getInstance();
        System.out.println(c2);

        Calendar c3 = Calendar.getInstance(TimeZone.getTimeZone("America/Aruba"));
        System.out.println(c3);

        Calendar c4 = Calendar.getInstance(Locale.GERMANY);
        System.out.println(c4);
    }
}

package com.atguigu.format;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

/*
日期时间 和 字符串之间的相互转换:
    日期时间 --> 字符串:  格式化
    字符串 --> 日期时间:  解析

SimpleDateFormat类:   new SimpleDateFormat("yyyy年MM月dd日 HH点mm分ss秒");
    Date类型 --> String字符串: 调用 SimpleDateFormat 的 format 方法
    String字符串 --> Date类型: 调用 SimpleDateFormat 的 parse  方法

DateTimeFormatter 类: 不能直接使用new创建实例对象，需要调用 ofPattern静态方法返回一个实例对象
    LocalDateTime类型 --> String字符串: 调用 DateTimeFormatter的format方法

    String字符串 --> LocalDateTime类型:
        方式1:
            1. 调用 DateTimeFormatter 的 parse()方法，得到一个 TemporalAccessor对象
            2. 调用 LocalDateTime.from()将 TemporalAccessor对象 得到一个 LocalDateTime类型的对象
        方式2: 直接调用 静态方法parse(),传入字符串和格式化器
*/
public class FormatDemo {
    public static void main(String[] args) throws ParseException {
        // 创建了一个 SimpleDateFormat类型的对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH点mm分ss秒");

        Date date1 = new Date();

        // String s = date1.toString();
        String s = sdf.format(date1);

        System.out.println(s);

        String dateStr = "2012年03月17日 20点30分45秒";
        Date date2 = sdf.parse(dateStr);
        System.out.println(date2);


        LocalDateTime ldt = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH点mm分ss秒");
        String x = formatter.format(ldt);
        System.out.println(x);


        /*
        Person p = new Student();
        (Teacher)p
         */
        TemporalAccessor parse = formatter.parse(dateStr);
        LocalDateTime from = LocalDateTime.from(parse);
        System.out.println(from);


        LocalDateTime ldt1 = LocalDateTime.parse(dateStr, formatter);
    }
}

package com.atguigu.homework4;

/**
 * @Description: 年月日类练习
 * @Author: Gavin
 * @Date: 3/18/2023 9:22 PM
 * 赋值为当天日期,调用方法测试
 */
public class HomeWork4 {
    public static void main(String[] args) {
        //创建日期对象
        MyDate date = new MyDate(2023,3,18);

        boolean status = true;
        if(date.yearIsIllegal()){

            if(date.monthIsIllegal()){

                if(date.dayIsIllegal()){

                    //判断是否是闰年(一定要先判断是否是闰年,不然数组里面的2月份值不太确定)
                    System.out.println(date.getYear()+"是闰年吗?"+date.isLeapYear());
                    //根据月份值,返回对应的英语单词
                    System.out.println(date.getMonth()+"月对应的英语单词是:"+date.monthName());
                    //返回这个月的总天数
                    System.out.println(date.getMonth()+"月总共有"+date.totalDayOfMonth()+"天");
                    //返回这一年的总天数
                    System.out.println(date.getYear()+"年总共有"+date.totalDaysOfYear()+"天");
                    //返回这一天是当年的第几天
                    System.out.println(date.getYear()+"年"+date.getMonth()+"月"+date.getDay()+"日,是今年的第"+date.daysOfTheYear()+"天");

                }else System.out.println("日期输入有误,请重新输入");

            }else System.out.println("月份输入有误,请重新输入");

        }else System.out.println("年份输入有误,请重新输入");



    }
}

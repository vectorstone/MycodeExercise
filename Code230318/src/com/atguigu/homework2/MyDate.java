package com.atguigu.homework2;

/**
 * @Description: 年月日
 * @Author: Gavin
 * @Date: 3/18/2023 7:47 PM
 * （1）声明一个日期类MyDate，包含属性：年、月、日
 */
public class MyDate {
    //声明年月日
    private int year;
    private int month;
    private int day;

    //无参构造方法
    public MyDate(){ }

    //带参构造方法
    public MyDate(int year,int month,int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }

    public void setMonth(int month){
        this.month = month;
    }
    public int getMonth(){
        return month;
    }

    public void setDay(int day){
        this.day = day;
    }
    public int getDay(){
        return day;
    }
}

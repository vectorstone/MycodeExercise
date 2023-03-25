package com.atguigu.homework4;

/**
 * @Description: 年月日
 * @Author: Gavin
 * @Date: 3/18/2023 7:47 PM
 * （1）声明一个日期类MyDate，包含属性：年、月、日
 * - 包含属性：年、月、日
 */
public class MyDate {
    //声明年月日
    private int year;
    private int month;
    private int day;
    int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};

    //无参构造方法
    public MyDate(){ }

    //带参构造方法
    public MyDate(int year, int month, int day){
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

    //判断年份是否合规
    public boolean yearIsIllegal(){
        return (year > 0 );
    }
    //判断月份是否合规
    public boolean monthIsIllegal(){
        return (month > 0 && month <= 12);
    }

    //判断输入的天数是否合规
    public boolean dayIsIllegal(){

        if(isLeapYear()) monthDays[1] = 29;
        return (day >= 1 && day <= monthDays[month-1]);
    }
    //boolean isLeapYear()：判断是否是闰年
    public boolean isLeapYear(){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    //String monthName()：根据月份值，返回对应的英语单词
    public String monthName(){
        String[] monthNames = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        return monthNames[month - 1];
        }



    //int totalDaysOfMonth()：返回这个月的总天数
    public int totalDayOfMonth() {
    return monthDays[month - 1];
    }

    //int totalDaysOfYear()：返回这一年的总天数
    public int totalDaysOfYear(){
        int yearSum = 0;
        for (int i = 0; i < monthDays.length; i++) {
            yearSum += monthDays[i];
        }
        return yearSum;
    }

    //int daysOfTheYear()：返回这一天是当年的第几数
    public int daysOfTheYear(){
        int sum = 0;
        for (int i = 0; i < month-1; i++) {
            sum += monthDays[i];
        }
        return sum + day;
    }
}

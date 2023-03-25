package com.atguigu.homework6;

/**
 * @Description: 公民信息
 * @Author: Gavin
 * @Date: 3/18/2023 10:13 PM
 * 案例需求：
 * （1）声明一个日期类MyDate，
 * - 包含属性：年、月、日，
 * - 包含String dateToString()方法，返回“xxxx年xx月xx日”
 * （2）声明公民类Citizen，
 * - 包含属性：姓名，生日，身份证号，其中姓名是String类型，生日是MyDate类型，身份证号也是String类型。
 * - 包含String getInfo()方法，返回“姓名：xx，身份证号码：xx，生日：xxxx年xx月xx日”
 * - 包含void setBirthday(int year, int month, int day)：设置生日
 * （3）在测试类的main方法中，创建你们家庭成员的几个对象，并打印信息。
 */
public class MyDate {
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
    //get,set方法
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
    public String dateTostring(){
        return year+"年"+month+"月"+day+"日";
    }
}

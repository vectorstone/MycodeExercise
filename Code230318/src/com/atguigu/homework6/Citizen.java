package com.atguigu.homework6;

/**
 * @Description: 公民类
 * @Author: Gavin
 * @Date: 3/18/2023 10:20 PM
 * （2）声明公民类Citizen，
 *  * - 包含属性：姓名，生日，身份证号，其中姓名是String类型，生日是MyDate类型，身份证号也是String类型。
 *  * - 包含String getInfo()方法，返回“姓名：xx，身份证号码：xx，生日：xxxx年xx月xx日”
 *  * - 包含void setBirthday(int year, int month, int day)：设置生日
 */
public class Citizen {
    private String name;
    private String number;
    MyDate date = new MyDate();

    //构造方法
    public Citizen(){

    }
    public Citizen(String name,String number){
        this.name = name;
        this.number = number;
    }
    //get,set方法
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setNumber(String number){
        this.number = number;
    }
    public String getNumber(){
        return number;
    }
    //包含String getInfo()方法，返回“姓名：xx，身份证号码：xx，生日：xxxx年xx月xx日”
    public String getInfo(){
        return "姓名:" + getName()+", 省份证号码:" + getNumber() + ",生日:" + date.dateTostring();
    }
    //包含void setBirthday(int year, int month, int day)：设置生日
    public void setBirthday(int year,int month,int day){
        date.setDay(day);
        date.setYear(year);
        date.setMonth(month);
    }
}

package com.atguigu.homework2;

/**
 * @Description: 年月日
 * @Author: Gavin
 * @Date: 3/18/2023 7:52 PM
 */
public class HomeWork2 {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(1995,12,8);
        MyDate date2 = new MyDate(2023,3,9);
        MyDate date3 = new MyDate(2023,9,9);

        System.out.println("我的出生日期是:"+date1.getYear()+"年"+date1.getMonth()+"月"+date1.getDay()+"日");
        System.out.println("我来尚硅谷的日期是:"+date2.getYear()+"年"+date2.getMonth()+"月"+date2.getDay()+"日");
        System.out.println("我的毕业日期是:"+date3.getYear()+"年"+date3.getMonth()+"月"+date3.getDay()+"日");
    }
}

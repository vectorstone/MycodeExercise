package com.atguigu.homework;

public class Test {
    public static void main(String[] args) {
        Citizen c = new Citizen();
        c.setName("jack");
        c.setCardID("12342345");

       /* MyDate x = new MyDate();
        x.setYear(1990);
        x.setMonth(3);
        x.setDay(5);
        c.setBirthday(x);*/

        c.setBirthday(1990, 3, 5);
        String info = c.getInfo();
        System.out.println(info);
    }
}

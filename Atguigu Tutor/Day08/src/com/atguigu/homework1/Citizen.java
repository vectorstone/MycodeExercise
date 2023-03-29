package com.atguigu.homework1;

public class Citizen {
    private String name;
    private MyDate birthday;
    private String cardID;

    public String getInfo() {
        return "姓名:" + this.name + ",身份证号码:" + this.cardID + ",生日:" + this.birthday.dateToString();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public void setBirthday(int year, int month, int day) {
        birthday = new MyDate();
        birthday.setYear(year);
        birthday.setMonth(month);
        birthday.setDay(day);
    }

}

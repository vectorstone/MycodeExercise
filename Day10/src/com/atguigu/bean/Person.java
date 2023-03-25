package com.atguigu.bean;

public class Person extends Animal {
    private String city;

    public Person() {
    }

    public Person(String name, int age, String city) {
        super(name, age);
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}

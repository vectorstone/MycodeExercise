package com.atguigu.bean;

import java.io.Serializable;

public class Person implements Serializable,AutoCloseable {
    private String name;
    transient private int age;
    private String city;
    private double height;

    public Person() {
    }

    public Person(String name, int age, String city, double height) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", height=" + height +
                '}';
    }

    @Override
    public void close() throws Exception {
        System.out.println("Person的close方法被调用了");
    }
}

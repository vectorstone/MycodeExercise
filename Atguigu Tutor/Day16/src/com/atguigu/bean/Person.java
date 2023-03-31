package com.atguigu.bean;

import java.util.Objects;

public class Person extends Animal{
    private String name;
    private int age;
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
    public int hashCode() {
        System.out.println("hashCode方法被调用了");
        return Objects.hash(name, age, city, height);
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals方法被调用了");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Double.compare(person.height, height) == 0 && name.equals(person.name) && Objects.equals(city, person.city);
    }
}

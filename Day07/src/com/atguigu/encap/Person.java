package com.atguigu.encap;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person() {
    }

    public Person(String name, int age, String gender) {
        /*this.name = name;
        this.age = age;*/
        this(name, age);
        this.gender = gender;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        int age = 5;
        System.out.println(name + "正在吃东西");
        System.out.println(age);  // 5
        System.out.println(this.age);  // 0
    }

    public void sleep() {
        System.out.println(name + "正在睡觉");
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

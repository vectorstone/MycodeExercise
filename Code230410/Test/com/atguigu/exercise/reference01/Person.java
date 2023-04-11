package com.atguigu.exercise.reference01;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/10/2023 8:12 PM
 * 这是一个用来测试lambda表达式方法引用几种简化模式的一个对象测试类
 */
public class Person {
    private String name;
    private int age;
    private String city;
    private String gender;

    public Person() {
    }

    public Person(String name, int age, String city, String gender) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public void eat() {
        System.out.println(name + "正在吃东西");
    }

    public void sleep(String place) {
        System.out.println(name + "正在" + place + "睡觉");
    }
}

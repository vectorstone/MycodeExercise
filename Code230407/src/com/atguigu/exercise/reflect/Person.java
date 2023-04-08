package com.atguigu.exercise.reflect;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/7/2023 9:19 PM
 */
public class Person {
    public static String x = "good";
    private static int y = 5;
    private String name;
    int age;
    protected String city;
    public String gender = "男";

    public Person() {
        System.out.println("空参数构造方法");
    }

    public Person(String name, String city) {
        this.name = name;
        this.city = city;
    }
    private Person(String name) {
        this.name = name;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("人正在吃东西");
    }

    protected void sleep() {
        System.out.println("人正在睡觉");
    }

    void eat(String food) {
        System.out.println("人正在吃" + food);
    }

    private void test() {
        System.out.println("test方法");
    }

    public static void demo() {
        System.out.println("静态方法demo");
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
}


package com.atguigu.bean;

public class Person extends Animal {
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

    public Person(String name, int age, String city, String gender) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.gender = gender;
    }

    public static int getY() {
        return y;
    }

    public static void setY(int y) {
        Person.y = y;
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

    public static void foo(int a,int b,int c) {
        System.out.println("我是Person里的静态方法 foo a = " + a + ", b = " + b + ", c = " + c);
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

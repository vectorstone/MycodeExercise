package com.atguigu.question13;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/24/2023 9:29 PM
 */
public class Employee {
    private int num;
    private String name;
    private int age;
    private double salary;

    public Employee() {
    }

    public Employee(int num, String name, int age, double salary) {
        this.num = num;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getInfo(){
        return "编号: "+ num + ",姓名: "+name+ ",薪资: "+ salary;
    }
}

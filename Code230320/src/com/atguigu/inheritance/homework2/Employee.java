package com.atguigu.inheritance.homework2;

/**
 * @Description: 员工类(父类)
 * @Author: Gavin
 * @Date: 3/20/2023 6:39 PM
 */
public class Employee {
    private int number;
    private String name;
    private int age;
    private double salary;
    public Employee(){

    }
    public Employee(int number,String name,int age,double salary){
        this.number = number;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
    public String getInfo(){
        return "编号:"+ number + ", 姓名:" + name + ", 年龄:" + age + ", 薪资:" + salary;
    }
}

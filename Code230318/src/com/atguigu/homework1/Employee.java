package com.atguigu.homework1;

/**
 * @Description: 员工类
 * @Author: Gavin
 * @Date: 3/18/2023 7:21 PM
 */
public class Employee {
    //属性声明
    private int number;
    private String name;
    private int age;
    private double salary;
    //无参构造方法(手动生成,免得创建带参构造方法时被覆盖掉)
    public  Employee(){}

    //带参构造方法
    public Employee(int number,String name,int age,double salary){
        this.number = number;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    //number的get和set方法
    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }

    //name的get和set方法
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    //age的get和set方法
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    //salary的get和set方法
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
}

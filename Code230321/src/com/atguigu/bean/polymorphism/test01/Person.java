package com.atguigu.bean.polymorphism.test01;

/**
 * @Description: person
 * @Author: Gavin
 * @Date: 3/21/2023 6:53 PM
 */
public class Person {
    public String name;
    dog d;

    public Person(String name, dog d) {
        this.name = name;
        this.d = d;
    }
    public void workWithDog(){
        d.eat();
    }
}

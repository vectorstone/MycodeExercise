package com.atguigu.inheritance;

import com.atguigu.permission.Dog;

/*
继承描述的是类和类之间的关系
继承的基本语法: 使用 关键字extends 表示类之间的继承关系

子类继承父类以后，可以访问父类里的部分属性，调用父类里的部分方法，由父类里属性和方法的权限修饰符决定!
*/
public class InheritanceDemo1 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
        c.name = "tom";

        Dog d = new Dog();
        d.name = "jerry";
        d.eat();


        Animal a = new Animal();
        System.out.println(a.name);
        System.out.println(a.age);
        System.out.println(a.color);
        // a.weight;
    }
}

package com.atguigu.encap;

/*
面向对象三大特征:封装  继承  多态

封装可以理解为打包,实现步骤:
1. 成员变量使用 private权限修饰符，限制在本类访问，外部无法访问
2. 定义被public修饰的 get/set方法，让外部通过这些方法访问到成员变量

get方法: 有返回值，没有参数
set方法: 没有返回值，有参数
    set方法里通常会用到 this关键字，this表示的是调用这个方法的实例对象
    this大部分情况下可以省略不写，当方法里有形参或者局部变量和成员变量同名时，如果想要访问到成员变量,this不能省略!
*/
public class EncapsulationDemo {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("jack");
        p1.setAge(-10);
        p1.setGender("男");
        // p1.age = -10;

        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getGender());
    }
}

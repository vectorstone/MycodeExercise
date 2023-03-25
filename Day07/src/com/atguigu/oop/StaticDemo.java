package com.atguigu.oop;

/*
static可以用来修饰方法以及成员变量

被static修饰的变量称为静态成员变量
    非静态成员变量也被称为实例变量(实例属性)，每创建一个实例对象，都会单独保存一份

    被static修饰的成员变量被称为静态成员变量，属于类，在类里存储一份。
       实例对象不会单独保存，所有的实例独享共享同一个静态成员变量。
        可以通过实例对象访问静态属性，还可以直接使用 类名访问静态属性!!!
        更加推荐使用 类名.静态属性名 直接访问静态成员变量!

    静态成员变量可以不创建实例对象，直接通过  类名.静态变量名 访问
    非静态成员变量必须要创建实例对象以后，通过 对象名.实例属性名 访问

被static此时的方法称为静态方法
    非静态方法，必须要先创建实例对象，通过 实例对象.方法名() 来调用。
        在非静态方法里，可以访问 非静态成员变量 和 静态成员变量!

    静态方法可以通过实例对象调用，也可以不创建实例对象，直接通过 类名.方法名() 调用
        推荐使用 类名.静态方法名() 调用静态方法!
        静态方法只能访问 静态属性 调用 静态方法，不能访问 非静态属性 调用非静态方法

    静态只能调用静态，不能调用非静态;  非静态可以调用静态和非静态!

*/
public class StaticDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "jack";
        s1.score = 80;
        s1.age = 18;

        Student s2 = new Student();
        s2.name = "merry";
        s2.gender = "女";

        System.out.println(s2.score);
        System.out.println(s1.gender);  // null
        System.out.println(s1.job);
        System.out.println(s2.job);
        System.out.println(Student.job);

        s1.job = "student";
        System.out.println(s2.job);    // student
        System.out.println(Student.job); // student

        s1.eat();
        s2.study();

        s1.test();
        Student.test();
    }
}
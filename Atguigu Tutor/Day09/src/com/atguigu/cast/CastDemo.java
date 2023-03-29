package com.atguigu.cast;

import com.atguigu.bean.Animal;
import com.atguigu.bean.Student;
import com.atguigu.bean.Person;

/*
引用数据类型的类型转换:
int a = 10;
byte b = (byte)a;
long c = a;

强制类型转换: 将父类类型强制转换成为子类，如果转换的类型不匹配会出现 ClassCastException
    Person p = new Teacher();
    ((Student)p).study();
   判断实例对象a是否是A类型:  a.getClass() == A.class
   a instanceof A: 判断对象a是否是A类或者A的子类创建出来的实例对象

通常情况下，都是将父类类型强制转换成为子类类型，用来调用子类特有的方法(常用)  或者访问子类里的属性(不常用)
将子类强制提升成为父类类型，可以访问到父类里的成员变量(不常用)
*/
public class CastDemo {
    public static void main(String[] args) {
        Person p = new Student();
        if (p.getClass() == Student.class) {
            ((Student) p).study();
            System.out.println(((Student) p).x);
        } else {
            System.out.println("p不是Student类型");
        }


        Animal a = new Student();
        /*if (a.getClass() == Person.class) {
            ((Person) a).useTools();
        } else {
            System.out.println("a不是Person类型");
        }*/

        if (a instanceof Person) {
            ((Person) a).useTools();
        } else {
            System.out.println("a不是Person类型");
        }


        // 将子类强制提升成为父类类型,本质就是多态
        Student s = new Student();
        ((Person)s).eat();   // 调用的依然是子类自己的方法,编译看左边，运行看右边
        System.out.println(((Person) s).x);  // 访问的是父类里的属性，属性运行看右边
        /*Person m = (Person)s;
        m.eat();
        System.out.println(m.x);*/
    }
}

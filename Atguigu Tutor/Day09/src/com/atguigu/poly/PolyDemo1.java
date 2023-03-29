package com.atguigu.poly;

import com.atguigu.bean.Animal;
import com.atguigu.bean.Person;
import com.atguigu.bean.Student;
import com.atguigu.exercise.Base;

/*
多态是同一个事物的不同表示方式
代码里的体现: 父类引用指向之类对象。多态要基于继承或者实现(接口)

多态的特点:
    1. 成员变量的特点: 编译和运行都看(等号)左边(声明的父类类型)
    2. 方法调用的特点: 编译看左边，运行看右边
        编译看等号左边声明的父类类型；运行看右边创建的子类对象
    3. 虽然会调用父类的构造方法，但是只创建了一个实例对象。
        父类构造方法里的this指向的都是创建的子类对象!
多态的意义:
    1. 在方法里使用父类作为形参，可以接收子类类型，提高了代码的灵活性
        System.out.println(Object obj);
    2. 子类重写父类方法，实现不同的子类对象调用相同的父类方法，执行不同的内容
        屏蔽底层的差异，提高了代码的扩展性
*/
public class PolyDemo1 {
    public static void main(String[] args) {
        Animal a = new Student();
        System.out.println(a.x);
        // System.out.println(a.y);

        a.eat();
        // a.study();  编译报错，如果能够编译成功，可以运行起来

        /*
        编译通过的两种方式:
        1. 强制类型转换，将 Animal类型的对象a强转成为Student类型
        2. 使用反射 绕过编译器 语法校验
         */
        ((Student) a).study();

        Student s = new Student();
        System.out.println(s);
        Person p = new Person();
        System.out.println(p);

        Base b = new Base();
        System.out.println(b);
    }
}

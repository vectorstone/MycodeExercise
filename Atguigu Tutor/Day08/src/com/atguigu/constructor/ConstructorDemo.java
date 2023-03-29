package com.atguigu.constructor;

/*
继承以后，构造方法的特点:  在创建子类之前，会先调用父类的构造方法，初始化父类空间!
在子类构造方法的第一行，默认有一个 super() 调用父类的构造方法
如果父类没有空参数构造方法，子类构造方法的第一行，必须要使用 super(参数)手动的调用父类的构造方法
子类通常会基于父类的构造方法，然后进行扩充
*/
public class ConstructorDemo {
    public static void main(String[] args) {
        Son s1 = new Son(10);
        System.out.println(s1.x); // 10

        Son s2 = new Son(5, 7);
        System.out.println(s2.x);
        System.out.println(s2.y);

        Son s3 = new Son();

    }
}

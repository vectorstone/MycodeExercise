package com.atguigu.encap;

/*
构造器也叫构造方法，作用是在实例对象创建时就对成员变量进行初始化
构造方法的特点:
1. 构造方法必须要配合关键字new使用才有效
2. 构造方法的方法名和类名必须要一致
3. 构造方法没有返回值类型声明!!!
4. 每个类都有一个默认的空参数的构造方法。如果在类里定义了其他构造方法，默认空参数的构造方法就被覆盖了!
    如果此时还想使用空参数构造方法，必须要手动的定义空参数构造方法!
5. 构造方法也允许重载。
6. 在构造方法里，还可以使用 this(参数)的形式调用本类其他的构造方法。
    如果使用了this(参数)必须要写在构造方法的第一行!
*/
public class ConstructorDemo {
    public static void main(String[] args) {
        Person p1 = new Person();  // 调用的是空参数的构造方法，成员变量都使用默认值

        Person p2 = new Person("jack", 18, "男");  // jack,18,男

        Person p3 = new Person("jack");

        Person p4 = new Person("tony", 18);
    }
}

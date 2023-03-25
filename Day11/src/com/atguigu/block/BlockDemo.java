package com.atguigu.block;

/*
在类里方法外出现的 {} 就是代码块,代码块分为两大类:

在类里方法外，使用 static{}声明的代码块
静态代码块: 类初始化时会调用这个静态代码块
    类在什么常见下会被初始化: 类只会被加载一次!!!!
        1. 访问了类的静态成员变量 或者 调用了类里的静态方法
        2. 创建实例对象之前，会先加载 这个类
        3. 子类在加载之前会先加载父类

    类的加载过程:
        1. 本类静态成员变量设置默认值
        2. 初始化父类
        3. 按照代码的书写顺序 执行静态代码块以及给静态成员变量赋值


和静态代码块的声明类似，只是没有static关键字
构造代码块: 当创建和初始化实例对象时，会调用 构造代码块，对所有的实例对象进行统一的初始化
    实例对象的初始化过程:
        1. 非静态成员变量设置默认值
        2. 调用本类构造器里的this()/super() 初始化父类空间
            2.1 父类非静态成员变量设置默认值
            2.2 初始化父类的父类
            2.3 按照代码的书写顺序，执行构父类造代码块以及给非静态成员变量赋值
            2.4 调用父类的构造器
        3. 按照代码的书写顺序，执行构造代码块以及给非静态成员变量赋值
        4. 调用构造器 里剩下的代码

*/
public class BlockDemo {
    public static void main(String[] args) {
        ConstructorBlock cb1 = new ConstructorBlock();
    }
}

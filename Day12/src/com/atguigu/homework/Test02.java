package com.atguigu.homework;

public class Test02 {
    public static void main(String[] args) {
        /*
        1. 非静态成员变量设置默认值
        2. 调用 构造方法里的 this() / super() 初始化父类空间
            2.1 父类非静态成员变量设置默认值
            2.2 调用 父类构造方法里的 this() / super() 初始化父类的父类空间
            2.3 执行 父类的构造代码块以及给非静态成员变量赋值
            2.4 执行 父类构造方法里的其他代码
        3. 执行构造代码块以及给非静态成员变量赋值
        4. 执行构造方法里的其他代码
         */
        Child c = new Child("mike");
        System.out.println(c.father.name);
        System.out.println(c.name);
    }
}

class People {
    String name;

    public People() {
        System.out.print("1");
    }

    public People(String name) {
        System.out.print("2");
        this.name = name;
    }
}

class Child extends People {
    People father;

    public Child(String name) {
        super();
        System.out.print("3");
        father = new People(name + " F");
    }

    public Child() {
        System.out.print("4");
    }
}


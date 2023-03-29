package com.atguigu.homework1;

public class Test06 {
    public static void main(String[] args) {
        /*
        1. 非静态成员变量设置默认值
        2. 调用 构造方法里的 this() / super() 初始化父类空间
            2.1 父类非静态成员变量设置默认值
            2.2 调用 父类构造方法里的 this() / super() 初始化父类的父类空间
            2.3 执行 父类的构造代码块以及给非静态成员变量赋值   base
            2.4 执行 父类构造方法里的其他代码  sub : 100
        3. 执行构造代码块以及给非静态成员变量赋值  sub
        4. 执行构造方法里的其他代码 base : 70
         */
        Sub s = new Sub();
    }
}

class Base {
    Base() {
        // this表示的是子类对象，调用方法执行的是子类方法；访问属性，访问的是父类的属性
        this.method(100);
    }

    {
        System.out.println("base");
    }

    public void method(int i) {
        System.out.println("base : " + i);
    }
}

class Sub extends Base {
    Sub() {
        super();
        super.method(70);
    }

    {
        System.out.println("sub");
    }

    public void method(int j) {
        System.out.println("sub : " + j);
    }
}

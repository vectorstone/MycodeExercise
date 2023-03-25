package com.atguigu.inner;

/*
在类里定义的类称为内部类,可以分为:
1. 成员内部类特点:
    (1) 和成员变量一样，定义在类里方法外
    (2) 和成员变量一样，可以使用所有的权限修饰符;和普通一样，可以使用 final / abstract修饰符
    (3) JDK16以前只能不能使用static定义静态成员变量，但是可以使用final static 定义静态常量
        JDK16以后可以使用 static 定义静态成员变量
    (4) 内部类可以访问外部类的所有成员变量，包括 private 和 static 的
    (5) 外部类里也可以访问内部类的成员
    (6) 如果内部类成员变量和外部类成员变量同名，
        在内部类里可以通过  外部类名.this.变量名 访问外部类里的成员变量
    (7) 编译以后也会生成独立的 .class文件，文件名是  外部类名$内部类名.class
    (8) 创建成员内部类对象必须要先创建外部类对象!
2. 静态内部类
    (1) 和静态成员变量一样，都是在类里方法外。从语法上看，就是成员内部类前面加了static关键字
    (2) 和静态成员变量一样，可以使用全部的权限修饰符，还可以使用 abstract / final 类修饰符
    (3) 可以使用 static关键字 定义静态变量，也可以使用 static final定义静态常量
    (4) 只能访问外部类里被 static修饰的变量
    (5) 外部类也可以访问内部类的成员。
    (6) 如果内部类成员变量和外部类成员变量同名，在内部类里可以通过 外部类名.静态成员变量访问
    (7) 编译以后也会生成独立的 .class文件，文件名是  外部类名$内部类名.class
    (8) 可以不创建外部类对象，直接通过外部类访问到静态内部类
3. 局部内部类
    (1) 和局部变量一样，定义在方法里
    (2) 和局部变量一样，只能使用默认的权限修饰符，和普通类一样，可以使用 abstract /final 修饰符
    (3) JDK16以前只能不能使用static定义静态成员变量，但是可以使用final static 定义静态常量
        JDK16以后可以使用 static 定义静态成员变量
    (4) 能够访问外部类里所有的成员变量。
    (5) 局部内部类只能在定义它的方法里才能访问，其他方法不能访问局部内部类
    (6) 局部内部类里如果出现了和外部类方法里局部变量同名的变量，外部类里方法的局部变量无法再访问
    (7) 编译以后也会生成独立的.class文件，文件名是 外部类名$编号内部类名.class
    (8) 局部内部类只能在声明它的方法里访问，外部不能直接创建对象!

    局部内部类如果访问到了外部类方法里的局部变量x, x必须要被final修饰或者要有final效果
    JDK8以后，x 可以不用再手动加 final,只要局部内部类访问了，会自动有final效果
4. 匿名内部类
*/
public class InnerDemo {
    public static void main(String[] args) {
        /*MemberOuter memberOuter = new MemberOuter();
        System.out.println(memberOuter.x);
        memberOuter.demo1();*/
        MemberOuter.demo2();

        MemberOuter.MemberInner memberInner = new MemberOuter().new MemberInner();

        System.out.println(StaticOuter.x);
        StaticOuter.StaticInner staticInner = new StaticOuter.StaticInner();
        staticInner.demo();

        LocalOuter localOuter = new LocalOuter();
        // String s = localOuter.bar();

        // Father f = new LocalInner();
        Father f = localOuter.test();
        System.out.println("-----------");
        f.demo();
    }
}



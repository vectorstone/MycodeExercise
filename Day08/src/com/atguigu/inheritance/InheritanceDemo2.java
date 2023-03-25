package com.atguigu.inheritance;

/*
继承以后成员变量的特点:
1. 子类可以访问父类被public/protected修饰的成员变量
    如果父子类在同一个包里，子类还可以访问父类里缺省修饰的变量
2. 子类还可以添加自己的成员变量
3. 子类还可以定义和父类同名的成员变量(强烈不推荐!!!)
    子类如果想要访问父类同名的成员变量，需要使用 super.成员变量名访问
*/
public class InheritanceDemo2 {
    public static void main(String[] args) {
        Person p = new Person();
        p.demo();
    }
}

package com.atguigu.inter;

/*
接口A和抽象类B的区别:
1. 接口和类是两个不同的数据类型。它们能定义的内容是不同的:
    接口里只能定义五种成员:  静态成员常量,抽象方法,默认方法,静态方法,私有方法
        不能定义成员变量，也不能有构造方法
    抽象类是类，可以定义 成员变量，也可以定义构造方法
2. 继承关系上有区别:
    继承类使用extends关键字，实现接口使用 implements关键字
    一个类C只能继承一个父类，但是可以实现多个接口
    class C extend B implements A,D...
3. 抽象类只能继承一个父类，但是接口可以多继承
    class B extends X
    interface A extends M,N,P
*/
public class InterfaceDemo3 {
}

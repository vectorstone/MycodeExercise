package com.atguigu.tset;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/23/2023 7:51 PM
 */
class A{
    String name="丘比特"; //就地初始化

    public A(){
        System.out.println("构造方法初始化！");
        this.name="小丘比特";
        System.out.println(this.name);
    }
    {
        System.out.println(this.name);
        System.out.println("我是普通代码块！");
    }
    static {
        System.out.println("我是静态代码块！");
    }
}
public class Test {
    public static void main(String[] args) {
        new A();
    }
}


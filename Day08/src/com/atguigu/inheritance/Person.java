package com.atguigu.inheritance;

import com.atguigu.permission.Dog;

public class Person extends Animal {
    String city;

    public String x = "Person";

    public void demo() {
        String x = "local";
        System.out.println(x);  // 局部变量
        System.out.println(this.x);  // 成员变量 Person
        System.out.println(super.x);  // 父类变量 Animal
    }

    public void work() {
        System.out.println("人正在工作");
    }

    public void eat(String food) {
        System.out.println("人正在吃" + food);
    }

    /*public int test(){
        return 0;
    }*/

    @Override
    protected Animal foo() {
        System.out.println("子类重写了父类的foo方法");
        return null;
    }

    public static void bar() {
        System.out.println("我是子类的静态方法bar");
    }

}

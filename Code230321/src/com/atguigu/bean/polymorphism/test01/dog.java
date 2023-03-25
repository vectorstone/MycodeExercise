package com.atguigu.bean.polymorphism.test01;

/**
 * @Description: dog父类
 * @Author: Gavin
 * @Date: 3/21/2023 6:52 PM
 */
public class dog {
    public String name;
    public String color;

    public dog(String name, String color) {
        this.name = name;
        this.color = color;
    }
    //定义方法
    public void eat(){
        System.out.println("这是狗的eat方法,狗吃东西");
    }
}

package com.atguigu.inheritance.test;

/**
 * @Description: fatehr
 * @Author: Gavin
 * @Date: 3/20/2023 7:17 PM
 */
public class son extends father {
    private int c;
    public son(){

    }
    public son(int c){
        System.out.println("我是子类构造器");
    }
}

package com.atguigu.test01;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/23/2023 8:46 PM
 */
public class Test03 {
    public static void main(String[] args) {
        Father f = new Father();
        Child c = new Child();
    }
}
class Father {
    public Father(){
        System.out.println("father create");
    }
}
class Child extends Father{
    public Child(){
        System.out.println("child create");
    }
}

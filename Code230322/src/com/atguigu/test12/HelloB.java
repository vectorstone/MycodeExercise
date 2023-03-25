package com.atguigu.test12;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/24/2023 9:26 PM
 */

class HelloA{
    public HelloA(){
        System.out.println("HelloA");
    }
    {
        System.out.println("I'm A Class");
    }
    static{
        System.out.println("static A");
    }
}

public class HelloB extends HelloA{
    public HelloB(){
        System.out.println("HelloB");
    }
    {
        System.out.println("I'm B Class");
    }
    static{
        System.out.println("static B");
    }

    public static void main(String[] args) {
        new HelloB();
    }

}

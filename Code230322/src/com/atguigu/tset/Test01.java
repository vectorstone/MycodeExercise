package com.atguigu.tset;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/23/2023 7:43 PM
 */


class HelloA{
    public HelloA(){
        System.out.println("HelloA");
    }
    {
        System.out.println("I'm A Class");
    }
}

class HelloB extends HelloA{
    public HelloB(){
        System.out.println("HelloB");
    }
    {
        System.out.println("I'm B Class");
    }
}
public class Test01{
    public static void main(String[] args) {
        new HelloB();
    }
}


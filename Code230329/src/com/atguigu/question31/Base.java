package com.atguigu.question31;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/30/2023 11:29 AM
 */
public class Base extends Pri{
    public static void main(String[] args) {
        Pri p=new Pri();

        p . method();

    }

}

class Pri{
    public final void method( ) {

        System . out . println("method");
    }

}
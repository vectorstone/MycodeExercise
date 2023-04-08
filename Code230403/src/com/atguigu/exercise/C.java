package com.atguigu.exercise;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/4/2023 1:42 PM
 */
public class C extends B implements A{
    public void printX(){
        // System.out.println(B.this.x);
    }
    public static void main(String[] args) {

    }
}

interface A {
    int x = 0;
}
class B{
    int x = 1;
}

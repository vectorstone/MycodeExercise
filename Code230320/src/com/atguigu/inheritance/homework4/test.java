package com.atguigu.inheritance.homework4;

/**
 * @Description: test
 * @Author: Gavin
 * @Date: 3/20/2023 9:24 PM
 */
public class test {
    public static void main(String[] args) {
        Person[] arr = new Person[4];
        arr[0] = new Man();
        arr[1] = new Woman();
        arr[2] = new Man();
        arr[3] = new Woman();
        for (int i = 0; i < arr.length; i++) {
            arr[i].eat();
            System.out.println("----------------------");
        }

    }
}

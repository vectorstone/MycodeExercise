package com.atguigu.interfaceexercise.homework3;

/**
 * @Description: com.atguigu.test
 * @Author: Gavin
 * @Date: 3/22/2023 6:57 PM
 */
public class TestPerson {
    public static void main(String[] args) {
        Person[] arr = {
          new Chinese(),
          new American(),
          new Indian()
        };
        for (int i = 0; i < arr.length; i++) {
            arr[i].eat();
        }
    }
}

package com.atguigu.interfaceexercise.homework2;

/**
 * @Description: com.atguigu.test
 * @Author: Gavin
 * @Date: 3/22/2023 6:48 PM
 */
public class TestDemo2 {
    public static void main(String[] args) {
        Animal[] arr = {
                new Dog(),
                new Person(),
                new Person(),
                new Dog()
        };
        for (int i = 0; i < arr.length; i++) {
            arr[i].eat();
        }
    }
}

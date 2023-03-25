package com.atguigu.inheritance.homework4;

/**
 * @Description: Man
 * @Author: Gavin
 * @Date: 3/20/2023 9:17 PM
 */
public class Man extends Person{
    @Override
    public void toilet() {
        System.out.println("男人在男厕所上洗手间");
    }

    @Override
    public void eat() {
        System.out.println("男人在吃饭");
        toilet();
        smoke();
    }
    public void smoke(){
        System.out.println("男人抽个烟冷静下");
    }
}

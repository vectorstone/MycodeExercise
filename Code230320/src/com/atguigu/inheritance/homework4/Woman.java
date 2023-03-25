package com.atguigu.inheritance.homework4;

/**
 * @Description: Woman
 * @Author: Gavin
 * @Date: 3/20/2023 9:19 PM
 */
public class Woman extends Person{
    @Override
    public void toilet() {
        System.out.println("女人去女厕所上洗手间");
    }

    @Override
    public void eat() {
        System.out.println("女生在吃饭");
        toilet();
        makeup();
    }
    public void makeup(){
        System.out.println("女人在化妆");
    }
}

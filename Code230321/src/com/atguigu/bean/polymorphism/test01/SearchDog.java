package com.atguigu.bean.polymorphism.test01;

/**
 * @Description: SearchDog
 * @Author: Gavin
 * @Date: 3/21/2023 6:54 PM
 */
public class SearchDog extends dog{
    public SearchDog(String name,String color){
        super(name,color);
    }

    @Override
    public void eat() {
        System.out.println("搜救犬搜寻人类");
    }
}

package com.atguigu.test;

public class SearchDog extends Dog{
    public SearchDog(String name, String color) {
        super(name, color);
    }

    @Override
    public void work() {
        System.out.println("搜救犬正在搜寻生命");
    }
}

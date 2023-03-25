package com.atguigu.bean.polymorphism.test01;

/**
 * @Description: policeDog
 * @Author: Gavin
 * @Date: 3/21/2023 6:53 PM
 */
public class PoliceDog extends dog {
    public PoliceDog(String name, String color){
        //如果父类没有空参数构造方法,子类构造方法的第一行,必须要使用super(参数)手动的调用
        super(name,color);
    }
    //重写父类方法


    @Override
    public void eat() {
        System.out.println("警犬攻击敌人");
    }
}

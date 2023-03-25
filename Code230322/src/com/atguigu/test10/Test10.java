package com.atguigu.test10;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/24/2023 9:09 PM
 */


public class Test10 {
    public static void main(String[] args) {
        Other o = new Other();
        new Test10().addOne(o);
        System.out.println(o.i);
    }

    public void addOne(final Other o){
        o.i++;
    }
}
class Other{
    public int i;
}

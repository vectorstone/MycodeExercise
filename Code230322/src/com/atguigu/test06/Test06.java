package com.atguigu.test06;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/23/2023 8:57 PM
 */
public class Test06 {
    public static void main(String[] args) {
        Sub s = new Sub();
    }
}
class Base{
    Base(){
        method(100);
    }
    {
        System.out.println("base");
    }
    public void method(int i){
        System.out.println("base : " + i);
    }
}
class Sub extends Base{
    Sub(){
        super.method(70);
    }
    {
        System.out.println("sub");
    }
    @Override
    public void method(int j){
        System.out.println("sub : " + j);
    }
}

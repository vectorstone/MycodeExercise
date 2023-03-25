package com.atguigu.bean.polymorphism.test03;

/**
 * @Description: test03
 * @Author: Gavin
 * @Date: 3/21/2023 11:32 AM
 */
public class Test03 {
    public static void main(String[] args) {
        Base b1 = new Base(); //base : 100
        Base b2 = new Sub();//多态 sub : 100   method : 70
    }
}

class Base {
    Base() {
        method(100);
    }

    public void method(int i) {
        System.out.println("base : " + i);
    }
}

class Sub extends Base {
    Sub() {
        super();
        /*
        * 这一步回到父类里面再调用menthod方法是this.method(),其实是子类的方法
        * */
        super.method(70);
    }


    public void method(int j) {
        System.out.println("sub : " + j);
    }
}
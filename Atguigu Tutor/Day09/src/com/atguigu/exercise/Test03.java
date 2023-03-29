package com.atguigu.exercise;

public class Test03 {
    public static void main(String[] args) {
        Base b1 = new Base();  // base : 100
        Base b2 = new Sub();  // sub : 100    base : 70
    }
}



class Sub extends Base {
    Sub() {
        super();
        super.method(70);
    }

    public void method(int j) {
        System.out.println("sub : " + j);
    }
}

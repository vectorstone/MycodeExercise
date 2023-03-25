package com.atguigu.fin;

public class Super {
    public void demo() {

    }

    public final void test() {

    }
}

class Sub extends Super {
    @Override
    public void demo() {
        System.out.println("子类重写了父类的demo方法");
    }
    /*public void test() {

    }*/
}

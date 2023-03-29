package com.atguigu.exercise;

public class Test01 {
    public static void main(String[] args) {
        X x = new Y();
        System.out.println(x.num);  // 1
        System.out.println(((Y) x).num);  // 2
        System.out.println(((X) ((Y) x)).num);  // 1
        System.out.println("-------------------");
        Y y = new Y();
        System.out.println(y.num);  // 2
        System.out.println(((X) y).num);  // 1
        System.out.println(((Y) ((X) y)).num); // 2
    }
}

class X {
    int num = 1;
}

class Y extends X {
    int num = 2;
}
package com.atguigu.inner;

public class MemberOuter {
    int x = 10;
    static int y = 2;
    String m = "hello";

    class MemberInner {
        int a = 5;
        static int b = 8;  // JDK16以后
        String m = "good";

        public void test() {
            System.out.println(a);
            System.out.println(x);
            System.out.println(y);

            String m = "ok";
            System.out.println(m);  // ok
            System.out.println(this.m);  // good
            System.out.println(MemberOuter.this.m); // hello
        }
    }

    public void demo1() {
        System.out.println("我是外部类里的demo1方法");
        MemberInner inner = new MemberInner();
        System.out.println(inner.a);
    }

    public static void demo2() {
        MemberInner inner = new MemberOuter().new MemberInner();
        System.out.println(inner.a);
    }
}

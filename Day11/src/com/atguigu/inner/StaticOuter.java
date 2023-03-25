package com.atguigu.inner;

public class StaticOuter {
    static int x = 10;
    int y = 2;
    static String m = "hello";

    static class StaticInner {
        private int a = 5;
        private static int b = 6;
        String m = "good";

        public void demo() {
            System.out.println(x);
            // System.out.println(y);
            String m = "ok";
            System.out.println(m);  // ok
            System.out.println(this.m); // good
            System.out.println(StaticOuter.m);  // hello
            // System.out.println(StaticOuter.this.m);
        }
    }

    public void test() {
        System.out.println(StaticInner.b);
       /* StaticInner inner = new StaticInner();
        System.out.println(inner.a);*/
    }
}

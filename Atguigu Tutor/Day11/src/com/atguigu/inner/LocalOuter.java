package com.atguigu.inner;

public class LocalOuter {
    String s1 = "外部类的成员变量";
    String m = "outer.member";

    public Father test() {
        String s2 = "外部类方法里的局部变量";
        int x = 10;  // 外部类方法里的局部变量
        String m = "outer.local";

        class LocalInner implements Father {
            String s3 = "局部内部类里的成员变量";
            static int a = 5;
            String m = "localClass.member";
            public void demo() {
                System.out.println(x);
                String s4 = "局部内部类里的局部变量";
                String m = "localClass.local";
                System.out.println(s1);
                System.out.println(s2);
                System.out.println(s3);
                System.out.println(s4);

                System.out.println(m);  // localClass.local
                System.out.println(this.m); // localClass.member
                System.out.println(LocalOuter.this.m); // outer.member
            }
        }

        LocalInner inner = new LocalInner();
        // inner.demo();
        return inner;
    }


    public void foo() {
        int x = 3;
        class LocalInner {

        }
    }

    public String bar() {
        String s = "hello";
        return s;
    }
}

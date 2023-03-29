package com.atguigu.homework1;

/*
类的加载过程:
    1. 静态成员变量设置默认值  x=0,y=0,z=0
    2. 初始化父类
    3. 静态成员变量赋值以及执行静态代码块
        x = -1,z=-1
*/
public class Test11 {
    static int x, y, z;

    static {
        int x = 5;
        x--;
    }

    static {
        x--;
    }

    public static void main(String[] args) {
        System.out.println("x = " + x);  // x = -1
        z--;
        System.out.println("z = " + z);  // z = -1
        method();
        System.out.println("y = " + y);  // y = 0
        System.out.println("z = " + z);  // z = 1

        // int m= ++z;m=2,z=2
        System.out.println("result:" + (z + y + ++z));
        System.out.println("z = " + z);
    }

    public static void method() {
        /*
        int z1 = z++;  z1 = -1,z=0
        int z2 = ++z;  z2 = 1,z=1
         */
        y = z++ + ++z;  //  y = z1 + z2 --> 0
    }
}

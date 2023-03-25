package com.atguigu.test11;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/24/2023 9:13 PM
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
        System.out.println("x=" + x);// x = 3
        z--;//z -1
        method(); //y = -1 + 1        此时z是1
        System.out.println("result:" + (z + y + ++z));   //result:   1 + 0 + 2
    }

    public static void method() {
        y = z++ + ++z;
    }
}

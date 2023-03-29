package com.atguigu.fin;

/*
final是修饰符，可以修饰 变量，方法以及类；finally是关键字，用来表示一个代码块。

finally代码块表示"一定"会执行的代码，无论是否出现异常，在JVM停止之前都会执行一下finally代码块里的内容
注意事项:
    1. 如果在finally执行之前，JVM就已经停止了，finally里的代码也不会执行了
    2. 方法里，如果finally代码块里有return语句，finally里的return会覆盖前面的return
语句结构有两种:
try {
}finally{
}

try{
}catch(){
}finally{
}

*/
public class FinallyDemo {
    public static void main(String[] args) {
        /*try {
            System.out.println(1 / 0);
        } finally {
            System.out.println("hello");
        }*/

        /*try {
            int[] arr = new int[]{1, 2, 3};
            System.out.println(arr[5]);
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("出异常了");
        } finally {
            System.out.println("ok");
        }*/

        System.out.println("good");

        System.out.println(test(12, 6));  // 2
        System.out.println(test(1, 0));
    }


    public static int test(int x, int y) {
        try {
            return x / y;
        } finally {
            return 9;
        }
    }
}

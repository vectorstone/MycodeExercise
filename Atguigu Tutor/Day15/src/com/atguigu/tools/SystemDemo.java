package com.atguigu.tools;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;

/*
System类的使用:
    1. out err 静态成员常量的使用
    2. currentTimeMillis() 获取到当前时间的时间戳
    3. getProperties() / getenv()
    4. arraycopy(Object src,  int  srcPos,Object dest, int destPos,int length)
        src:源数组   srcPos:源数组的下标  dest:目标数组  destPos:目标数组的下标  length:赋值的长度
*/
public class SystemDemo {
    public static void main(String[] args) throws FileNotFoundException {
        // out是System类的静态成员常量， println方法是out对象里的方法
        System.out.println("hello world");
        System.out.println(System.currentTimeMillis());

        System.out.println(System.getProperties());
        System.out.println(System.getenv());

        int[] nums = {34, 28, 56, 73, 88, 65, 44, 57};
        // 删除下标为3的元素
        /*for (int i = 3; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = 0;*/
        nums[nums.length - 1] = 0;
        System.arraycopy(nums, 4, nums, 3, 4);
        System.out.println(Arrays.toString(nums));


        /* 删除下标是i的元素
         System.arraycopy(nums,i+1,nums,i,nums.length-1-i)
         nums[nums.length - 1] = 0;*/


        /*
        System.out 表示的是标准输出的位置，默认是控制台
        System.err 表示错误输出的位置，默认是控制台
         */

        /*
         当程序出现异常时，JVM的处理步骤:
            1. 调用 System.err.println()打印异常的堆栈信息
            2. 以1为退出码，并强行关闭JVM
        */

        // 通过 setOut() / setErr() 可以修改默认输出/错误输出的位置
        System.setOut(new PrintStream("out.txt"));
        System.out.println("good");
        System.setErr(new PrintStream("err.txt"));
        System.out.println(1 / 0);
    }
}

class Person {
    static Dog d = new Dog();

}

class Dog {
    public void bark() {
        System.out.println("狗正叫");
    }
}
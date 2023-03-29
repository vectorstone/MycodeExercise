package com.atguigu.enumeration;

/*
枚举也叫穷举，就是把所有的可能性全都列举出来。
当一个类能够创建出来的实例对象 明确的，此时可以考虑使用枚举
Month类: 只能创建12个实例对象    Week类: 只能创建12个实例对象  Season: 只能创建4个实例对象

手动实现枚举:
 1. 构造方法私有化，禁止外部直接创建实例对象
 2. 在类的内部创建好被 public static final 修饰的实例对象
*/
public class EnumDemo1 {
    public static void main(String[] args) {
        Month jan = Month.JAN;
        System.out.println(jan);

        Month may = Month.MAY;
        System.out.println(may);
    }
}

package com.atguigu.box;

/*
基本包装类型的常见方法:
    Integer.parseInt(String s): 将字符串转换成为Integer类型的值
    Integer.parseInt(String s,int radix): 将字符串当做指定进制转换成为数字
        radix取值范围[2,36]
    Integer.toHexString(int x): 将十进制的数字x转换成为十六进制的字符串

 */
public class BoxDemo4 {
    public static void main(String[] args) {
        int a = 10;
        // a.toString();   a.hashCode();
        Integer i = a;

        // 很少将基本数据类型包装成为引用数据类型以后，再调用方法
        /*System.out.println(i.toString());
        System.out.println(i.hashCode());*/

        // 很多情况下，是将 基本包装类型当做工具类使用  通过 类名.静态方法名() 调用
        String s = "123";
        int x = Integer.parseInt(s);

        System.out.println(s + 1); // "1231"
        System.out.println(x + 1);  // 124

        System.out.println(Integer.parseInt("1a2b", 20));

        System.out.println(Integer.toHexString(156));
        System.out.println(Integer.toOctalString(156));
        System.out.println(Integer.toBinaryString(156));

        System.out.println(Integer.MAX_VALUE);   // 2的31次方-1
        System.out.println(Integer.MIN_VALUE);  // -2的31次方
    }
}

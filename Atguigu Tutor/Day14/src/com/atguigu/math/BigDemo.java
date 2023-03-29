package com.atguigu.math;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/*
java.math包里有 BigInteger / BigDecimal 类

整数分为 byte/short/int/long类型，long类型最大到 2的63次方-1

超出long范围的整数，需要使用 BigInteger类型,BigInteger是引用数据类型!
BigInteger类型和 int/Integer类型之间不能自动转换!!!
BigInteger如果想要计算，不能使用 +*-/ 算术运算符！如果想要实现计算，需要调用方法
常见方法:
    add / subtract / multiply / divide


BigDecimal用来表示超精度浮点数
    add / subtract / multiply / divide
*/
public class BigDemo {
    public static void main(String[] args) {
        long l = 13243534565436L;
        // long x = 9223372036854775807L;  long类型的最大值
        // long x = 9223372036854775808L;

        // 超出long类型的整数不能再使用基本数据类型，需要使用引用数据类型 BigInteger表示

        BigInteger bi1 = new BigInteger("9223372036854775808");
        // System.out.println(bi1 + 1);
        System.out.println(bi1.add(new BigInteger("1")));
        System.out.println(bi1.subtract(new BigInteger("3")));
        System.out.println(bi1.multiply(new BigInteger("9")));
        System.out.println(bi1.divide(new BigInteger("2")));


        System.out.println(0.1 + 0.2);
        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("0.2");
        System.out.println(bd1.add(bd2));

        BigDecimal ten = new BigDecimal("10.0");
        BigDecimal two = new BigDecimal("2.0");
        BigDecimal three = new BigDecimal("3.0");

        System.out.println(ten.divide(two));

        // System.out.println(ten.divide(three));


        // divide(BigDecimal divisor, RoundMode mode)
        System.out.println(ten.divide(three, RoundingMode.UP));

        // divide(BigDecimal divisor,int scale,RoundMode mode)  scale表示的精度
        System.out.println(ten.divide(three, 5, RoundingMode.HALF_UP));
    }
}

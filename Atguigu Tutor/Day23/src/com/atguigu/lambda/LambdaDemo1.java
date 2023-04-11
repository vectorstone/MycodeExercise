package com.atguigu.lambda;

import org.junit.Test;
import java.util.function.BinaryOperator;

/*
lambda表达式 是只有一个抽象方法的接口SAM的匿名内部类+匿名对象的简写
lambda表达式 函数式编程 本质是将一个函数(方法)当做另一个函数(方法)的参数来使用

Consumer: 消费型接口, 有参数，没有返回值
Supplier: 供给型型接口, 没有参数，有返回值
Predicate: 判断型接口，有参数，返回布尔类型的值
Function / Operator: 功能型接口，有参数也有返回值
*/
public class LambdaDemo1 {
    public void calculate(int a, int b, BinaryOperator<Integer> function) {
        Integer x = function.apply(a, b);
        System.out.println(x);
    }

    @Test
    public void testCalculate() {
        calculate(1, 2, (a, b) -> a + b);
    }
}
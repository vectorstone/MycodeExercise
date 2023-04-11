package com.atguigu.lambda;

import org.junit.Test;

import java.util.function.BiFunction;

/*
如果想要使用 lambda表达式，要接口里只能有一个 抽象方法(排除Object类里的方法)  SingleAbstractMethod

JDK新增了4类44个接口，用来快速的实现Lambda表达式
 */
public class LambdaDemo2 {
    public void calculate(int a, int b, BiFunction<Integer, Integer, Integer> f) {
        int c = f.apply(a, b);
        System.out.println(c);
    }

    @Test
    public void testCalculate() {
        /*calculate(2, 7, new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer x, Integer y) {
                return x * y;
            }
        });*/
        calculate(2, 7, (Integer x, Integer y) -> {
            return x * y;
        });
    }
}

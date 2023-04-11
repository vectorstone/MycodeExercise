package com.atguigu.lambda;


import org.junit.Test;

public class LambdaDemo1 {
    public void calculate(int a, int b, Operator op) {
        int c = op.operate(a, b);
        System.out.println(c);
    }

   /*
   Java不允许将一个方法当做另一个方法的参数来使用
   public int sum(int x, int y) {
        return x + y;
    }*/

    @Test
    public void tstCalculate() {
        calculate(2, 5, (int x, int y) -> {
            return x * y;
        });
    }
}


package com.atguigu.anonymous;

public class Calculator {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        AddOperator o1 = new AddOperator();
        c.doCalculate(7, 2, o1);

        Operator o2 = new Operator() {
            @Override
            public int operate(int x, int y) {
                return x - y;
            }
        };
        c.doCalculate(10, 7, o2);

        Operator o3 = new Operator() {
            @Override
            public int operate(int x, int y) {
                return x * y;
            }
        };
        c.doCalculate(3, 5, o3);

        c.doCalculate(30, 5, new Operator() {
            @Override
            public int operate(int x, int y) {
                return x / y;
            }
        });

        /*System.out.println(new Operator() {
            @Override
            public int operate(int x, int y) {
                return x / y;
            }
        }instanceof Operator);*/
    }

    public void doCalculate(int a, int b, Operator op) {
        int m = op.operate(a, b);
        System.out.println("运算以后的结果是 " + m);
    }
}

interface Operator {
    public abstract int operate(int x, int y);
}

class AddOperator implements Operator {
    @Override
    public int operate(int x, int y) {
        return x + y;
    }
}

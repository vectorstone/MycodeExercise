package com.atguigu.lambda;

@FunctionalInterface
public interface Operator {
    int operate(int x, int y);

    default void demo() {
        System.out.println("我是接口里的默认方法");
    }

    public abstract String toString();

    public abstract boolean equals(Object obj);
}

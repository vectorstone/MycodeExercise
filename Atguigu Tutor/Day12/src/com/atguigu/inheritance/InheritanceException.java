package com.atguigu.inheritance;

/*
子类在重写父类方法时，不能抛出比父类更大的异常(运行时异常不考虑)
1. 父类方法抛出异常类型A,子类只能抛出 A或者A的子类
2. 父类没有抛出异常，子类也不能抛出异常
3. 父类抛出了异常，子类只要没有使用super.方法名()调用父类方法，可以不抛。
*/
public class InheritanceException {
}

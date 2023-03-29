package com.atguigu.inter;

/*
子类实现接口:
    1. 使用 关键字implements 实现一个接口
    2. 如果一个子类实现了接口，必须要实现接口里所有的抽象方法!
        如果子类没有实现抽象方法，子类也必须要被定义为抽象类
    3. 一个类只能继承一个父类，但是可以实现多个接口
        class Son extends Father implements A,B
        先使用 extends继承类，再使用 implements 实现接口

注意事项:
    1. 方法调用的冲突:如果本类和父类都没有这个方法，但是多个父接口都有这个方法，此时调用这个方法会有冲突
    2. 接口直接也可以继承，而且接口可以多继承!!!
    此时要求子类必须要重写父接口的方法!!!  子类在重写时，如果想要调用父接口的某个方法: 接口名.super.方法名();

*/
public class InterfaceDemo2 {
    public static void main(String[] args) {
        Son s = new Son();
        s.test1();  // 调用Son类自己的test1()方法
        s.test2();  // 本类没有，父类和父接口都有，优先调用父类的方法
        s.test3();  // 本类和父类都没有，一个父接口有，可以调用

        // 如果多个父接口都有test4()方法，方法调用时会冲突，此时Son类必须要重写 test4()方法!
        s.test4();
    }
}

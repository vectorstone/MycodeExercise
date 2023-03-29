package com.atguigu.exercise;

public class Test07 {
    public static void main(String[] args) {
        /*
        一:加载类
            1. 静态成员变量设置默认值
            2. 初始化父类
                2.1 父类静态成员变量设置默认值
                2.2 初始化父类的父类
                2.3 按照代码的书写顺序，给父类静态成员变量赋值以及执行父类静态代码块
                （1）父类的静态代码块
            3. 按照代码的书写顺序，给静态成员变量赋值以及执行静态代码块
                （4）子类的静态代码块
        二:初始化实例对象
            1. 非静态成员变量设置默认值
            2. 调用 构造器里 this() /super()初始化父类空间
                （2）父类的非静态代码块
                （3）父类的无参构造
            3. 执行构造代码块以及给非静态成员变量赋值
            4. 执行构造器里的其他代码
                （5）子类的非静态代码块
                （6）子类的无参构造
         */
        Son son = new Son();
    }
}
class Father{
    static{
        System.out.println("（1）父类的静态代码块");
    }
    {
        System.out.println("（2）父类的非静态代码块");
    }
    Father(){
        System.out.println("（3）父类的无参构造");
    }
}
class Son extends Father{
    static{
        System.out.println("（4）子类的静态代码块");
    }
    {
        System.out.println("（5）子类的非静态代码块");
    }
    Son(){
        System.out.println("（6）子类的无参构造");
    }
}

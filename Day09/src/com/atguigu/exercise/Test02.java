package com.atguigu.exercise;

public class Test02 {
    public static void main(String[] args) {
        /*
        Son对象初始化过程:
        1. Son里的成员变量设置默认值
        2. 调用 Son构造方法里的 super() 初始化父类空间
        3. Son里的成员变量赋值
        4. 执行 Son构造方法里的其他代码
         */
        Father f = new Son();  // 多态
        /*
        Son.x = 0
        Son.x = 30
         */
        System.out.println(f.x);  // 20
    }
}

class Father {
    int x = 10;

    public Father() {
        // this表示的是子类对象
        this.print();  // 调用的是子类对象的方法
        this.x = 20;  // 访问的是自己的属性
    }

    public void print() {
        System.out.println("Father.x = " + x);
    }
}

class Son extends Father {
    int x = 30;

    public Son() {
        super();
        this.print();
        x = 40;
    }

    public void print() {
        System.out.println("Son.x = " + x);
    }
}

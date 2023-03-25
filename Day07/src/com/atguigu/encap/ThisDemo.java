package com.atguigu.encap;

/*
this关键字注意事项:
1. this用在方法里，用来表示调用这个方法的实例对象
2. 在大部分情况下this都可以省略，只有当方法里的形参或者局部变量和成员变量同名
    此时想要访问成员变量，this就不能省略
3. 在构造方法里，可以使用 this(参数列表)调用本类其他的构造方法
4. this只能在非静态方法和构造器里使用，不能在静态方法里使用!!!


非静态方法a调用非静态方法b  b() ==> this.b()  省略了this
静态方法a调用静态方法b     b() ==> 类名.b()   省略了类名
*/
public class ThisDemo {
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println("d = " + d);
        d.foo();
    }
}

class Demo {
    private String x;

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public void foo() {
        System.out.println("我是Demo类里的foo方法,this = " + this);
        bar();
    }

    public void bar() {
        System.out.println("我是Demo类里bar方法,this = " + this);
        Demo.test1();
    }

    public static void test1() {
        // System.out.println(this);
        Demo.test2();
    }

    public static void test2() {

    }
}

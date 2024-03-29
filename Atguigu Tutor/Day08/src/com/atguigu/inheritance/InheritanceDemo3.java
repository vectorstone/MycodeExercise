package com.atguigu.inheritance;

/*
继承以后方法的特点:
1. 子类继承父类以后，可以访问父类被public/protected修饰的方法
    如果子类和父类在同一个包里，还可以方位被缺省修饰的方法
2. 子类还可以自定义新的方法。
3. 子类还可以定义一个和父类同名的方法:
    前提: 子类可以访问父类的方法
        (1). 子类方法和父类方法重载: 子类定义了一个和父类同名但是不同参数的方法
        (2). 子类重写了父类的方法: 子类方法和父类方法同名同参，子类重写了父类方法，如果调用方法，会执行子类自己的方法。
            注意事项:
                a. 子类重写父类方法时，方法名和参数要一模一样
                b. 子类的权限修饰符必须要大于等于父类的权限修饰符
                c. 子类的返回值类型必须要必须是父类的返回值类型或者父类返回值类型的子类
                d. 子类可以定义一个和父类相同的静态方法，但是这个不是重写
                e. 可以使用 @Override 注解对重写的进行标注，用来进行语法校验
        (3). 报错: 子类方法和父类方法同名,但是既没有重写父类方法，也没有重载父类方法。
    前提:父类的方法子类不可访问
        (4). 子类的方法和父类的方法无关:子类定义的同名方法和父类无关
*/
public class InheritanceDemo3 {
    public static void main(String[] args) {
        Person p = new Person();
        p.work();
        p.foo();
    }
}

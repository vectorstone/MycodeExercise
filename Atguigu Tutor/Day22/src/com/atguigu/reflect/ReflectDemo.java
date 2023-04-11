package com.atguigu.reflect;

import com.atguigu.bean.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
通过类对象可以获取到类里的
成员变量:  Field
构造器:  Constructor

方法:
    getMethods(): 获取到所有的被public修饰的方法,包括继承父类的方法
    getDeclaredMethods(): 获取到本类自己定义的所有方法，包括private/protected/缺省
    getMethod(String name, Class<?>... parameterTypes):
    getDeclaredMethod(String name,Class<?>...parameterTypes):

调用方法:
    invoke(Object obj,Object...objects)
*/
public class ReflectDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Person> clz = Person.class;

        Person p = new Person();

        Method[] methods = clz.getMethods();
        for (Method m : methods) {
            System.out.println(m);
        }
        System.out.println("---------------------");
        for (Method m : clz.getDeclaredMethods()) {
            System.out.println(m);
        }
        System.out.println("---------------------");
        // 获取到空参数的eat方法
        Method eatMethod1 = clz.getMethod("eat");
        eatMethod1.invoke(p);  // p.eat()

        // 获取到需要一个String作为参数的eat方法   eat(String x)
        Method eatMethod2 = clz.getDeclaredMethod("eat", String.class);
        eatMethod2.setAccessible(true);
        eatMethod2.invoke(p, "西红柿鸡蛋");  // p.eat("西红柿鸡蛋");

        Method demoMethod = clz.getMethod("demo");
        demoMethod.invoke(p);   // p.demo();  使用实例对象调用静态方法
        demoMethod.invoke(null);  // Person.demo();
    }
}

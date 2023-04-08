package com.atguigu.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
使用类对象获取到构造方法
    getConstructors(): 获取到所有被public修饰的构造方法
    getConstructor(Class<?> ...paramTypes):  获取到指定的被public修饰的构造器
    getDeclaredConstructors(): 获取到所有的构造方法
    getDeclaredConstructor(Class<?> ...paramTypes):  获取到指定的构造器

获取到构造器以后，可以调用Constructor的newInstance()方法创建实例对象

除了调用构造器的newInstance()方法以外，还可以使用 Class的newInstance()方法创建实例对象

不推荐使用 clz.newInstance()方法创建实例对象，本质其实就是获取到空参构造方法以后，调用构造方法的newInstance()
 */
public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clz = Class.forName("com.atguigu.bean.Person");
       /*Object o = clz.newInstance();
        System.out.println(o);*/

        for (Constructor<?> c : clz.getConstructors()) {
            System.out.println(c);
        }
        System.out.println("----------------------");
        for (Constructor<?> c : clz.getDeclaredConstructors()) {
            System.out.println(c);
        }
        System.out.println("----------------------");
        Constructor<?> c1 = clz.getConstructor();  // 获取到被public修饰的空参数构造器
        System.out.println("c1 = " + c1);
        Object o1 = c1.newInstance();  // Person p1 = new Person();
        System.out.println(o1);

        // 获取被public修饰同时有两个String参数的构造器
        Constructor<?> c2 = clz.getConstructor(String.class, String.class);
        System.out.println("c2 = " + c2);
        Object o2 = c2.newInstance("jack", "上海");  // Person p2 = new Person("jack","上海");
        System.out.println(o2);

        Constructor<?> c3 = clz.getDeclaredConstructor(String.class, int.class);
        System.out.println("c3 = " + c3);
        c3.setAccessible(true);
        Object o3 = c3.newInstance("jerry", 18);  // Person p3 = new Person("jerry",18);
        System.out.println(o3);
        System.out.println("----------------------");
    }
}

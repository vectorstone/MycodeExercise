package com.atguigu.clz;

import com.atguigu.bean.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
类对象:  Person类, User类, Book类, Phone类 这些类我们可以再一次对他们分类，分为 Class类

获取到方法区类对象的方式:
1. 类名.class
2. 调用 实例对象.getClass()方法
3. 调用类加载器的 loadClass()方法
4. 调用 Class.forName()方法
*/
public class ClassDemo {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<Person> clz1 = Person.class;

        Person p = new Person();   // Person p = new Student();
        Class<? extends Person> clz2 = p.getClass();

        // ClassLoader classLoader = DownloadClient.class.getClassLoader();
        // 在JavaSE里，调用 ClassLoader.getSystemClassLoader()得到的结果就是 AppClassLoader
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        Class<?> clz3 = classLoader.loadClass("com.atguigu.bean.Person");

        Class<?> clz4 = Class.forName("com.atguigu.bean.Person");

        System.out.println(clz1 == clz2);
        System.out.println(clz2 == clz3);
        System.out.println(clz3 == clz4);


        /*com.atguigu.bean.Phone x = new com.atguigu.bean.Phone();
        x.call();*/
        Class<?> clz5 = Class.forName("com.atguigu.bean.Phone");
        Object o = clz5.newInstance();
        Method callMethod = clz5.getMethod("call");
        callMethod.invoke(o);

    }
}

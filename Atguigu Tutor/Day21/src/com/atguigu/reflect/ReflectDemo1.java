package com.atguigu.reflect;

import com.atguigu.bean.Person;

import java.lang.reflect.Field;

/*
反射研究的是 方法区里的类对象 也就是说获取到方法区的类对象以后可以 获取到成员变量，构造方法以及方法

获取成员变量:
    getFields(): 获取到所有被public修饰的成员变量
    getField(String name): 获取到指定的被public修饰的成员变量
    getDeclaredFields(): 获取到所有的成员变量，包括 public/protected/缺省/private
    getDeclaredField(String name): 获取到指定的成员变量

获取成员变量得到的结果是一个 Filed类型的对象，可以调用 Filed的set(Object obj,Object v)给实例对象设置属性值
通过 get(Object obj) 可以获取到一个对象的属性。  如果是一个静态成员变量, obj可以是 null
如果这个属性无法访问，需要调用setAccessible(true)设置强制访问
*/
public class ReflectDemo1 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class<Person> clz = Person.class;

        Person p = new Person();

        // 1. 通过类对象获取到成员变量
        Field genderField = clz.getField("gender");
        genderField.set(p, "male");  // p.setGender("male");
        System.out.println("----------------");

        Field[] fields = clz.getFields();
        for (Field f : fields) {
            System.out.println(f);
        }
        System.out.println("----------------");

        for (Field f : clz.getDeclaredFields()) {
            System.out.println(f);
        }
        System.out.println("----------------");

        Field nameField = clz.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(p, "jack"); // p.setName("jack");

        System.out.println(p);
        System.out.println(nameField.get(p));  // p.getName();

        Field yField = clz.getDeclaredField("y");
        yField.setAccessible(true);
        yField.set(null, 6);  // Person.y = 6;
        System.out.println(yField.get(null));  // Person.y
    }
}

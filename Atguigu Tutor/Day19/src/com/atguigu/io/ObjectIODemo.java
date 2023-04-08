package com.atguigu.io;

import com.atguigu.bean.Person;

import java.io.*;

/*
将对象转换成为 字符串(或者二进制)  进行 传输(或存储) 的过程称为序列化
将 二进制 或者 字符 加载成为 对象使用的过程称为 反序列化

ObjectOutputStream 对象输出流，可以将一个对象转换成为二进制存储到文件
ObjectInputStream  对象输入流，可以将一个二进制数据加载到内存成为一个对象

transient关键字修饰的成员变量并不会被序列化
*/
public class ObjectIODemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person p = new Person("jerry", 19, "北京", 1.76);

        FileOutputStream fos = new FileOutputStream("person.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // Java里的对象如果想要序列化，必须要实现 Serializable接口
        oos.writeObject(p);

        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("person.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Person x = (Person) ois.readObject();
        System.out.println(x.getName());
        System.out.println(x.getAge());
        System.out.println(x.getCity());

        ois.close();
        fis.close();
    }
}

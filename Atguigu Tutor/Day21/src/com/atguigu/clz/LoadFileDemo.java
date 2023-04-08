package com.atguigu.clz;

import com.atguigu.bean.Person;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/*
读取文件:
    1. IO流读取的文件，相对路径是从 项目的根目录开始的路径

无论使用的是 类加载器 是 类对象读取文件，前提是这个文件在编译以后在out文件夹里一定也存在
    2. 使用类加载器加载文件: 从当前模块编译以后模块的根目录开始查找
    3. 使用类对象加载文件: 从使用的类对象所在的.class文件开始找
推荐使用 类加载器 的方式读取文件
*/
public class LoadFileDemo {
    public static void main(String[] args) throws IOException {
        // FileInputStream fis = new FileInputStream("Day21/src/com/atguigu/clz/a.txt");

        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();

        // 使用类加载器读取文件
        InputStream x = systemClassLoader.getResourceAsStream("com/atguigu/clz/a.txt");
        System.out.println(x);

        // 使用类对象读取文件
        InputStream y = Person.class.getResourceAsStream("../clz/a.txt");
        System.out.println(y);

        InputStream z = ClassDemo.class.getResourceAsStream("a.txt");
        System.out.println(z);

        InputStream m = systemClassLoader.getResourceAsStream("b.txt");
        System.out.println(m);

        Properties prop = new Properties();
        prop.load(systemClassLoader.getResourceAsStream("db.properties"));
        System.out.println(prop);
    }
}

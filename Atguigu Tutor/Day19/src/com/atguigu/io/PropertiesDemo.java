package com.atguigu.io;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
HashTable是线程安全的，效率低;HashMap是线程不安全的，效率高
Properties继承自HashTable
*/
public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();

        // Properties 可以当做普通的 Map调用 put/get/remove等方法
        prop.put("齐天大圣", "孙悟空");
        /*prop.put("name", "root");
        prop.put("password", "Abcd1234");
        prop.put("db", "java0309");
        prop.put("port", 3306);*/

        // 通常使用 Properties会加载一个配置文件，通过配置文件设置键值对
        /*FileInputStream fis = new FileInputStream("db.txt");
        prop.load(fis);
        fis.close();*/
        FileReader reader = new FileReader("db.properties");
        prop.load(reader);
        reader.close();
        System.out.println(prop);

    }
}

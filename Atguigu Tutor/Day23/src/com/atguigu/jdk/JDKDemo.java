package com.atguigu.jdk;

import com.atguigu.bean.Student;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class JDKDemo {
    public void testGeneric() {
        List<Student> students = new ArrayList<>();

        // JDK9以后，匿名内部类里的泛型可以省略不写
        students.sort(new Comparator<>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
    }

    public void testTry() throws FileNotFoundException {
        // JDK7增加的 try...with...resources语句
        try (FileInputStream fis = new FileInputStream("1.txt");
             FileOutputStream fos = new FileOutputStream("2.txt")) {

        } catch (IOException e) {

        }

        // JDK9以后，创建IO流的代码可以写在try的外面
        FileInputStream f1 = new FileInputStream("1.txt");
        FileOutputStream f2 = new FileOutputStream("2.txt");
        try (f1; f2) {

        } catch (IOException e) {

        }
    }

    @Test
    public void testVar() {
        int a = 10;
        /*
         JDK10 以后，可以使用关键字 var 声明一个局部变量
         1. var只能声明一个局部变量,不能用在成员变量和形参上
         2. var声明的变量如果是整数，解释器会将它当做int类型
         3. var声明和赋值的代码不能分开写
         */

        var b = 10;
        byte x = 10;
        demo(x);

        int m;
        m = 5;

        /*var n;
        n = 7;*/
    }

    public void demo(byte a) {

    }

}

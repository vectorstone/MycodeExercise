package com.atguigu.pack;  // 第一行代码必须要是包的声明

import com.atguigu.oop.Person;
import com.atguigu.oop.StaticDemo;

/*
package 包可以理解为文件夹，遵守标识符的命名规则和规范
包名通常使用全小写，用公司域名倒写
如果一个类在包里，这个类里第一行代码需要是包的声明
不同的包里，可以出现同名的类
    com.atguigu.oop.Person
    com.atguigu.pack.Person

跨包访问一个类的方式:
    1. 使用包名.类名方式
    2. 使用 import 语句导入一个类
    3. 如果使用import导入的类和本包内的类重名，不能再使用到import导入的类
        此时如果想要访问 其他包里的类，需要使用 包名.类名访问
    4. 只有被public修饰的类才可以通过import导入到其他包里使用
    5. 导入一个类以后，并不是可以访问这个类里的所有资源。
        一个类里的成员变量(方法)是否能够被跨包访问，由这个成员变量(方法)的权限修饰符决定
    6. 静态导入(不推荐使用，慎用)
    7. java.lang 包里的类可以直接使用，不用使用 import语句导入
*/
import com.atguigu.oop.StaticDemo;
import com.atguigu.oop.Student;
import com.atguigu.oop.Person;
// import com.atguigu.oop.*;

// 静态导入可以直接导入一个类里的静态方法(属性) 不推荐
/*import static com.atguigu.oop.Student.test;*/

import static com.atguigu.oop.Student.job;
// import static com.atguigu.oop.Student.*;

public class PackageDemo {
    public static void main(String[] args) {
        com.atguigu.oop.MemberDemo memberDemo;
        StaticDemo demo;

        Person p = new Person();  // 本包里的Person类
        com.atguigu.oop.Person p1 = new com.atguigu.oop.Person();  // 访问其他包里的Person类

        Student s = new Student();
        // s.name = "jack";
        s.eat();

        Student.test();
        System.out.println(job);

        System.out.println();
        String x = "hello";

        // java.util.Scanner scanner = new java.util.Scanner(System.in);
    }
}

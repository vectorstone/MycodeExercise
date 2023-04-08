package com.atguigu.load;

import com.atguigu.bean.Person;
import sun.security.ec.CurveDB;
import sun.security.ec.ECKeyFactory;

import java.util.ArrayList;

/*类在什么情况下会别加载:
    1. 访问类里的静态成员变量或者调用静态方法,如果方法类里的静态成员常量，这个类不会被加载
    2. 使用类创建对象，会先加载这个类
    3. 子类加载之前会先加载父类
类只会被加载一次!

使用 类加载器 将硬盘上的.class文件 加载进内存的方法区
获取一个类的类加载器:  类名.class.getClassLoader()

BootstrapClassLoader 引导类加载器，用来加载系统的核心类库  String / System / ArrayList ... ...
    BootstrapClassLoader不是使用java代码写的，如果获取这个类加载器，得到的结果是 null
    JDK安装目录/jre/lib/rt.jar 压缩包里的 .class文件，都由 BootstrapClassLoader来加载
ExtClassLoader 扩展类加载器  jre/lib/ext 文件夹里所有的.class文件，都有 ExtClassLoader来加载
AppClassLoader 用户类加载器  自己写的类生成的 .class文件都由 AppClassLoader来加载


类加载器的关系:
    AppClassLoader父加载器是ExtClassLoader,ExtClassLoader父加载器是BootstrapClassLoader
    之间的父子关系不是通过 java里的继承来实现的

类加载器的双亲委派机制:  当要加载一个类时，并不会直接加载，而是找父类加载器来加载
*/
public class LoaderDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println(String.class.getClassLoader());
        System.out.println(ArrayList.class.getClassLoader());

        System.out.println(jdk.internal.dynalink.DynamicLinker.class.getClassLoader());

        ClassLoader appClassLoader = Person.class.getClassLoader();
        System.out.println(appClassLoader);
        System.out.println(appClassLoader.getParent());  // AppClassLoader的父加载器是ExtClassLoader

        // 使用类加载器加载一个类
        appClassLoader.loadClass("com.atguigu.bean.Person");

        appClassLoader.loadClass("java.lang.String");
        int x = Integer.valueOf("5");
        System.out.println(x);
    }
}

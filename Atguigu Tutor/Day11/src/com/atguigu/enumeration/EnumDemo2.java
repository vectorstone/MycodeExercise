package com.atguigu.enumeration;

import java.util.Scanner;

/*
JDK1.5新增了枚举类型，使用 关键字enum 定义一个枚举类型
    1. 枚举里创建实例对象，不能再使用 new 构造器() 方式，直接写实例对象变量名()即可
    2. 枚举里第一行代码需要将所有的实例对象全都列出，中间使用 , 进行分割
    3. 枚举里也可以定义构造方法，但是构造方法一定要被private修饰。如果不写，默认就被private修饰
    4. 使用  实例对象变量名() 就是调用空参数构造方法创建实例对象。
        如果调用的是空参数构造方法， () 可以省略
    5. 枚举重写了toString()方法，转换成为字符串，得到的结果是 实例对象的变量名
    6. 枚举默认继承自 Enum类，不能使用 extends继承其他的类

在枚举里列举枚举对象时，会调用父类的 Enum(String name,int ordinal)方法，将实例对象的变量名和编号赋给父类里的name和ordinal属性

枚举的常见非静态方法:
    name()/toString(): 获取到实例对象的变量名
    ordinal(): 获取到实例对象的编号，编号从 0 开始
枚举里的静态方法:
    valueOf(String name):根据实例对象变量名字符串获取到枚举实例对象
    values(): 获取到所有的枚举对象组成的数组
*/
public class EnumDemo2 {
    public static void main(String[] args) {
        Season x = Season.SPRING;
        System.out.println(x);
        x.demo();

        Season.AUTUMN.demo();

        System.out.println(Season.SPRING.name());
        System.out.println(Season.SPRING.toString());
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.AUTUMN);

        System.out.println(Season.WINTER.ordinal());

        Season a = Season.valueOf("AUTUMN");
        Season b = Season.AUTUMN;
        System.out.println(a == b);

        Season[] seasons = Season.values();

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入季节的英文单词:");
        String name = scanner.next();
        scanner.close();

        // byte/short/int/char/Byte/Short/Integer/Character/String/Enum
        Season y = Season.valueOf(name);
        switch (y) {
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
            default:
                System.out.println("输入有误");
                break;
        }
    }
}

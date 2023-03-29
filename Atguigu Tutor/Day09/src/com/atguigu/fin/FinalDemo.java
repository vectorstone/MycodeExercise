package com.atguigu.fin;

import com.atguigu.bean.Person;

import java.util.Arrays;

/*
final关键字的使用:
    可以用来修饰变量  /  方法  / 类

修饰变量: 被final修饰的变量称为常量，不允许修改
    从变量的数据类型区分:
        基本数据类型: 被final修饰的基本数据类型只能赋值一次，不允许修改
        引用数据类型: 被final修饰的引用数据类型只能指向一个对象，不允许再指向其他的对象，但是可以修改原来对象里的内容
    从变量的作用域区分:
        局部变量: 必须要赋值以后才能使用
        成员变量: 被final修饰的成员变量，没有默认值，必须要手动的赋值
            1. 定义时直接赋值
            2. 在构造代码块里赋值
            3. 在构造方法里赋值
            4. 使用 public static final int X = 5;
        被 static final修饰的静态成员常量，通常使用全大写，中间使用 _ 连接

修饰类: 被final修饰的类不能有子类(被继承)!
修饰方法: final修饰的方法不能被重写!
*/
public class FinalDemo {
    public static void main(String[] args) {
        final int a;
        a = 10;
        System.out.println(a);
        // a = 5;

        final int[] nums = {1, 2, 3};
        // nums = new int[]{4, 5, 6, 7};
        nums[0] = 4;
        nums[1] = 5;
        nums[2] = 6;
        System.out.println(Arrays.toString(nums));

        final Person p = new Person();
        // p = new Person();
        p.x = 6;


        FinalMember f1 = new FinalMember(3);
        FinalMember f2 = new FinalMember(9);
    }
}

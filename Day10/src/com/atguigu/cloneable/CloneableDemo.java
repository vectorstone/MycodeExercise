package com.atguigu.cloneable;

import com.atguigu.bean.Computer;
import com.atguigu.bean.Student;

/*
Cloneable接口: 如果要复制一个对象，可以调用对象的 clone()方法
1. 类重写 clone()方法，并将权限修饰符修改为public
2. 这个类还要实现 Cloneable接口
*/
public class CloneableDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("张三", 18, "上海", 80);
        Student s2 = s1;
        s1.setName("jerry");
        System.out.println(s2.getName());


        Student s3 = new Student("李四", 19, "北京", 90);
        // 创建一个 Student对象s4，内容和 s3一样，但是指向两个不同的内存空间
        Student s4 = s3.clone();
        // System.out.println(s4.getName() + "," + s4.getAge() + "," + s4.getScore() + "," + s4.getCity());
        s4.setName("jack");
        System.out.println(s3.getName());


        Computer c = new Computer("苹果", 8888);
        Student s5 = new Student("王五", 18, "上海", 80, c);
        Student s6 = s5.clone();

        s6.setName("tony");
        System.out.println(s5.getName());

        s6.getComputer().setPrice(9999);
        System.out.println(s5.getComputer().getPrice());
    }
}

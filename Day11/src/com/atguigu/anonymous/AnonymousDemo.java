package com.atguigu.anonymous;

import com.atguigu.bean.Student;

import java.util.Arrays;
import java.util.Comparator;

/*
匿名内部类: 通常用来简化接口
*/
public class AnonymousDemo {
    public static void main(String[] args) {
        Student[] students = {
                new Student("jack", 21, 1.8, 89),
                new Student("jerry", 22, 1.76, 90),
                new Student("henry", 21, 1.73, 80),
                new Student("merry", 19, 1.7, 85),
                new Student("tom", 20, 1.8, 78),
                new Student("anni", 18, 1.6, 59)
        };

        /*class AgeComparator implements Comparator<Student> {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        }
        Comparator<Student> c = new AgeComparator();
        Arrays.sort(students, c);*/

        /* 接口和抽象类不能直接创建实例对象
         1. 定义一个子类实现接口或者继承抽象类，然后实现所有的抽象方法，再创建子类对象
        2. 使用匿名内部类*/

        Comparator<Student> c = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        };

        // 对象c 类型并不是 Comparator类型，而是 Comparator的子类类型,子类没有名字!
        System.out.println(c.getClass());  //  class com.atguigu.anonymous.AnonymousDemo$1
        System.out.println(c instanceof Comparator);  // true

        Arrays.sort(students, c);
        System.out.println(Arrays.toString(students));


        // 匿名对象 + 匿名内部类
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getScore() - o2.getScore();
            }
        });

        /*Comparator<Student> c1 = new Comparator<>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getScore() - o2.getScore();
            }
        };
        mySort(students, c1);*/

        System.out.println(Arrays.toString(students));


        demo(new Student("jack", 18, 1.85, 78));
    }

    public static void mySort(Student[] ss, Comparator<Student> comparator) {
        for (int j = 0; j < ss.length - 1; j++) {
            for (int i = 0; i < ss.length - 1; i++) {

                if (comparator.compare(ss[i], ss[i + 1]) > 0) {
                    Student s = ss[i];
                    ss[i] = ss[i + 1];
                    ss[i + 1] = s;
                }
            }
        }
    }

    public static void demo(Student s) {
        if (s.isAdult()) System.out.println("成年了");
        else System.out.println("未成年");
    }
}

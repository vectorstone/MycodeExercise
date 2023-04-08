package com.atguigu.map;

import com.atguigu.bean.Student;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();
        Student s1 = new Student("jack", "上海", 18, 1.7, 90);
        Student s2 = new Student("tony", "北京", 17, 1.75, 94);
        Student s3 = new Student("jerry", "杭州", 20, 1.73, 89);

        String id1 = "001";
        String id2 = "002";
        String id3 = "003";
        students.put(id1, s1);
        students.put(id2, s2);
        students.put(id3, s3);

        id1.replace("0", "x");
        System.out.println(students.get(id1));

        System.out.println(students.get(id3));

        /*HashMap<Student, String> students = new HashMap<>();
        Student s1 = new Student("jack", "上海", 18, 1.7, 90);
        Student s2 = new Student("tony", "北京", 17, 1.75, 94);
        Student s3 = new Student("jerry", "杭州", 20, 1.73, 89);
        Student s5 = new Student("3Qj", "杭州", 20, 1.73, 89);

        String id1 = "001";
        String id2 = "002";
        String id3 = "003";
        String id5 = "005";
        students.put(s1, id1);
        students.put(s2, id2);
        students.put(s3, id3);
        students.put(s5, id5);

        // 新建了一个 s4和s2的属性一模一样
        Student s4 = new Student("tony", "北京", 17, 1.75, 94);
        String s = students.get(s4);
        System.out.println(s);  // 存入时使用的 s2对象的哈希值计算，获取时使用s4对象的哈希值


        System.out.println(students.get(s1));  // 001
        s1.setName("tom");
        System.out.println(students.get(s1));  // null

        System.out.println(students.get(s5));  // 005


        s5.setName("2qK");
        System.out.println(students.get(s5));*/
    }
}

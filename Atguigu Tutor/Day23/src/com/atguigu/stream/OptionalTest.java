package com.atguigu.stream;

import com.atguigu.bean.Student;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.function.Consumer;

public class OptionalTest {
    List<Student> students = new ArrayList<>();

    @Before
    public void before() {
        students.add(new Student("jack", 19, "上海", "男", 70));
        students.add(new Student("merry", 18, "北京", "女", 90));
        students.add(new Student("helen", 20, "南京", "女", 81));
        students.add(new Student("henry", 17, "杭州", "男", 58));
        students.add(new Student("tony", 18, "合肥", "男", 62));
        students.add(new Student("tom", 21, "苏州", "男", 59));
        students.add(new Student("lucy", 20, "石家庄", "女", 55));
        students.add(new Student("jerry", 20, "苏州", "男", 57));
        students.add(new Student("stack", 20, "苏州", "男", 51));
    }

    @Test
    public void testOptional() {
        /*如果 max返回的是一个Student类型的对象
        String name = student.stream().max(Comparator.comparingInt(Student::getScore)).getName();

        如果集合里没有数据，s的结果就是null 此时会报 NullPointerException

        Student s = student.stream().max(Comparator.comparingInt(Student::getScore));
        if(s != null) {System.out.println(s.getName())}
        */


        // Optional<Student> max = students.stream().max(Comparator.comparingInt(Student::getScore));
        students.stream().max(Comparator.comparingInt(Student::getScore)).
                ifPresent(s -> System.out.println(s.getName()));

        students.stream().filter(s -> s.getAge() >= 23).findFirst().ifPresent(s -> System.out.println(s.getName()));
        students.stream().filter(s -> s.getAge() >= 23).findFirst()
                .ifPresentOrElse(s -> System.out.println("第一个年龄大于等于23的学生姓名是" + s.getName()),
                        () -> System.out.println("没有数据"));
    }

    @Test
    public void test() {
        // 获取到男生里成绩小于60的学生，排序找到前三个的名字并打印
        String[] names = students.stream().filter(s -> s.getScore() < 60 && s.getGender().equals("男")).sorted((s1, s2) -> s2.getScore() - s1.getScore()).limit(3).map(Student::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(names));
    }
}

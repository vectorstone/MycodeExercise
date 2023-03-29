package com.atguigu.compare;

import com.atguigu.bean.Student;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();

        // 如果年龄相同，再按照成绩比较
        /*if (o1.getAge() - o2.getAge() != 0) return o1.getAge() - o2.getAge();
        return o1.getScore() - o2.getScore();*/
    }
}

package com.atguigu.jdk;

import com.atguigu.bean.Person;
import com.atguigu.bean.Student;
import com.atguigu.bean.Teacher;
import org.junit.Test;

public class InstanceOfDemo {
    @Test
    public void testInstanceOf() {
        Person p = new Student();

        if (p instanceof Student) {
           /* Student s = (Student) p;
            s.study();*/
            ((Student) p).study();
        }

        if (p instanceof Student s) {
            s.study();
        }
    }
}

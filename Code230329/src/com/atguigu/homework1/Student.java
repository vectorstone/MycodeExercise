package com.atguigu.homework1;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/29/2023 7:58 PM
 */
public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private double score;

    public Student() {

    }

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student [" +
                "name=" + name +
                ", age=" + age +
                ", score=" + score +
                ']';
    }

    @Override
    public int compareTo(Student o) {
        if(score > o.score) {
            return -1;
        }
        else if(score < o.score) {
            return 1;
        }else {
            if(age > o.age) {
                return 1;
            }else {
                return -1;
            }
        }

    }
}

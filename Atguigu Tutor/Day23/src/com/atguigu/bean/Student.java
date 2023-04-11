package com.atguigu.bean;

import java.util.Objects;

public class Student extends Person {

    private int score;

    public Student() {
    }

    public Student(String name, int age, String city, String gender, int score) {
        super(name, age, city, gender);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student s = (Student) o;
        return Objects.equals(getName(), s.getName()) &&
                getAge() == s.getAge() &&
                Objects.equals(getCity(), s.getCity()) &&
                Objects.equals(getGender(), s.getGender()) &&
                score == s.score;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getCity(), getGender(), score);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", city='" + getCity() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", score=" + getScore() +
                '}';
    }

    public void study() {
        System.out.println("学生正在学习");
    }
}

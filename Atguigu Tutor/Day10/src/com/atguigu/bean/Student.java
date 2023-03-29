package com.atguigu.bean;

public class Student extends Person implements Cloneable {
    private int score;
    private Computer computer;

    public Student() {
    }

    public Student(String name, int age, String city, int score) {
        super(name, age, city);
        this.score = score;
    }

    public Student(String name, int age, String city, int score, Computer computer) {
        super(name, age, city);
        this.score = score;
        this.computer = computer;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        Student cloneStudent = (Student) (super.clone());
        if (computer != null) {
            cloneStudent.setComputer(computer.clone());
        }
        return cloneStudent;
    }

    @Override
    public String toString() {
        return "Student{" +"name='"+getName()+"', age="+getAge()+", city='"+getCity()+
                "', score=" + score +
                ", computer=" + computer +
                '}';
    }
}

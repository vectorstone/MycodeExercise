package com.atguigu.exercise;

public class Exercise1 {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Person();
        Person person = new Person();
        Teacher teacher = new Teacher();
        Student student = new Student();
        System.out.println("(1)" + animal1.show(person));  // A and A
        System.out.println("(2)" + animal2.show(student)); // A and D
        System.out.println("(3)" + person.show(teacher)); // B and B
        System.out.println("(4)" + person.show(student));  // A and D
    }
}

class Animal {
    public String show(Student obj) {
        return ("A and D");
    }

    public String show(Animal obj) {
        return "A and A";
    }
}

class Person extends Animal {
    public String show(Animal obj) {  // Animal obj = teacher;
        return "B and A";
    }
    public String show(Person obj) {  // Person obj = teacher;
        return "B and B";
    }
}

class Teacher extends Person {

}

class Student extends Person {

}

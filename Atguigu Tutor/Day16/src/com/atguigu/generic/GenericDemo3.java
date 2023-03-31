package com.atguigu.generic;

import com.atguigu.bean.Animal;
import com.atguigu.bean.Person;
import com.atguigu.bean.Phone;
import com.atguigu.bean.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/*
泛型通配符和泛型的上下限

? 表示的是泛型通配符，表示任意类型，可以将它理解为 Object，但是它不是 Object类型。
    泛型里不支持多态的写法，如果想要表示任意类型，可以使用 泛型通配符?表示

? super T: 泛型的下限，表示 T类型以及T类型的父类
? extends T: 泛型的上限，表示T类型以及T类型的子类
*/
public class GenericDemo3 {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        List<Person> people = new ArrayList<Person>();
        List<Student> students = new ArrayList<Student>();
        List<Phone> phones = new ArrayList<Phone>();

        demo1(animals);
        demo1(people);
        demo1(students);
        demo1(phones);

        demo2(animals);
        demo2(people);
        // demo2(students);

        // demo3(animals);
        demo3(people);
        demo3(students);

        demo4(phones);
        // demo4(students);

        demo7(new Person());
        demo7(new Student());

        MyGeneric<String> mg = new MyGeneric<>();
    }

    public static void demo1(List<?> list) {

    }

    public static void demo2(List<? super Person> list) {
    }

    public static void demo3(List<? extends Person> list) {

    }

    public static void demo4(List<? extends Comparable> list) {
    }

    public static <T> void demo5(List<T> list) {

    }

    public static <T extends Person> void demo7(T t) {
    }

    /*public static <T> void demo8(T t) {

    }*/
    public static void demo6(List<?> list) {

    }
    /*public static void demo8(? x) {

    }*/
    public static <T> void test1(Collection<T> coll,T t){
        coll.add(t);
    }
   /* public static void test2(Collection<?> coll){
       coll.add("hello");
       coll.add(1);
       coll.add(1.0);
    }*/
}

class MyGeneric<G> {
    public void test1(G g) {

    }

    public G test2() {
        return null;
    }
}

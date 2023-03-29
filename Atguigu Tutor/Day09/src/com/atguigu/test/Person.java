package com.atguigu.test;

public class Person {
    private String name;
    private Dog dog;

    public Person(String name, Dog dog) {
        this.name = name;
        this.dog = dog;
    }

    public void workWithDog() {
        /*if (this.dog.getClass() == PoliceDog.class) {
            ((PoliceDog) this.dog).attackEnemy();
        }else if (this.dog.getClass() == SearchDog.class) {

        }*/
        this.dog.work();//这个地方写成dot.work();也可以
    }
}

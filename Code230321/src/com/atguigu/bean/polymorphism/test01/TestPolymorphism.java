package com.atguigu.bean.polymorphism.test01;

/**
 * @Description: 测试多态
 * @Author: Gavin
 * @Date: 3/21/2023 7:10 PM
 */
public class TestPolymorphism {
    public static void main(String[] args) {
        dog dd = new DrugDog("缉毒犬","黄黑色");
        dog sd = new SearchDog("搜救犬","黑色");
        dog pd = new PoliceDog("警犬","白色");
        Person p1 = new Person("王警官",dd);
        Person p2 = new Person("李警官",pd);
        Person p3 = new Person("张警官",sd);
        p1.workWithDog();
        p2.workWithDog();
        p3.workWithDog();
    }
}

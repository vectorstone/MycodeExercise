package com.atguigu.question13;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/24/2023 9:55 PM
 */
public class Test13 {
    public static void main(String[] args) {
        Employee e = new Employee(1,"张三",29,5000.0);
        Programmer p = new Programmer(2,"李四",30,8000,"java");
        Designer d = new Designer(3,"王五",33,10000.0,"java",15000.0);
        Architect a = new Architect(4,"jack",40,20000.0,"java",20000.0,5000);
        System.out.println(e.getInfo());
        System.out.println(p.getInfo());
        System.out.println(d.getInfo());
        System.out.println(a.getInfo());
    }
}

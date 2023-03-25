package com.atguigu.homework1;

/**
 * @Description: 成员变量基础题_员工
 * @Author: Gavin
 * @Date: 3/18/2023 7:18 PM
 * 案例需求:
 * (1)声明员工类Employee,包含属性: 编号,姓名,年龄,薪资
 * (2)在测试类的main方法中,创建2个员工对象,并为属性赋值,并打印两个员工的信息
 */
public class HomeWork {
    public static void main(String[] args) {
        //创建员工对象,并赋值
        Employee s1 = new Employee(1,"张三",25,8000.0);
        Employee s2 = new Employee(2,"李四",35,11000.0);

        //打印两个员工的信息
        System.out.println("第1个员工的编号:"+s1.getNumber()+",姓名:"+s1.getName()+",年龄:"+s1.getAge()+",薪资:"+s1.getSalary());
        System.out.println("第2个员工的编号:"+s2.getNumber()+",姓名:"+s2.getName()+",年龄:"+s2.getAge()+",薪资:"+s2.getSalary());
    }
}

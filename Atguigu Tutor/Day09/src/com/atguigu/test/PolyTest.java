package com.atguigu.test;

/*
使用多态优化 Person代码结构
 */
public class PolyTest {
    public static void main(String[] args) {
        PoliceDog pd = new PoliceDog("黑背", "黑色");
        Person p1 = new Person("张警官", pd);
        p1.workWithDog();

        SearchDog sd = new SearchDog("金毛", "黄色");
        Person p2 = new Person("王消防员", sd);
        p2.workWithDog();

        DrugDog dd = new DrugDog("来福", "黑色");
        Person p3 = new Person("李警官", dd);
        p3.workWithDog();

        LeadingDog ld = new LeadingDog("旺财", "白色");
        Person p4 = new Person("张三", ld);

        p4.workWithDog();

        System.out.println("p4 = " + p4);
    }
}

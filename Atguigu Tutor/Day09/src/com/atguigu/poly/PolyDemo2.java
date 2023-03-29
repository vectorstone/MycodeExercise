package com.atguigu.poly;

/*
不使用多态代码会变得非常的冗余
 */
public class PolyDemo2 {
    public static void main(String[] args) {
        PoliceDog pd = new PoliceDog("黑背", "黑色");
        Person p1 = new Person("张警官", pd);
        p1.workWithPD();
        p1.workWithSD();

        SearchDog sd = new SearchDog("金毛", "黄色");
        Person p2 = new Person("王消防员", sd);
        p2.workWithSD();
        p2.workWithPD();

        DrugDog dd = new DrugDog("来福", "黑色");
        Person p3 = new Person("李警官", dd);
        p3.workWithDD();
    }
}

package com.atguigu.test;

import com.atguigu.test.impl.workabledog.DrugDog;
import com.atguigu.test.impl.workabledog.LeadingDog;
import com.atguigu.test.impl.workabledog.PoliceDog;
import com.atguigu.test.impl.workabledog.SearchDog;
import com.atguigu.test.impl.workablehorse.SportsHorse;

/*
使用多态优化 Person代码结构
 */
public class PolyTest {
    public static void main(String[] args) {
        PoliceDog pd = new PoliceDog("黑背", "黑色");
        Person p1 = new Person("张警官", pd);
        p1.workWithWorkable();

        SearchDog sd = new SearchDog("金毛", "黄色");
        Person p2 = new Person("王消防员", sd);
        p2.workWithWorkable();

        DrugDog dd = new DrugDog("来福", "黑色");
        Person p3 = new Person("李警官", dd);
        p3.workWithWorkable();

        LeadingDog ld = new LeadingDog("旺财", "白色");
        Person p4 = new Person("张三", ld);
        p4.workWithWorkable();


        SportsHorse sh = new SportsHorse("赤兔","红色","跑马场");
        Person p5 = new Person("王运动员", sh);
        p5.workWithWorkable();
    }
}

package com.atguigu.exercise.reference01;

import org.junit.Test;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/10/2023 9:11 PM
 * 构造器的引用
 */
public class Reference04 {
    public void constructor(String q,int w,String e,String r,D d){
        Person person = d.dFunction(q, w, e, r);
        person.eat();
    }
    @Test
    public void testReference(){
        constructor("张三", 29, "上海", "男", new D() {
            @Override
            public Person dFunction(String a, int b, String m, String n) {
                return new Person(a,b,m,n);
            }
        });
        //简化
        constructor("张三", 29, "上海", "男",(a,b,m,n)->new Person(a,b,m,n));
        //再进行简化
        constructor("张三", 29, "上海", "男",Person::new);
    }
}
interface D {
    Person dFunction(String a,int b,String m,String n);
}

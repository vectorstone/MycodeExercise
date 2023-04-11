package com.atguigu.exercise.reference01;

import org.junit.Test;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/10/2023 8:39 PM
 * 还是测试类名::实例方法名  接口的抽象方法需要一个实例对象a作为参数,并且实现抽象方法的时候调用了实例对象a的方法
 */
public class Reference03 {
    Person p = new Person("张三",29,"上海","男");

    public void reference03(Person a,String s,C c){
        c.cFunction(a,s);
    }
    @Test
    public void TestReference03(){
        //内部匿名类的写法
        reference03(p, "床上", new C() {
            @Override
            public void cFunction(Person b, String x) {
                b.sleep(x);
            }
        });
        //简化写法
        reference03(p,"床上",(b,x)->b.sleep(x));
        //类名::实例方法名的写法
        reference03(p,"床上",Person::sleep);
    }
}
interface C {
    void cFunction(Person b,String x);
}

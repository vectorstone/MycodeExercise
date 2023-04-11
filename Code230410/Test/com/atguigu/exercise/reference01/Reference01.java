package com.atguigu.exercise.reference01;

import org.junit.Test;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/10/2023 8:17 PM
 * 测试几种lambda表达式简化的练习
 * 接口的抽象方法没有用到对象a,只是在实现抽象方法时，调用到了对象a的实例方法,同时a实例方法的形参和抽象方法的形参一致
 */
public class Reference01 {
    //先创建一个person对象
    Person p = new Person("张三",29,"上海","男");
    //来一个方法测试对象名::实例方法名的测试
    public void referenceDemo1(String s,A a){
        a.aFunction(s);
    }

    //测试这个方法
    @Test
    public void TestReferenceDemo01(){
        //01匿名内部类的写法
        referenceDemo1("地上", new A() {
            @Override
            public void aFunction(String s) {
                p.sleep(s);
            }
        });
        //02简化的写法
        referenceDemo1("地上",s->p.sleep(s));
        //03 类名::实例方法名的写法
        referenceDemo1("地上",p::sleep);
    }
}
interface A {
    void aFunction(String s);
}

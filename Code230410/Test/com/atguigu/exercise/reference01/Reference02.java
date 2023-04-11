package com.atguigu.exercise.reference01;

import org.junit.Test;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/10/2023 8:31 PM
 * 测试类名:: 实例方法名
 * 接口的抽象方法需要一个实例对象a作为参数，实现抽象方法时，调用了a对象的实例方法,同时a对象的实例方法形参和抽象方法的形参一致
 */
public class Reference02 {
    //创建实例对象
    Person p = new Person("张三",29,"上海","男");

    //再来个方法
    public void TestReference(Person p,B b){
        b.bFunction(p);
    }
    @Test
    //匿名内部类的写法
    public void Test(){
        TestReference(p, new B() {
            @Override
            public void bFunction(Person p) {
                p.eat();
            }
        });
        //lambda简化写法
        TestReference(p,(x)->x.eat());
        //类名::实例方法名的写法
        TestReference(p,Person::eat);
    }
}
interface B{
    void bFunction(Person p);
}

package com.atguigu.exercise.reference01;

import org.junit.Test;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/10/2023 9:18 PM
 * 数组引用 类名[]::new
 * 实现抽象方法时,创建了一个数组,长度正好是抽象方法的形参
 * 要求:抽象方法必须要返回一个数组
 */
public class Reference05 {

    public String[] testArrayReference(int a,String s,E e){
        String[] s1 = e.eFunction(a);
        for (int i = 0; i < s1.length; i++) {
            s1[i] = s;
        }
        return s1;
    }
    @Test
    public void test(){
        testArrayReference(5, "a", new E() {
            @Override
            public String[] eFunction(int m) {
                return new String[m];
            }
        });
        //简化写法
        testArrayReference(5,"a",m->new String[m]);
        //使用数组引用
        for (String a : testArrayReference(5, "a", String[]::new)) {
            System.out.println(a);
        }
    }
}
interface E{
    String[] eFunction(int m);
}

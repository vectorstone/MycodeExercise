package com.atguigu.exercise;

import java.lang.reflect.Field;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/8/2023 1:13 PM
 */
public class DBDemo {
    public static void main(String[] args) {

    }

    public static String getSql(Class<?> clz){
        //开头的字段内容
        StringBuilder sb = new StringBuilder("select");

        //中间需要拼接的内容
            //先获取所有的字段组成的Filed数组
        Field[] fields = clz.getDeclaredFields();


    }
}

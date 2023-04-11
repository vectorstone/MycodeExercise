package com.atguigu.exercise;

import java.lang.reflect.Field;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/8/2023 1:13 PM
 */
public class DBDemo {
    public static void main(String[] args) {
        String sql = getSql(User.class);
        System.out.println(sql);

    }

    public static String getSql(Class<?> clz) {
        // 开头的字段内容
        StringBuilder sb = new StringBuilder("select ");

        // 中间需要拼接的内容
        // 先获取所有的字段组成的Filed数组
        Field[] fields = clz.getDeclaredFields();
        // 循环确认每个field是否有注解,如果有注解,注解拿取注解的内容,否则直接使用field的名字
        for (int i = 0; i < fields.length; i++) {
            // 获取到每一个field
            String fieldName = fields[i].getName();
            // 获取每个field的注解,类名.class获取class对象
            Column columnAnnotation = fields[i].getAnnotation(Column.class);

            //判断是否有注解,如果有直接替换fieldNmme
            if(columnAnnotation != null){
                fieldName = columnAnnotation.columnName();
            }
            //将获取到的fieldName加到sb数组中
            sb.append(fieldName);
            //每个field后面要有",",除了最后一个
            if(i != fields.length -1){
                sb.append(",");
            }
        }

        //获取表头名,并且全部转换为小写
        String tableName = clz.getSimpleName().toLowerCase();
        Table tableAnnotation = (Table) clz.getAnnotation(Table.class);
        /*
        * 为什么要强制类型转换
        * 如果不强制转换那么代码这样写Annotation test = clz.getAnnotation(Table.class);
        * test是Annotation类型的,编译看左边,运行看右边,多态,调用value方法的时候出问题
        * Annotation里面没有这个方法,所以必须进行强制类型转换
        * */


        if(tableAnnotation != null){
            tableName = tableAnnotation.value();
        }

        //增加from
        sb.append(" from ").append(tableName);

        return sb.toString();
    }
}

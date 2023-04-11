package com.atguigu.db;


import com.atguigu.bean.Movie;
import java.lang.reflect.Field;

/*
数据库查询语句:  select id,username,password,gender,balance from user;
*/
public class DBDemo {
    public static void main(String[] args) {
        String sql = getSql(Movie.class);
        System.out.println(sql);
    }

    public static String getSql(Class<?> clz) {
        StringBuilder sb = new StringBuilder("select ");
        // 中间的字段
        Field[] fields = clz.getDeclaredFields();  // 获取到所有的字段组成的Filed数组
        for (int i = 0; i < fields.length; i++) {
            String fieldName = fields[i].getName();  // 遍历获取到每一个字段名

            Column columnAnnotation = fields[i].getAnnotation(Column.class);
            if (columnAnnotation != null) {
                fieldName = columnAnnotation.columnName();
            }
            sb.append(fieldName);   // 将字段名添加到SQL字符串
            if (i != fields.length - 1) {
                sb.append(",");
            }
        }

        // 获取到表名:表名有可能和类名一样，也有可能不一致
        String tableName = clz.getSimpleName().toLowerCase();
        Table tableAnnotation = (Table) clz.getAnnotation(Table.class);
        if (tableAnnotation != null) {
            tableName = tableAnnotation.value();
        }

        sb.append(" from ").append(tableName).append(";");
        return sb.toString();
    }
}

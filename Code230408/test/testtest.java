import com.atguigu.exercise.Column;
import com.atguigu.exercise.Table;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/9/2023 3:58 PM
 */
public class testtest {
    @Test
    public void test(){
        String sql = getSql(String.class);
        System.out.println(sql);
    }


    public static String getSql(Class<?> clz){
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
        //Table tableAnnotation = (Table) clz.getAnnotation(Table.class);为什么要强制类型转换
        // Table tableAnnotation = clz.getAnnotation(Table.class);
        Annotation test = clz.getAnnotation(Table.class);

        /*if(test != null){
            tableName = test
        }
        if(tableAnnotation != null){
            tableName = tableAnnotation.value();
        }*/

        //增加from
        sb.append(" from ").append(tableName);

        return sb.toString();
    }
}

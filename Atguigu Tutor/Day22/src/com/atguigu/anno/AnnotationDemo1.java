package com.atguigu.anno;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
注解的使用:
    1. 文档注释可以对类以及方法进行注释
        文档注释里的注解，可以被javadoc命令编译生成文档
        @param  @return @throws  @exception @since  @deprecated
    2. JDK内置注解
        @Deprecated: 被它标记的类/方法/成员变量等表示为废弃的，不建议使用的
        @FunctionalInterface: 函数式接口注解，用在接口上，表示这个接口里只能有一个抽象方法
        @SuppressWarnings:抑制警告(慎用)
        @Override: 用来标记方法重写
    3. 元注解: 用在注解上的注解
    4. 自定义注解: 对元注解的使用
*/

public class AnnotationDemo1 {
    int x;

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Date d = new Date();
        int x = d.getYear();

        List<String> list = new ArrayList();
    }

    /**
     * 用来求两个数字相除的结果
     *
     * @param a 被除数
     * @param b 除数
     * @return a除以b的结果
     * @throws ArithmeticException 如果b等于0,会抛出异常
     * @author 张三
     * @since 1.0
     * @deprecated 从2.0版本开始废弃，推荐使用 XXX方法替代
     */
    @Deprecated
    public int divide(int a, int b) {
        return a / b;
    }
}

package com.atguigu.anno;

/*
源码 -->.class字节码 --> 运行时

@Deprecated 注解可以用在类上，方法上，成员变量上； 保留到运行时阶段;  会在文档里保留
@Override 注解 只能用在方法上；                只在源码阶段保留;  不会在文档里保留

通过元注解可以对注解进行标记，让不同注解产生区别:
    同样都是注解，使用的范围是不同的;保留的时间也不同; 有的会生成文档，有的不会生成文档

常见的元注解: 用在注解上的注解称为元注解
@Target:注解的使用范围
@Retention:注解的保留时间
@Documented: 标记了@Document注解的注解才会被生成完档
@Inherited:  标记了 @Inherited注解的注解会被继承
*/
public class AnnotationDemo2 {
    @Deprecated
    int x;

    @Deprecated
    public AnnotationDemo2() {

    }

    @Deprecated
    public void demo(@Deprecated float f) {

    }

    @Override
    public String toString() {
        @Deprecated
        int a = 5;
        return super.toString();
    }
}

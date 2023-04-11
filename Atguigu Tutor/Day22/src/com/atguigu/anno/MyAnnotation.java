package com.atguigu.anno;

/*
自定义注解:  @interface 注解名
如果不指定使用范围，默认注解在任意的位置都可以使用

@Target 表示注解的使用范围, value是一个数组，可选值是 ElementType类型的枚举
    @Target(value={ElementType.Type,ElementType.FIELD})
    如果一个 注解里，只有一个 value()方法，此时 value=可以省略
    如果值是一个数组，但是数组里只有一个元素， {} 可以省略

@Retention 表示注解的保留时间,value变量是 RetentionPolicy类型，可选值
    RetentionPolicy.SOURCE: 注解只在源代码保留，编译生成.class文件时，注解就会丢失!
    RetentionPolicy.CLASS: 注解会保留到.class字节码文件，使用类加载器将.class文件加载到内存开始运行，注解就丢失
        如果不指定 Retention,默认就是保留策略就是 CLASS
    RetentionPolicy.RUNTIME: 注解会保留到运行时,只有运行时的注解才能使用代码读取

@Documented 使用Javadoc命令生成文档时，会保留
@Inherited 注解可以自动的被子类继承
*/

import com.atguigu.anno.my.One;
import com.atguigu.anno.my.Two;

@One
public class MyAnnotation {
    @One
    int x = 5;

    @One
    public void demo(@One int x) {

    }

    @Two
    public void test() {

    }
}

class Son extends MyAnnotation {

}
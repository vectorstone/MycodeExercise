package com.atguigu.stream;

import org.junit.Test;

import java.util.Optional;

/*
出现的意义: 可以避免Java里经常出现的空指针异常

Optional类是一个容器，用来存入一个数据
of(T t): 将一个T类型的对象t存入到Optional里.不能存入一个null
ofNullable(T t): 将一个T类型的对象t存入到Optional里，可以存入一个null
empty(): Optional里存入的是null
get(): 从 Optional里获取到数据，如果Optional里存入的是null,会报NoSuchElementException异常

orElse(T t): 如果 Optional里的数据是null,返回 t
orElseGet(Supplier<T> supplier): 如果 Optional里的数据是null，返回 supplier.get()的结果
orElseThrow(Supplier<T> supplier): 如果 Optional里的数据是null,会抛出异常
isPresent(): 判断Optional里的数据是否是空
ifPresent(Consumer<T> consumer): 如果Optional里的数据不是null,会执行 consumer.accept()方法
*/
public class OptionalDemo {
    @Test
    public void testOptional() {
        String x = "good";
        Optional<String> optional = Optional.ofNullable(x);


       /* String s = optional.orElseGet(new Supplier<String>() {
            @Override
            public String get() {
                return "yes";
            }
        });*/

        String s1 = optional.orElseGet(() -> "yes");
        System.out.println(s1);

        String s2 = optional.orElse("ok");
        System.out.println(s2);

        /*optional.orElseThrow(new Supplier<RuntimeException>() {
            @Override
            public RuntimeException get() {
                return new RuntimeException("没有值");
            }
        });*/
        // optional.orElseThrow(() -> new RuntimeException("没有值"));

        System.out.println(optional.isPresent());

        optional.ifPresent(System.out::println);
    }
}

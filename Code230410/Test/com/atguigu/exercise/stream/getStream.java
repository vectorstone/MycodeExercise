package com.atguigu.exercise.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/10/2023 9:52 PM
 * 获取流的几种方式
 */
public class getStream {
    public void gerStream() {
        // 1.数组源
        // 使用Arrays.stream()方法获取到一个Stream对象
        String[] words = {"hello", "good", "OK", "hi"};
        Stream<String> stream = Arrays.stream(words);

        int[] arr = {1, 2, 3, 4, 5};
        IntStream stream1 = Arrays.stream(arr);

        // 2.集合源
        // 使用list.stream()获取到一个Stream对象
        List<String> list = new ArrayList<>();
        Stream<String> stream2 = list.stream();

        // 3.调用Stream的静态方法获取一个Stream对象
        // 3.1 Stream.of(T. . . t)
        Stream<String> words1 = Stream.of(words);

        // 注意这个方法不要直接传入一个基本数据类型的数组,否则得到的不是元素,而是数组
        Stream<int[]> arr1 = Stream.of(arr);
        // 注意看上面arr1这个Stream的泛型int[],说明获得的流是一个数组类型
        // 如果是基本类型的数组要么直接调用Arrays.stream(),要么对数组装箱
        Integer[] integers = {1, 2, 3, 4, 5};
        Stream<Integer> integers1 = Stream.of(integers);

        // 3.2 Stream.generate()
        // 利用Stream.generate()生成一个无限流
        Stream<Double> generate = Stream.generate(new Supplier<Double>() {
            @Override
            public Double get() {
                return Math.random();
            }
        });
        // lambda表达式的简化1
        Stream.generate(() -> Math.random());
        // lambda表达式的简化2
        Stream.generate(Math::random);

        // 3.3 Stream.iterate()
        //seed这个参数相当于一个起始点,后面UnaryOperator就是一个规则,可以自定义实现的方式
        Stream<Integer> iterate = Stream.iterate(3, new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer + 2;
            }
        });
        //lambda简化写法1
        Stream<Integer> iterate1 = Stream.iterate(3, i -> i + 2);
        iterate.forEach(System.out::println);
    }
}

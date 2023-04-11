package com.atguigu.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
forEach() / removeIf() / Comparator.comparingInt()

StreamAPI: 是真正的将 lambda表达式融入到 Java语言里的这一套 方法
用来操作 数组 或者 集合 元素的一套 ApplicationProgrammingInterface

有一个数组/集合存储了10个学生，获取到男生里成绩小于60的学生，排序找到前三个的名字并打印

Stream的操作步骤:
    1. 从数据源(数组/集合) 获取到Stream流
    2. 操作Stream流
        2.1 中间操作
        2.2 终结操作


获取流的方式:
    1. 如果是一个数组，调用 Arrays.stream(数组) 获取到数组的流
    2. 如果是一个Collection,直接调用 Collection接口里的 stream()方法
    3. 调用Stream的静态方法，也可以获取到一个Stream对象
        3.1 Stream.of(T...t): 不要传入一个基本数据类型的数组
            int[] arr = new int[]{1, 2, 3}
            Stream.of(arr) 获取到的流存储的不是数字，而是数组
            如果数据源是一个基本数据类型的数组，直接调用 Arrays.stream()
        3.2 Stream.generate()
        3.3 Stream.iterate()

*/
public class StreamDemo1 {
    // 获取到一个 Stream对象,首先需要一个数据源 数组/集合

    public void streamFromArray() {
        // 通过数组数据源 获取到一个 Stream对象
        String[] words = {"hello", "good", "ok", "yes"};

        // 通过 Arrays.stream()方法可以获取到一个 Stream对象
        Stream<String> stream = Arrays.stream(words);

        stream.forEach(System.out::println);

        int[] nums = {1, 2, 3};
        IntStream stream1 = Arrays.stream(nums);
    }

    public void collectionToStream() {
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();
    }

    public void stream() {
        Stream<String> hello = Stream.of("hello", "good", "ok");
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);

        String[] words = {"ok", "yes", "hi"};
        Stream<String> x = Stream.of(words);

        int[] nums = {1, 2, 3, 4, 5};
        Stream<int[]> nums1 = Stream.of(nums);

        Integer[] arr = {1, 2, 3, 4, 5};
        Stream<Integer> arr1 = Stream.of(arr);
    }

    @Test
    public void infiniteStream() {
        /*Stream<Double> s = Stream.generate(new Supplier<Double>() {
            @Override
            public Double get() {
                return Math.random();
            }
        });*/
        // Stream<Double> s = Stream.generate(() -> Math.random());

        // generate生成一个无限流
        Stream<Double> s = Stream.generate(Math::random);  // 类名::静态方法名
        s.forEach(System.out::println);

        Stream<Integer> x = Stream.iterate(3, new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer i) {
                return i + 2;
            }
        });
        x.forEach(System.out::println);
    }

    @Test
    public void test1() {
        streamFromArray();
    }

}

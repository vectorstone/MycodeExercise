package com.atguigu.exercise.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/10/2023 11:18 PM
 * 用来练习终结流的常用方法
 */
public class EndStream {
    List<Student> s = new ArrayList<>();

    @Before
    public void before() {
        s.add(new Student("gavin", 19, "上海", "男", 70));
        s.add(new Student("nancy", 18, "北京", "女", 90));
        s.add(new Student("helen", 20, "南京", "女", 81));
        s.add(new Student("henry", 17, "杭州", "男", 58));
        s.add(new Student("tony", 18, "合肥", "男", 62));
        s.add(new Student("tom", 21, "苏州", "男", 59));
        s.add(new Student("lucy", 20, "石家庄", "女", 55));
        s.add(new Student("jerry", 20, "苏州", "男", 57));
        s.add(new Student("stack", 20, "苏州", "男", 51));
    }

    @Test
    public void testEndStream() {
        // 1. all/any/noneMatch(Predicate filter)
        // 判断流中的所有元素是否符合Predicate条件,结果是false,不是所有的学生年龄都大于20
        System.out.println(s.stream().allMatch(new Predicate<Student>() {
            @Override
            public boolean test(Student student) {
                return student.getAge() > 20;
            }
        }));
        // 1.1 简写方式
        System.out.println(s.stream().allMatch(s -> s.getAge() > 20));

        //anyMatch
        System.out.println(s.stream().anyMatch(s -> s.getAge() > 20)); // true
        //noneMatch
        System.out.println(s.stream().noneMatch(s -> s.getScore() < 60));  // false
        // 2. findFirst() / findAny():
        System.out.println(s.stream().findFirst());  // Optional[Student{name='gavin', age=19, city='上海', gender='男', score=70}]
        System.out.println(s.stream().findAny());  // Optional[Student{name='gavin', age=19, city='上海', gender='男', score=70}]
        // 3. forEach(Consumer<T> consumer):

        // 4. count():
        System.out.println(s.stream().filter(s -> s.getScore() < 60).count());
        // 5. max(Comparator c)/min(Comparator c):
        System.out.println(s.stream().max(Comparator.comparingInt(Student::getAge)));
        System.out.println(s.stream().min(Comparator.comparingInt(Student::getScore)));
        // 6. reduce():
        //对所有学生的成绩进行求和运算
        OptionalInt reduce1 = s.stream().mapToInt(new ToIntFunction<Student>() {
            @Override
            public int applyAsInt(Student value) {
                return value.getScore();
            }
        }).reduce(new IntBinaryOperator() {

            @Override
            public int applyAsInt(int left, int right) {
                return left + right;
            }
        });
        //6.1 lambda方法引用的写法
        OptionalInt reduce = s.stream().mapToInt(Student::getScore)./*maptoInt方法获取int类型的流*/
                reduce(Integer::sum);/*Integer里面的sum静态方法引用*/
        System.out.println(reduce1);
        // 7. collect():
        //注意collect(Collectors.toList())这个方法,有点奇怪
        List<Student> collect = s.stream().filter(s -> s.getScore() < 60).collect(Collectors.toList());
        // List<Student> collect = s.stream().filter(s -> s.getScore() < 60).toList();
        // 8. toArray():
        Object[] objects = s.stream().filter(s -> s.getScore() < 60).toArray();
        System.out.println(Arrays.toString(objects));
        // 9. toArray(IntFunction<A[]> generator):
        Student[] girls = s.stream().filter(s -> s.getGender().equals("女")).toArray(new IntFunction<Student[]>() {
            @Override
            public Student[] apply(int value) {
                return new Student[value];
            }
        });
        //9.1 lambda方法引用  实现抽象方法时,创建了一个数组,查望都正好是抽象方法的形参,抽象方法必须要返回一个数组
        Student[] girls2 = s.stream().filter(s -> s.getGender().equals("女")).toArray(Student[]::new);
    }
}

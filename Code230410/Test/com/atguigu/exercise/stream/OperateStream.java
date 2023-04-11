package com.atguigu.exercise.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/10/2023 10:24 PM
 * 流的中间操作
 */
public class OperateStream {
    List<Student> s = new ArrayList<>();

    @Before
    public void before(){
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
    public void operate(){
        //1. filter(Predicate<T> predicate):用来过滤满足条件的数据
        s.stream().filter(new Predicate<Student>() {
            @Override
            public boolean test(Student student) {
                return student.getScore()<60;
            }
        }).forEach(new Consumer<Student>() {
            @Override
            public void accept(Student student) {
                System.out.println(student);
            }
        });
        //lambda简化方式1
        s.stream().filter(s->s.getScore()<60).forEach(s-> System.out.println(s));
        //lambda简化方式2
        s.stream()./*获取流*/
                filter(s->s.getScore()<60)./*定义规则*/
                forEach(System.out::println);/*对每一个对象执行打印的操作*/

        //2. distinct():
        s.stream().distinct().forEach(System.out::println);
        System.out.println("------------------------");
        //3. limit(long max):
        s.stream().limit(3).forEach(System.out::println);
        System.out.println("------------------------");
        //4. skip(int length):
        s.stream().skip(3).forEach(System.out::println);
        System.out.println("------------------------");
        //5. Stream sorted(Comparator c):
        s.stream().sorted(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getScore()-o2.getScore();
            }
        }).forEach(System.out::println);
            //5.1除了new一个comparator之外,还可以调用Comparator里面的一个静态方法提供比较器
        s.stream().sorted(Comparator.comparing(new Function<Student, Integer>() {
            @Override
            public Integer apply(Student student) {
                return student.getScore();
            }
        })).forEach(System.out::println);
            //5.1的lambda方法引用
        s.stream().sorted(Comparator.comparing(Student::getScore)).forEach(System.out::println);
        System.out.println("------------------------");
        //6. map(Function f):
        //获取流中每个元素的名字
        s.stream().map(new Function<Student, String>() {
            @Override
            public String apply(Student student) {
                return student.getName();
            }
        }).forEach(System.out::println);
        //  6.1 lambda方法引用简写方式
        s.stream().map(Student::getName).forEach(System.out::println);
        System.out.println("------------------------");
        //7. mapToInt
        s.stream().mapToInt(new ToIntFunction<Student>() {
            @Override
            public int applyAsInt(Student value) {
                return value.getScore();
            }
        }).forEach(System.out::println);
            //7.1 lambda方法引用的写法
        s.stream().mapToInt(Student::getScore).forEach(System.out::println);
        System.out.println("--------------maptoInt----------");
        //8. peek(Consumer c):
        s.stream().peek(new Consumer<Student>() {
            @Override
            public void accept(Student student) {
                student.setScore(student.getScore()+2);
            }
        }).forEach(System.out::println);
        //8.1 lambda改写成为方法的引用
        s.stream().peek(s->s.setScore(s.getScore()+2)).forEach(System.out::println);
        System.out.println("------------------------");
        //9. flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)
    }
    @Test
    public void testFlatMap(){
        Student[][] students = {
                {
                        new Student("张三1", 19, "上海", "男", 89),
                        new Student("李四1", 20, "南京", "男", 90)
                },
                {
                        new Student("张三2", 18, "上海", "男", 89),
                        new Student("李四2", 20, "南京", "男", 90),
                        new Student("王五2", 19, "南京", "男", 90),
                        new Student("赵六2", 21, "南京", "男", 90)
                },
                {
                        new Student("张三3", 17, "上海", "男", 89),
                        new Student("李四3", 29, "南京", "男", 90),
                        new Student("王五3", 22, "南京", "男", 90)
                },
        };
        Arrays.stream(students).flatMap(new Function<Student[], Stream<?>>() {
            @Override
            public Stream<?> apply(Student[] students) {
                return Arrays.stream(students).map(new Function<Student, String>() {
                    @Override
                    public String apply(Student student) {
                        return student.getName();
                    }
                });
            }
        }).forEach(System.out::println);
        //lambda方法引用改写上述代码
        Arrays.stream(students)./*获取二维数组流*/
                flatMap(s-> Arrays.stream(s).map(Student::getName))./*将二维数组再展开,再用map方法获得新的流*/
                forEach(System.out::println);
    }

}

package com.atguigu.stream;

import com.atguigu.bean.Student;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/*
流的使用步骤:
1. 获取流
    Arrays.stream(数组) / list.stream()
2. 操作流
    2.1 中间操作: 执行完中间操作以后，得到的结果依然是一个 Stream流
        filter(Predicate<T> predicate): 用来过滤流中满足条件的数据
            predicate对象的test(T t)方法用来设定过滤条件
        distinct(): 去重,判断的依据也是先调用 hashCode方法，再调用equals方法
        limit(long max): 查看 max 个元素
        skip(int length): 跳过 length 个元素
            每页显示num个，第page也显示的数据:  stream.skip((page-1)*num).limit(num)
        Stream sorted(Comparator c): 排序

        map(Function f): 让流里的每个元素都执行一次function函数，将function函数的返回值再组成一个新的流
        peek(Consumer c):接收Lambda，对流中的每个数据执行Lambda操作
            得到的流类型还是之前的类型,通常会在Consumer里修改对象的属性
        flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)

    2.2 终结操作: 执行终结操作以后，得到的结果不再是一个Stream流
        all/any/noneMatch(Predicate filter)
        findFirst() / findAny(): 获取到流里的第一个数据，得到的结果是一个 Optional类型的对象
        forEach(Consumer<T> consumer):  用来遍历流里的数据
        count(): 统计个数
        max(Comparator c)/min(Comparator c): 根据比较器获取到 最大/最小值  得到的结果是一个 Optional类型的对象
        reduce(): 减项
        collect(): 将流里的数据存入到集合
        toArray(): 将流里的数据存入到Object类型的数组
        toArray(IntFunction<A[]> generator):   stream().toArray(Student[]::new) 将流里的数据存入到 Student类型的数组
*/
public class StreamDemo2 {
    List<Student> students = new ArrayList<>();

    @Before
    public void before() {
        students.add(new Student("jack", 19, "上海", "男", 70));
        students.add(new Student("merry", 18, "北京", "女", 90));
        students.add(new Student("helen", 20, "南京", "女", 81));
        students.add(new Student("henry", 17, "杭州", "男", 58));
        students.add(new Student("henry", 17, "杭州", "男", 58));
        students.add(new Student("tony", 18, "合肥", "男", 62));
        students.add(new Student("tom", 21, "苏州", "男", 59));
        students.add(new Student("lucy", 20, "石家庄", "女", 55));
        students.add(new Student("jerry", 20, "苏州", "男", 57));
        students.add(new Student("stack", 20, "苏州", "男", 51));
    }


    @Test
    public void testMiddle() {
        students.stream().filter(s -> s.getAge() < 19).forEach(System.out::println);
        System.out.println("-------------------------------");

        students.stream().distinct().forEach(System.out::println);
        System.out.println("-------------------------------");

        students.stream().limit(3).forEach(System.out::println);
        System.out.println("-------------------------------");

        students.stream().skip(4).forEach(System.out::println);
        System.out.println("-------------------------------");

        students.stream().sorted(Comparator.comparingInt(Student::getAge)).forEach(System.out::println);
        System.out.println("-------------------------------");

        students.stream().map(Student::getName).forEach(System.out::println);
        System.out.println("-------------------------------");

        students.stream().mapToInt(Student::getScore).forEach(System.out::println);
        System.out.println("-------------------------------");

        students.stream().map(Student::getName).forEach(System.out::println);
        System.out.println("-------------------------------");

        students.stream().peek(s -> s.setScore(s.getScore() + 3)).forEach(System.out::println);
        System.out.println("-------------------------------");
    }

    @Test
    public void testFlatMap() {
        Student[][] ss = {
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

        /*Arrays.stream(ss).flatMap(new Function<Student[], Stream<String>>() {
            @Override
            public Stream<String> apply(Student[] students) {
                return Arrays.stream(students).map(Student::getName);
            }
        }).forEach(System.out::println);*/

        Arrays.stream(ss).flatMap(students -> Arrays.stream(students).map(Student::getName)).forEach(System.out::println);

    }

    @Test
    public void testTerminate() {
        System.out.println(students.stream().allMatch(s -> s.getAge() > 20));  // false
        System.out.println(students.stream().anyMatch(s -> s.getAge() > 20)); // true
        System.out.println(students.stream().noneMatch(s -> s.getScore() < 60));  // false

        System.out.println(students.stream().findFirst());  // Optional[Student{name='jack', age=19, city='上海', gender='男', score=70}]
        System.out.println(students.stream().findAny());  // Optional[Student{name='jack', age=19, city='上海', gender='男', score=70}]


        System.out.println(students.stream().filter(s -> s.getScore() < 60).count());

        System.out.println(students.stream().max(Comparator.comparingInt(Student::getAge)));
        System.out.println(students.stream().min(Comparator.comparingInt(Student::getScore)));

        OptionalInt reduce = students.stream().mapToInt(Student::getScore).reduce(Integer::sum);
        System.out.println(reduce);
    }


    @Test
    public void testCollection() {
        /*
        流的特点:
            1. 流不会存储数据，如果想要存储数据，需要将流里的数据  存入到集合或者数组
            2. 流不会修改源数据
            3. 流操作是延迟执行的，这意味着他们会等到需要结果的时候才执行
                中间操作并不会执行，只有执行终结操作时才会执行
         */
        List<Student> list = students.stream().filter(s -> s.getScore() < 60).collect(Collectors.toList());
        System.out.println(list);

        Object[] objects = students.stream().filter(s -> s.getAge() >= 20).toArray();
        System.out.println(Arrays.toString(objects));

        Student[] girls = students.stream().filter(s -> s.getGender().equals("女")).toArray(Student[]::new);
        System.out.println(Arrays.toString(girls));

        System.out.println("------------------------");
        students.stream().filter(s -> s.getAge() <= 19).forEach(System.out::println);

        System.out.println("------------------------");
        System.out.println(students);

        students.stream().filter(s -> {
            System.out.println("hello");
            return s.getAge() > 20;
        }).forEach(System.out::println);
    }


}

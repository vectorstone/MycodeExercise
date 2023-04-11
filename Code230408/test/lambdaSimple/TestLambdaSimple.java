package lambdaSimple;

import org.junit.Test;

import java.util.Comparator;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/9/2023 9:39 PM
 */
public class TestLambdaSimple {
    private <T> void mySort(T[] t, Comparator<T> comparator) {
        for (int i = 0; i < t.length - 1; i++) {
            for (int j = 0; j < t.length - 1 - i; j++) {
                if (comparator.compare(t[j], t[j + 1]) > 0) {
                    T s = t[j];
                    t[j] = t[j + 1];
                    t[j + 1] = s;
                }
            }
        }
    }

    @Test
    public void TestMySort() {
        Person[] people = {
                new Person("Tom", "北京", 24),
                new Person("Jerry", "上海", 29),
                new Person("Henry", "广州", 30),
                new Person("gavin", "新加坡", 31),
                new Person("Nancy", "渥太华", 20),
        };
        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println("--------------------");
        /*mySort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });*/
        /*
        * 1.省略了形参类型,否则应该写成mySort(people,(Person o1,Person o2)->o1.getAge()-o2.getAge());
        * 2.方法体只有一行代码,所以省略了{},否则mySort(people,(o1,o2)->{o1.getAge()-o2.getAge()});
        * 3.省略了{}之后,还省略了;否则mySort(people,(o1,o2)->{o1.getAge()-o2.getAge();});
        * 4.有返回值,省略了return,否则mySort(people,(o1,o2)->return {o1.getAge()-o2.getAge();});
        * */
        mySort(people,(o1,o2)->o1.getAge()-o2.getAge());

        for (Person person : people) {
            System.out.println(person);
        }
    }
}

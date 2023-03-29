package com.atguigu.objarr;

import com.atguigu.bean.Animal;
import com.atguigu.bean.Person;
import com.atguigu.bean.Student;

/*
对象数组的使用
int[] arr = {1, 2, 3};  定义了一个int类型的数组，数组里能够存储 int类型的值
Animal[] animals = new Animal[5];  定义了一个 Animal类型的数组

数组里的元素有默认值，和元素的类型有关
byte/short/int/long -->0   float/double--> 0.0  char-->空字符
boolean-->false   引用数据类型 --> null

数组是一个引用数据类型，可以把它看做是一个特殊的对象
int[][] nums = {
    {1, 2, 3},
    {4, 5, 6, 7, 8}
};

int[][] nums = new int[5][];
{
    null,null,null,null,null
}
数组是一个长度固定，按照顺序存储兼容类型数据的容器
*/
public class ObjectArray {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        // animals[0] = 3;  报错,数组里应该存储Animal类型的对象

        animals[0] = new Animal("哈士奇", 3);
        animals[1] = new Person("jack", 18, "上海");
        animals[2] = new Student("jerry", 18, "北京", 80);

        Animal a = new Student("tom", 19, "南京", 90);
        animals[3] = a;


        int sum = 0;
        for (int i = 0; i < animals.length; i++) {
            sum += animals[i].getAge();
        }
        System.out.println(sum);

        Animal x = null;
        System.out.println(x);  // "null"
    }
}

package com.atguigu.str;

import java.util.Arrays;

/*
字符串里的常用方法:
    查询相关:
        length(): 获取到字符串的长度
        charAt(int index):获取指定位置上的字符,下标从0开始
        codePointAt(int index): 获取指定位置上字符对应的Unicode编码
        indexOf(char c) / lastIndexOf(char c): 查看字符的下标
    判断相关:
        isEmpty():判断字符串是否为空
        startsWith(String s) / endsWith(String s): 判断字符串是否以指定的内容开始/结束
        contains(CharSequence s): 判断字符串是否包含另一个字符串
        matches(String regex): 判断字符串是否匹配某一个规则
    转换相关:
        getBytes(String charset): 将字符串转换成为二进制数组
        toCharArray(): 将字符串转换成为char类型的数组
    比较相关:
        == String是引用数据类型, == 比较的是内存地址，不是内容!不要使用 == 比较字符串的内容
        equals(Object o): 重写了equals方法，用来比较内容是否相同
        equalsIgnoreCase(String s): 不区分大小写的比较
        compareTo(String s): 用来比较字符串的大小
        compareToIgnoreCase(String s):不区分大小写比较字符串的大小
    "修改”相关:
        substring():
        replace()/replaceAll()/replaceFirst():
        toLowerCase() / toUpperCase():
        trim():

正则表达式:  String类里的方法，如果形参名字是 regex的，表示参数是一个正则表达式
    matches / split / replaceFirst / replaceAll
*/
public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = "abcdefghijklmnopiq";

        System.out.println(s1.length());  // 18
        System.out.println(s1.isEmpty());  // false
        System.out.println(s1.startsWith("abc")); // true
        System.out.println(s1.endsWith("iq"));  // true
        System.out.println(s1.contains("hi"));  // true
        System.out.println(s1.matches("a.+")); // true

        String s2 = "";
        System.out.println(s2.isEmpty());  // true

        System.out.println(s1.charAt(2));

        System.out.println(s1.codePointAt(3));

        System.out.println(s1.indexOf('i'));
        System.out.println(s1.lastIndexOf("i"));

        char[] chars = s1.toCharArray();
        System.out.println(Arrays.toString(chars));

        String s3 = "hello";
        String s4 = new String("hello");
        System.out.println(s3 == s4);
        System.out.println(s3.equals(5));  // false

        System.out.println("hello".equals("yes"));
        System.out.println("hello".equals("gooda"));
        System.out.println(s3.equals(s4));  // true
        System.out.println(s3.equals(s3));  // true

        System.out.println("hello".equals("Hello"));  // false
        System.out.println("hello".equalsIgnoreCase("Hello"));  // true

        System.out.println("hello".compareTo("good"));
        System.out.println("hello".compareTo("hello"));
        System.out.println("hello".compareTo("helloabc"));  // -1
        System.out.println("hello".compareTo("xyz"));
        System.out.println((int) 'h');
        System.out.println((int) 'x');

        System.out.println("hello".compareTo("Hello"));
        System.out.println("hello".compareToIgnoreCase("Hello"));


        // 字符串的所有方法，都不会修改原来的字符串。“修改”相关的方法，是返回一个新的字符串
        // 字符串是不可变的类型! 一旦定义好了字符串的内容，后面就不能修改了
        String s5 = "good morning";

        System.out.println(s5.substring(3)); // 从 beingIndex(包含)开始截取到最后
        System.out.println(s5.substring(3, 7));  // 从beginIndex(包含)开始截取到endIndex(不包含)

        System.out.println(s5);  // good morning

        String s7 = "good morning";
        System.out.println(s7);  // good morning
        System.out.println(s5 == s7);


        String s6 = s5.replace("o", "x");
        System.out.println(s6);  // gxxd mxrning
        System.out.println(s5);  // good morning

        String s8 = s5.replaceAll("o", "x");
        System.out.println(s8); // gxxd mxrning


        System.out.println("good".toUpperCase());  // GOOD
        System.out.println("Hello".toLowerCase());  // hello

        System.out.println("    good    ");
        System.out.println("    goo d    ".trim());  // 去掉字符串两端的空格


    }
}

package com.atguigu.str;

/*
StringBuilder里的常见方法:
    append(String s): 追加字符串
    delete(int start,int end):
    replace(int start,int end,String s):
    reverse(): 翻转字符串

StringBuffer和StringBuilder作用相同，实现原理相似
区别在于: StringBuilder是新的API,JDK1.5出现，线程不安全的，效率高;(优先使用)
        StringBuffer是老的API,JDK1.0就出现了，方法上会有synchronized修饰符，是线程安全，效率低。
 */
public class SBDemo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.append("world");

        sb.delete(2, 5);  // 从下标为2(包含)开始删除到下标为5(不包含)
        System.out.println(sb);

        sb.replace(3, 5, "m");
        System.out.println(sb);
        sb.insert(2,"good");
        System.out.println(sb);

        System.out.println(sb.reverse());
        String s = sb.toString();  // 可变字符串变成不可变字符串
    }
}

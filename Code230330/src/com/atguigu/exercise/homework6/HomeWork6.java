package com.atguigu.exercise.homework6;

import java.util.*;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/31/2023 8:31 PM
 */
public class HomeWork6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入字符:");
        String next = input.next();

        input.close();
        System.out.println("去重前:"+next);
        //使用split方法将字符串进行分割并转换成String数组
        String[] split = next.split("");
        // System.out.println(Arrays.toString(split));

        //将String[] split数组转成list类型
        //不要使用asList方法,否则无法进行分割
        //调用Collections里面的addAll方法将数组变成List
        List<String> words = new ArrayList<>();
        Collections.addAll(words,split);
        // System.out.println(words);

        //使用拉姆达表达式去重
        // words.removeIf(s->(words.indexOf(s)!=words.lastIndexOf(s)));

        Iterator<String> itr = words.iterator();
        while(itr.hasNext()){
            String x = itr.next();
            if(words.indexOf(x) != words.lastIndexOf(x)){
                itr.remove();
            }
        }
        // System.out.println(words);
        System.out.print("去重后:");
        for (String word : words) {
            System.out.print(word);
        }


    }
}

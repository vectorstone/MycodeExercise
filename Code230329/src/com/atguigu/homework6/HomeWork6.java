package com.atguigu.homework6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/30/2023 9:50 AM
 */
public class HomeWork6 {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        for (int i = 'a'; i <= 'z'; i++) {
            list.add((char)i);
        }
        for (int i = 'A'; i <= 'Z'; i++) {
            list.add((char)i);
        }
        for (int i = '0'; i <= '9'; i++) {
            list.add((char)i);
        }
        /*//迭代器的方式遍历一下集合,看下是不是自己想要的结果
        Iterator<Character> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        //增强for方式,遍历一下集合,看下是不是自己想要的结果
        for (Character character : list) {
            System.out.println(character);
        }*/

        //生成随机索引,将索引处的字符拿出来拼接成字符串,再将字符串放到集合中
        List<String> password = new ArrayList<>();
        for (int j = 0; j < 10; j++) {
            String initial = "";
            for (int i = 0; i < 6; i++) {
                //随机生成0到集合size-1范围内元素的下标
                int index =  (int)(Math.random()*list.size());
                initial += list.get(index);
            }
            password.add(initial);
        }

        //迭代器的方式遍历输出10组验证码
        Iterator<String> passwd = password.iterator();
        while(passwd.hasNext()){
            System.out.println("随机验证码:"+passwd.next());
        }
        System.out.println("----------------------");
        //增强for的方式遍历输出10组验证码
        for (String s : password) {
            System.out.println("随机验证码:"+s);
        }
    }
}

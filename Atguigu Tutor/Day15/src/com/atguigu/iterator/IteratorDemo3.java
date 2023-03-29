package com.atguigu.iterator;

import java.util.*;

/*
迭代器源码分析:
int cursor = 0;  int lastRet = -1;    int expectedModCount = modCount;
modCount表示增加和删除元素的次数,无论是增加还是删除元素，都会加1
*/
public class IteratorDemo3 {
    public static void main(String[] args) {
        ArrayList<String> heroes = new ArrayList<>();
        heroes.add("孙悟空");
        heroes.add("小钻风");
        heroes.add("奔波儿灞");
        heroes.add("金角大王");
        heroes.add("孙悟空");
        heroes.add("孙悟空");
        heroes.add("霸波尔奔");
        heroes.remove("金角大王");

        Set<String> set = new HashSet<>();
        set.add("白骨精");
        set.add("黑熊精");
        set.add("蜘蛛精");
        heroes.addAll(set);

        Iterator<String> itr = heroes.iterator();
        /*while (itr.hasNext()) {
            // next方法在执行以前，会比较  modCount和expectedModCount的值，如果不相等，直接抛出异常!
            String x = itr.next();
            if (x.equals("孙悟空")) {
                // 移除元素以后, modCount就会自增，但是expectedModCount不会自增
                heroes.remove(x);
            }
        }*/

        while (itr.hasNext()) {
            String x = itr.next();
            if (x.equals("孙悟空")) {
                itr.remove();
            }
        }

        // heroes.removeIf(x -> x.equals("孙悟空"));
        System.out.println(heroes);
    }
}

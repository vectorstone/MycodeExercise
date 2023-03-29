package com.atguigu.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo2 {
    public static void main(String[] args) {
        List<String> heroes = new ArrayList<>();
        heroes.add("孙悟空");
        heroes.add("小钻风");
        heroes.add("金角大王");
        heroes.add("孙悟空");
        heroes.add("孙悟空");
        heroes.add("奔波儿灞");
        heroes.add("霸波尔奔");

        /*for (int i = 0; i < heroes.size(); i++) {
            if (heroes.get(i).equals("孙悟空")) {
                heroes.remove(i);
                i--;
            }
        }*/
        /*for (int i = 0; i < heroes.size(); ) {
            if (heroes.get(i).equals("孙悟空")) {
                heroes.remove(i);
                continue;
            }
            i++;
        }*/

        /*for (int i = heroes.size() - 1; i >= 0; i--) {
            if (heroes.get(i).equals("孙悟空")) heroes.remove(i);
        }*/

        // 在增强for循环里，不能增加或者删除元素(不能修改元素的个数)
        // 否则会出现 ConcurrentModificationException

        Iterator<String> itr = heroes.iterator();
        while (itr.hasNext()) {
            String hero = itr.next();
            if (hero.equals("孙悟空")) heroes.remove(hero);
        }
        /*for (String hero : heroes) {
            if (hero.equals("孙悟空")) heroes.remove(hero);
        }*/


        System.out.println(heroes);
    }
}

package com.atguigu.exercise.homework1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/30/2023 2:08 PM
 */
public class HomeWork1 {
    public static void main(String[] args) {
        String[] num = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] color = {"黑桃", "红心", "梅花", "方块"};
        String[] king = {"大王", "小王"};

        List<String> poker = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < num.length; j++) {
                poker.add(color[i] + num[j]);
            }
        }
        poker.add(king[0]);
        poker.add(king[1]);
        int count = 1;
        for (String s : poker) {
            if (count % 14 == 0) {
                System.out.println(s + " ");
            } else {
                System.out.print(s + " ");
            }
            count++;
        }
        System.out.println();
        /*System.out.println(poker.get(0));
        poker.remove(0);
        System.out.println(poker.contains("黑桃A"));*/
        // 生成[m,n]的随机整数   m = 0 n = poker.size() - 1
        //(int)(Math.random()*(n-m+1))+m;
        //(int)(Math.random()*(poker.sieze())
        List<String> p1 = new ArrayList<>();
        List<String> p2 = new ArrayList<>();
        List<String> p3 = new ArrayList<>();
        List<String> p4 = new ArrayList<>();

        // 给第一个人发牌
        givePoker(p1, poker);
        // 给第二个人发牌
        givePoker(p2, poker);
        // 给第3个人发牌
        givePoker(p3, poker);
        // 给第4个人发牌
        givePoker(p4, poker);

        // 遍历显示每个人的牌
        show(p1, 1);
        show(p2, 2);
        show(p3, 3);
        show(p4, 4);

        // 遍历显示剩余的牌
        int nums = 1;
        String s = "剩余: [";
        for (String ss : poker) {
            if (nums == 10) {
                s += ss + "]";
            } else {
                s += ss + ", ";
            }
            nums++;
        }
        System.out.println(s);
    }
    // 将发牌过程抽出来,做成一个方法
    public static void givePoker(List p, List poker) {
        // 给第一个人发牌
        for (int i = 0; i < 11; i++) {
            int random = (int) (Math.random() * poker.size());
            // remove(int index) 删除这个元素,并返回这个元素
            p.add(poker.remove(random));
        }
    }

    // 将遍历每个人牌的过程抽出来,做成一个方法
    public static void show(List p, int i) {
        int count = 1;
        String s = "第" + i + "个人: [";
        for (Object o : p) {
            if (count == 11) {
                s += o + " ";
            } else {
                s += o + ", ";
            }
            count++;
        }
        s += "]";
        System.out.println(s);
    }
}

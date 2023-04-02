package com.atguigu.exercise.homework5;

import java.util.*;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/1/2023 9:59 PM
 */
public class HomeWork5 {
    public static void main(String[] args) {
        String[] nums = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] colors = {"方片", "梅花", "红桃", "黑桃"};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 54; i++) {
            list.add(i + 1);
        }
        // System.out.println(list);
        Map<Integer, String> map = new HashMap<>();
        int a = 0;
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                map.put(++a, colors[i] + nums[j]);
            }
        }
        // System.out.println(map);
        Collections.shuffle(list);
        Set<Integer> p1 = new TreeSet<>();
        Set<Integer> p2 = new TreeSet<>();
        Set<Integer> p3 = new TreeSet<>();
        Set<Integer> p4 = new TreeSet<>();
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 13; i++) {
                switch (j) {
                    case 0:
                        p1.add(list.remove(0));
                        break;
                    case 1:
                        p2.add(list.remove(0));
                        break;
                    case 2:
                        p3.add(list.remove(0));
                        break;
                    case 3:
                        p4.add(list.remove(0));
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.println("左边玩家的牌是:");
        for (Integer integer : p1) {
            System.out.print(map.get(integer) + " ");
        }
        System.out.println("\n右边玩家的牌是:");
        for (Integer integer : p2) {
            System.out.print(map.get(integer) + " ");
        }
        System.out.println("\n上边玩家的牌是:");
        for (Integer integer : p3) {
            System.out.print(map.get(integer) + " ");
        }
        System.out.println("\n我的牌是:");
        for (Integer integer : p4) {
            System.out.print(map.get(integer) + " ");
        }

        System.out.println("\n底牌的牌是:");
        for (Integer integer : list) {
            System.out.print(map.get(integer) + " ");
        }

    }
}

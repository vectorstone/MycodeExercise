package tiku.exercise;

import java.util.*;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/12/2023 7:25 PM
 */
public class ListSet{
    public static void main(String[] args){
        List list = Arrays.asList(1,2,3,3,4,4,5,5,6,1,9,3,25,4);
        //asList创建的list无法增加和删除元素
        //先将list转换成为正常的可以增加和删除元素List集合
        //List<Integer> list2 = new ArrayList<>(list);
        Set<Integer> set = new HashSet<>();
        set.addAll(list);
        for(Integer i : set){
            System.out.println(i);
        }

    }
}

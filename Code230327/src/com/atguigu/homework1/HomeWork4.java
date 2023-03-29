package com.atguigu.homework1;

import java.util.Scanner;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/27/2023 7:16 PM
 * 替换某字符串中的某字符串。
 * * 键盘录入一个srcStr字符串，再录入一个delStr字符串。
 * * 删除该字srcStr符串中的所有delStr字符串。
 */
public class HomeWork4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入srcStr:");
        String srcStr = input.nextLine();

        System.out.print("请输入delStr:");
        String delStr = input.nextLine();

        //使用replace方法删除srcStr字符串中的delStr内容
        String length = srcStr.replace(delStr,"");

        //统计srcStr中delStr的次数(使用删除delStr后剩余的长度除以delStr的长度,就是被删掉的数量)
        int count = (srcStr.length()-length.length()) / delStr.length();
        System.out.println(srcStr+"删除"+delStr+"后的结果是:"+length);
        System.out.println(delStr+"在"+srcStr+"中出现的次数是:"+count);

    }
}

package com.atguigu.leetcode;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/23/2023 4:24 PM
 */
public class Solution {
    public static void main(String[] args) {
        String ransomNote = "a";
        String magazine = "aa";
        char[] a = alphabet(ransomNote);
        char[] b = alphabet(magazine);


    }

    public static boolean judge(char[] a,char[] b){

        for (int i = 0; i < a.length; i++) {
            if(b[i] < a[i]) {
                return false;
            }
        }
        return true;
    }



    public static char[] alphabet(String a){
        //这个方法的作用是统计字符串中英文字母的使用次数
        char[] chars = a.toCharArray();
        char[] alphabets = new char[26];
        for (int i = 0; i <chars.length; i++) {
            alphabets[chars[i]-97]++;
        }
        return alphabets;
    }

}



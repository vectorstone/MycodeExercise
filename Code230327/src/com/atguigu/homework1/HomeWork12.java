package com.atguigu.homework1;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/27/2023 10:48 PM
 * 已知一个字符串String str = "1、 hello 2. world 3. java 4.String 5. haha 6、HELLO";
 * <p>
 * 要求统计出现次数最多的字母及其出现的次数。不区分大小写。
 */
public class HomeWork12 {
    public static void main(String[] args) {
        String str = "1、 hello 2. world 3. java 4.String 5. haha 6、HELLO";
        str = str.toLowerCase();
        // System.out.println(str);
        str = str.replaceAll("[^a-zA-Z]","");
        // System.out.println(str);
        char[] chars = str.toCharArray();
        int[] arr = new int[26];
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
               arr[chars[i]-'a']++;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if ( max == arr[i]){
                index = i;
            }
        }

        System.out.println("出现次数最多的字母是:"+(char)(97+index)+",出现的次数是:"+max);
    }
}

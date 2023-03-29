package com.atguigu.str;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/*
创建String的实例对象：
    1. 使用双引号包裹的字符串字面量，就可以认为是字符串类型的实例对象
    2. 调用构造方法创建实例对象
        String(): 创建的是一个空字符串
        String(String s) / String(char[] chars)
        String(char[] chars,int offset,int count) / String(int[] codePoints,int offset,int count)

        String(char[] chars) / String(int[] codePoints,int offset,int count)
        String(byte[] bytes) / String(byte[] bytes,int offset,int length) ... ...
*/
public class StringDemo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s1 = "abc";
        String s2 = new String();
        String s3 = new String("hello");
        String s4 = new String(new char[]{'a', 'b', 'c', 'd'});
        String s5 = new String(new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'}, 1, 5);
        System.out.println(s5);

        String s6 = new String(new char[]{'你', '好'});
        String s7 = new String(new int[]{20320, 22909}, 0, 2);
        System.out.println(s7);


        // 纯字母  char[] / int[] / byte[]
        String s8 = new String(new char[]{'你', '好', 'a'});
        System.out.println(s8);  // “你好a"
        String s9 = new String(new int[]{20320, 22909, 97}, 0, 3);
        System.out.println(s9);  //"你好a"

        /*String s10 = new String(new byte[]{20320, 22909, 97});
        System.out.println(s10);*/

        // 如果是单个字符，使用Unicode码表来表示没有问题
        char c1 = '你';  // 20320   01001111 01100000
        char c2 = 'a';  // 97       01100001
        String s = "你a";  // 01001111 01100000 01100001

        /*
        ’你‘    20320
        unicode编码  01001111 01100000
        UTF8编码     11100100 10111101 10100000

        ’a'     97
        unicode编码   01100001
        UTF8编码      01100001

        11100100   10111101   10100000   01100001
        */


        // 字符串转换成为二进制 -->  调用字符串的 getBytes()方法可以将字符串转换成为二进制
        byte[] utf8s = "你好".getBytes("UTF8");
        System.out.println(Arrays.toString(utf8s));

        // 二进制加载成为字符串 --> 调用 new String(byte[] bytes)可以将二进制加载成为字符串
        String x = new String(utf8s, StandardCharsets.UTF_8);
        System.out.println(x);

        // 纯文本字符串的乱码问题
        String y = new String(utf8s, "GBK");  // 编码和解码的字符集不匹配
        System.out.println(y);

        // 一个汉字经过UTF8编码以后占3个字节; 一个汉字经过GBK编码以后占2个字节
        // UTF8 编码 [-28, -67, -96, -27, -91, -67]
        // GBK 解码  -28,-67-> 浣  -96,-27->犲  -91,-67->ソ
    }
}

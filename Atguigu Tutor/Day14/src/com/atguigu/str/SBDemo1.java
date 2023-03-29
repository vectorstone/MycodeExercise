package com.atguigu.str;

/*
StringBuilder是可变字符串,内部维护了一个被  char/byte[] value
*/
public class SBDemo1 {
    public static void main(String[] args) {
        /*String s1 = new String("hello");
        String s2 = new String("world");
        s1 = s1 + s2;*/

        // StringBuilder value数组的初始长度 是 默认支付串长度+16
        // 多余的空间使用默认值
        // sb1里的 value = {'h','e','l','l','o',0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        StringBuilder sb1 = new StringBuilder("hello");
        String s2 = new String("world");

        // sb1里的 value = {'h','e','l','l','o','w','o','r','l','d',0,0,0,0,0,0,0,0,0,0,0}
        sb1.append(s2);
        sb1.append("atguigu");
        sb1.append("good");

        // 如果已经加满了，会把原来的数据复制到一个新的数组，新数组的长度是原来数组的长度 * 2 + 2
        // sb1.append("yes");  // value的长度是 44
        // 扩容后长度 21 * 2 + 2 --> 44   至少需要 21 + 50 --> 71
        sb1.append("01234567890123456789012345678901234567890123456789");
    }
}

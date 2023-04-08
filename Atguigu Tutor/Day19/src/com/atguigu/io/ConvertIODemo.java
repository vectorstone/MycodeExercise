package com.atguigu.io;

import java.io.*;
import java.util.Arrays;

/*
转换流:
    InputStreamReader: 传入一个 字节流 得到一个 InputStreamReader(字符流)
    OutputStreamWriter
*/
public class ConvertIODemo {
    public static void main(String[] args) throws IOException {
        // 3.txt --> utf8  好 [-27, -91, -67]  --> 22909
        FileInputStream fis = new FileInputStream("3.txt");  // 创建了一个字节输入流
        InputStreamReader isr = new InputStreamReader(fis, "UTF8"); // 将字节输入流转换成为字符输入流

        FileOutputStream fos = new FileOutputStream("4.txt");  // 创建了一个字节输出流

        // 好 22909 -->GBK [-70, -61]
        OutputStreamWriter osw = new OutputStreamWriter(fos, "GBK"); // 将字节输出流转换后才能为字符输出流

        int length;
        char[] chars = new char[10];
        while ((length = isr.read(chars)) != -1) {
            osw.write(chars, 0, length);
        }

        osw.close();
        fos.close();
        isr.close();
        fis.close();
    }
}

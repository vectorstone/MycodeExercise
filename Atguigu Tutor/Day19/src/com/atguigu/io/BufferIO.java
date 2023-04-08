package com.atguigu.io;

import java.io.*;
import java.util.Arrays;

/*
缓冲流:也被成为包装流，可以分为  字节缓冲流 和 字符缓冲流

BufferedInputStream  字节输入缓冲流
BufferedOutputStream  字节输出缓冲流
BufferedReader       字符输入缓冲流  readLine()
BufferedWriter       字符输出缓冲流  newLine()
*/
public class BufferIO {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("2.exe");
        BufferedInputStream bis = new BufferedInputStream(fis);

        // test1(fis);  // 16510   15800
        // test2(bis);  // 7573
        // test3(fis, 1024 * 1024 * 2);  // 431
        test4(bis, 1024 * 1024 * 2);  // 455

        // 关闭流
        bis.close();
        fis.close();
    }

    public static void test1(InputStream in) throws IOException {
        long start = System.currentTimeMillis();
        int content;
        while ((content = in.read()) != -1) {
            System.out.println(content);
        }
        long end = System.currentTimeMillis();
        System.out.println("基本流耗时" + (end - start));
    }

    public static void test2(BufferedInputStream bis) throws IOException {
        long start = System.currentTimeMillis();
        int content;
        while ((content = bis.read()) != -1) {
            System.out.println(content);
        }
        long end = System.currentTimeMillis();
        System.out.println("包装流耗时" + (end - start));
    }

    public static void test3(InputStream in, int bufferSize) throws IOException {
        long start = System.currentTimeMillis();
        int length;
        byte[] bytes = new byte[bufferSize];
        while ((length = in.read(bytes)) != -1) {
            System.out.println(Arrays.toString(bytes));
        }
        long end = System.currentTimeMillis();
        System.out.println("基本流耗时" + (end - start));
    }

    public static void test4(BufferedInputStream bis, int bufferSize) throws IOException {
        long start = System.currentTimeMillis();
        int length;
        byte[] bytes = new byte[bufferSize];
        while ((length = bis.read(bytes)) != -1) {
            System.out.println(Arrays.toString(bytes));
        }
        long end = System.currentTimeMillis();
        System.out.println("包装流耗时" + (end - start));
    }
}

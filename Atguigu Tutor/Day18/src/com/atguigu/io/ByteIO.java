package com.atguigu.io;

import java.io.*;
import java.util.Arrays;

/*
字节流 用来操作字节数据 (所有的数据)
字节输入流 FileInputStream 和 字节输出流FileOutputStream

流的操作分为三个步骤:
    1. 打开流: 创建流对象
    2. 操作流: 输入流调用read()方法读取数据 / 输出流调用write()方法写入数据
    3. 关闭流

FileInputStream 字节输入流:
    构造方法:
        FileInputStream(String path): 创建字节输入流对象，读取指定路径的文件
            如果文件不存在，会抛出异常

    常见方法:
        read(): 一次读取一个字节，返回的是读取到int类型的内容。如果读完了，返回-1
        "你" Unicode编码是 20320，经过 UTF8编码以后的结果 [228, 189, 160]  --> [-28,-67,-96]

        read(byte[] bytes): 一次最多读取byte数组个长度的数据，将读取到的数据写入到bytes数组
            返回的结果表示的是读取到的长度，如果读完了，返回-1
    使用字节输入流可以读取任意的文件，包括  纯文本 和 图片/音频/视频/应用程序...
    不推荐将 字节流读取到的数据转换成为字符串，因为有可能乱码

 FileOutputStream字节输出流:
    构造方法:
        FileOutputStream(String path): 如果文件不存在，会创建文件;如果文件已经存在，会覆盖原来的文件
        FileOutputStream(String path,boolean append): append值为true,如果文件已经存在不会覆盖原来的文件，而是追加
    常用方法:
        write(int b): 一次写入一个字节，将int类型的b转换成为byte类型，再写入
        write(byte[] bytes): 一次写入一个byte数组
        write(byte[] bytes,int offset,int length):
*/
public class ByteIO {
    public static void main(String[] args) throws IOException {
        // 1. 打开流
        // FileInputStream fis = new FileInputStream("1.txt");
        FileInputStream fis = new FileInputStream("1.jpg");

        // 2. 操作流
        byte[] bytes = new byte[12];
        int length; // 表示每次读取到的长度
        /*while (true) {
            length = fis.read(bytes);
            if (length == -1) break;
            System.out.println(new String(bytes, 0, length));
        }*/
        while ((length = fis.read(bytes)) != -1) {
            // System.out.println(new String(bytes, 0, length));
            System.out.println(Arrays.toString(bytes));
        }
        // 3. 关闭流
        fis.close();


        FileOutputStream fos = new FileOutputStream("2.txt", true);
        fos.write(new byte[]{-28, -67, -96});
        fos.write(new byte[]{97, 98, 99, 100, 101}, 1, 2);
        fos.close();
    }
}

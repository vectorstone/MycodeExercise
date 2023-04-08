package com.atguigu.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
IO流根据流向分为两大类:
    输入流和输出流

IO流根据操作的数据不同，也可以分为两大类:
    字节流(用来操作任意的文件) 和 字符流(操作纯文本文件)

字符流的常见方法:
    read(): 一次读取一个字符，返回的结果是读取到的字符的Unicode编码
    read(char[] chars):
*/
public class CharIODemo {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("2.txt");
        char[] chars = new char[5];
        int length;
        while ((length = reader.read(chars)) != -1) {
            System.out.println(new String(chars, 0, length));
        }
        reader.close();

        FileWriter writer = new FileWriter("3.txt");
        writer.write(22909);  // 字符流调用write方法并没有立刻将数据写入到硬盘
        writer.write(new char[]{'a', 'b', '你'});
        writer.write("今天下大雨了");
        // 字符流调用write方法以后，需要再调用 flush()/close() 方法将数据写入硬盘
        // writer.flush();
        writer.close();
    }
}

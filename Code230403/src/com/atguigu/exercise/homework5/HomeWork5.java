package com.atguigu.exercise.homework5;

import java.io.*;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/3/2023 8:09 PM
 * 把如下这些数据存放到一个data.dat文件中，并且再次读取显示
 */
public class HomeWork5 {
    public static void main(String[] args) throws IOException {
        int a = 10;
        char c = 'a';
        double d = 2.5;
        boolean b = true;
        String str = "尚硅谷";
        //先用输出流把上述信息存放到文件中

        //使用数据流输入输出对象
        FileOutputStream fo = new FileOutputStream("testIO/data.dat");
        //创建数据输出流对象
        DataOutputStream dos = new DataOutputStream(fo);
        //先将基本数据类型写入到data.txt文件中
        dos.writeInt(10);
        dos.writeChar(c);
        dos.writeDouble(2.0);
        dos.writeBoolean(b);
        dos.writeUTF(str);

        dos.close();
        fo.close();

        //创建数据输入流对象
        FileInputStream fi = new FileInputStream("testIO/data.dat");
        DataInputStream dis = new DataInputStream(fi);

        //再使用数据输入流读取并打印
        System.out.println(dis.readInt());
        System.out.println(dis.readChar());
        System.out.println(dis.readDouble());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readUTF());

        dis.close();
        fi.close();

    }
}

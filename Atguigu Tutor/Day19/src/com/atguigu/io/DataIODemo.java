package com.atguigu.io;

import java.io.*;

/*
数据流
DataInputStream / DataOutputStream
 */
public class DataIODemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("5.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeInt(5);
        dos.writeInt(20320);
        dos.writeUTF("hello");
        dos.write(20320);
        dos.close();
        fos.close();


        FileInputStream fis = new FileInputStream("5.txt");
        DataInputStream dis = new DataInputStream(fis);
        System.out.println(dis.readInt());
        System.out.println(dis.readInt());
        System.out.println(dis.readUTF());
        System.out.println(dis.read());

        dis.close();
        fis.close();
    }
}

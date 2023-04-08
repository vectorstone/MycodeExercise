package com.atguigu.exercise.homework5;

import java.io.*;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/4/2023 6:22 PM
 */
public class DataIODemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("testIO/5.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeInt(5);
        dos.writeInt(20320);
        dos.writeUTF("测试");
        dos.writeBoolean(true);
        dos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("testIO/5.txt");
        DataInputStream dis = new DataInputStream(fis);
        System.out.println(dis.readInt());
        System.out.println(dis.readInt());
        System.out.println(dis.readUTF());
        System.out.println(dis.readBoolean());

        dis.close();
        fis.close();


    }
}

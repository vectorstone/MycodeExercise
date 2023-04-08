package com.atguigu.exercise.homework6;

import java.io.*;
import java.time.LocalTime;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/4/2023 6:02 PM
 * 1、声明一个Message类，包含：发送者、接收者、消息内容、发送时间
 * 2、创建一个Message对象，并写到message.dat文件中，并再次读取显示
 */
public class WorkHome6 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        LocalTime time = LocalTime.of(22,30,20);
        Message message = new Message("sender","accepter","你好",time);

        FileOutputStream fos = new FileOutputStream("testIO/message.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(message);

        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("testIO/message.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Message o = (Message)ois.readObject();
        System.out.println(o.toString());


    }
}

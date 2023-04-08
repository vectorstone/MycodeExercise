package com.atguigu.udp;

import java.io.FileWriter;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/*
基于UDP的聊天Demo
 */
public class ChatDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8899);

        FileWriter writer = new FileWriter("聊天记录.txt", true);

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    byte[] msg = new byte[1024];
                    DatagramPacket receivePacket = new DatagramPacket(msg, msg.length);
                    try {
                        socket.receive(receivePacket);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    byte[] data = receivePacket.getData();
                    int length = receivePacket.getLength();
                    String s = new String(data, 0, length);
                    String x = "接收到了来自" + receivePacket.getAddress().getHostAddress() + ":" + receivePacket.getPort() + "的消息:" + s + "\n";
                    try {
                        writer.write(x);
                        writer.flush();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                    if (s.equals("拜拜")) break;
                }
            }
        }, "receiveThread").start();

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入对方的IP地址:");
        String ip = scanner.next();
        System.out.print("请输入对方的端口号:");
        int port = scanner.nextInt();
        InetAddress address = InetAddress.getByName(ip);

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.print("请输入聊天内容:");
                    String content = scanner.next();
                    byte[] bytes = content.getBytes();
                    DatagramPacket sendPacket = new DatagramPacket(bytes, bytes.length, address, port);
                    try {
                        socket.send(sendPacket);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                    if (content.equals("886")) break;
                }
            }
        }, "sendThread").start();


    }
}

package com.atguigu.exercise.receiveandsend;

import java.io.FileWriter;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/6/2023 6:15 PM
 * receive and send demo
 */
public class ReceiveAndSend {
    public static void main(String[] args) throws IOException {
        // 先创建DatagramSocket
        DatagramSocket socket = new DatagramSocket(9000);

        // 再来创建一个writter流,用来把接收到的聊天记录输出到文件里面
        FileWriter fw = new FileWriter("testIO/chatLog.txt", true);


        // 创建接受的thread
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    byte[] arr = new byte[1024];
                    DatagramPacket packet = new DatagramPacket(arr, arr.length);
                    try {
                        socket.receive(packet);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    // 将接收到的packet转换成信息
                    byte[] data = packet.getData();
                    int length = packet.getLength();
                    String message  = new String(data);
                    String receiveMessage = "接受到来自:" + packet.getAddress() + ":" + packet.getPort() + "的信息:" + message + "\n";
                    // 读取信息
                    try {
                        fw.write(receiveMessage);
                        fw.flush();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    if (message.equals("886")) {
                        break;
                    }
                }

            }
        }, "receiver").start();


        Scanner input = new Scanner(System.in);
        // System.out.print("请输入对方的IP地址:");
        // String ip = input.next();
        String ip = "192.168.20.66";
        // System.out.print("请输入对方的端口:");
        // int port = input.nextInt();
        int port = 9090;
        InetAddress byName = InetAddress.getByName(ip);


        // 创建发送的thread
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.print("请输入你想发送的内容:");
                    String message = input.next();
                    // 将message转成二进制
                    byte[] bytes = new byte[0];
                    // try {
                        bytes = message.getBytes();
                    // }
                    // catch (UnsupportedEncodingException e) {
                    //     throw new RuntimeException(e);
                    // }

                    // 创建1个packet
                    DatagramPacket packet = new DatagramPacket(bytes, bytes.length, byName, port);
                    try {
                        socket.send(packet);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    if (message.equals("886")) {
                        break;
                    }
                }
            }
        }, "sender").start();
    }
}

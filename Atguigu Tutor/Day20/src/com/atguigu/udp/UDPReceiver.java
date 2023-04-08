package com.atguigu.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
UDP无论是发送还是接收，都使用 DatagramSocket类

调用 receive(DatagramPacket packet)方法 接收数据，会将接收到的数据写入到 packet里

receive方法是一个阻塞的方法，接收到消息以后才会继续执行
*/
public class UDPReceiver {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(9090);

        byte[] bytes = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bytes, 1024);
        // 接收数据，并将数据写入到 packet 里
        socket.receive(packet);

        // 从 packet里获取到数据
        System.out.println(packet.getPort());  // 获取到发送者的端口号
        System.out.println(packet.getAddress().getHostAddress());  // 获取到发送者的IP地址
        byte[] data = packet.getData();  // 获取到发送者发送的数据
        int length = packet.getLength();  // 获取到发送者发送的数据长度
        System.out.println(new String(data, 0, length));

        socket.close();
    }
}

package com.atguigu.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
网络通信也被称为Socket通信，创建一个Socket类型的对象，Socket类型表示的就有IP地址，端口号和协议

UDP是面向无连接的协议，在发送数据之前，收发双发不需要建立连接
DatagramSocket: 基于UDP协议的Socket
    构造方法:
        DatagramSocket(): 创建一个空参数的 DatagramSocket对象
    常见方法:
        send(DatagramPacket packet): 发送数据一个数据包

DatagramPacket: UDP协议里用来收发数据的包
    构造方法:
        DatagramPacket(byte[] buf,int length,InetAddress address, int port):
            buf: 表示的是要发送的二进制数据
            length: 表示要发送的数据长度
            address: 接收方的IP地址
            port: 接收方应用程序的端口号
*/
public class UDPSender {
    public static void main(String[] args) throws IOException, InterruptedException {
        DatagramSocket socket = new DatagramSocket();

        byte[] bytes = "下午好".getBytes();
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.20.125"),8989);
        socket.send(packet);

        Thread.sleep(10000);
        socket.close();
    }
}

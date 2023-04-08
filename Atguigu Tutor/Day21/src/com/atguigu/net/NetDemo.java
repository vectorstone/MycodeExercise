package com.atguigu.net;

/*
网络通信本质: 不是主机A和主机B之间的通信，而是主机A上的进程1和主机B上的进程2之间的通信

网络通信的三要素:  IP地址(找到主机) + 端口(找到进程) + 协议(数据传输的协议)
网络通信就是Socket套接字编程，使用Socket实现网络通信

传输层协议:
    UDP协议: 用户数据报协议。面向无连接的协议，收发双方在传输数据之前不需要先建立连接
        特点: 快，但是不安全，数据有可能丢失
    收发双方都使用 DatagramSocket,UDP协议中没有明确的客户端和服务器的区别
    传输数据使用的是 DatagramPacket类
    DatagramSocket类构造方法:
        DatagramSocket():
        DatagramSocket(int port): 指定绑定的端口
    DatagramSocket的常见方法:
        send(DatagramPacket packet): 表示发送数据
        receive(DatagramPacket packet): 表示接收数据

    DatagramPacket类构造方法:
        DatagramPacket(byte[] buf, int length,InetAddress address, int port):用于发送的数据包
            buf数组表示的是发送的内容;length表示发送的数据;address表示目标主机IP;port表示目标的端口号
        DatagramPacket(byte[] buf,int length): 用于接收的数据包
            buf数组会存储接收到的内容; length表示byte数组的长度
    DatagramPacket的常见方法:通常用在接收数据时
        InetAddress getAddress(): 获取到发送方的IP地址
        int getPort(): 获取到发送方的端口号
        byte[] getData(): 获取到发送方发送的数据
        int getLength(): 获取到发送方发送的数据长度


    TCP协议: 传输控制协议，面向连接的协议，收发双方在传输数据之前必须要先建立连接
        特点: 慢，数据安全。 有严格的客户端和服务器之分
    服务器使用的类 ServerSocket,客户端使用的 Socket类
*/
public class NetDemo {
}

package com.atguigu.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

/*
TCP客户端使用Socket类,常用方法:
    connect(SocketAddress address): 和服务器建立连接
*/
public class TCPClient {
    public static void main(String[] args) throws IOException {
        // 1. 创建一个 客户端的socket
        Socket socket = new Socket();

        // 2. 连接到服务器(TCP是一个面向连接的协议，发送数据之前，必须要先和服务器建立连接)
        SocketAddress server = new InetSocketAddress(InetAddress.getByName("192.168.20.66"), 8899);
        socket.connect(server);

        // 3. 通过输出流向服务器写入数据
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("yes".getBytes());
        // outputStream.close();
        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int length = inputStream.read(bytes);
        System.out.println(new String(bytes, 0, length));

        socket.close();
    }
}

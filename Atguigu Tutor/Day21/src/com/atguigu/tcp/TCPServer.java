package com.atguigu.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
服务器使用 ServerSocket类
ServerSocket构造方法:
    ServerSocket(): 空参数构造方法，基本不使用
    ServerSocket(int port, int backlog, InetAddress bindAddr):
        port: 绑定的端口号   backlog:积压,堆积  bindAddr: 绑定的IP地址

        bindAddr只能使用本机的IP地址，有四种表示本机地址的方式:
            localhost 和 127.0.0.1 一样，都表示 本机
            192.168.20.66  本机的IP地址
            0.0.0.0        表示本机
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        // 1. 创建一个 ServerSocket对象
        ServerSocket serverSocket = new ServerSocket(8899, 50, InetAddress.getByName("192.168.20.66"));

        while (true) {
            // 2. 调用 accept方法接收客户端的Socket连接
            Socket clientSocket = serverSocket.accept();

            // 3. 通过客户端的socket连接

            // 3.1 通过客户端的socket连接获取到客户端发送的数据
            InputStream inputStream = clientSocket.getInputStream();
            byte[] content = new byte[1024];
            int length = inputStream.read(content);
            System.out.println(new String(content, 0, length));
            clientSocket.shutdownInput();

            // 3.2 通过客户端的socket连接给客户端返回数据
            OutputStream outputStream = clientSocket.getOutputStream();
            outputStream.write("ok".getBytes());
            clientSocket.shutdownOutput();

        }
    }
}

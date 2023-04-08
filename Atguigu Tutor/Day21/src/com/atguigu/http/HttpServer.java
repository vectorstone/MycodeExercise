package com.atguigu.http;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer {
    public static void main(String[] args) throws IOException {

        /*
            localhost 和 127.0.0.1一样，都表示 本机
            192.168.20.66  本机的IP地址
            0.0.0.0        表示本机所有可用的ip地址
         */
        // InetAddress address = InetAddress.getByName("127.0.0.1");  只有本机才能访问

        // 本机和网络里的其他电脑都可以通过ip地址访问，本机不能通过 localhost和127.0.0.1访问
        // InetAddress address = InetAddress.getByName("192.168.20.66");

        // 所有可用的地址，本机和网络里的其他电脑都可以通过IP地址访问，本机还可以使用 localhost和127.0.0.1访问!
        InetAddress address = InetAddress.getByName("0.0.0.0");

        ServerSocket serverSocket = new ServerSocket(9090, 50);

        while (true) {
            Socket clientSocket = serverSocket.accept();
            // HTTP协议:超文本传输协议  超文本标记语言HTML

            OutputStream outputStream = clientSocket.getOutputStream();
            // HTTP协议:  每一个响应头后面都要有换行
            outputStream.write("HTTP/1.1 200 OK\r\n".getBytes());
            outputStream.write("content-type:text/html;charset=utf8\r\n".getBytes());
            outputStream.write("heiheihei\r\n".getBytes());
            // 所有的响应头写完了以后，再来一个换行
            outputStream.write("\r\n".getBytes());

            // 这里才是向客户端返回的数据内容
            outputStream.write("<span style='color:red;font-size:32px'>你好</span>".getBytes());
            clientSocket.shutdownOutput();

            clientSocket.close();
        }
    }
}

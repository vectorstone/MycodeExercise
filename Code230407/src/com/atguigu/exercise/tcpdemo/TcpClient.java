package com.atguigu.exercise.tcpdemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/7/2023 9:26 PM
 */
public class TcpClient {
    public static void main(String[] args) throws IOException {
        //创建TCP客户端的socket类
        Socket client = new Socket();

        //TCP协议需要和服务端握手,所以发送数据之前要先和服务器建立连接
        //先获取server的IP地址和端口
        SocketAddress server = new InetSocketAddress(InetAddress.getByName("192.168.10.206"),8989);
        client.connect(server);

        //通过流向服务器写入数据
        OutputStream outputStream = client.getOutputStream();
        outputStream.write("yyy".getBytes());
        //写完数据之后要关闭流,为什么是通过Socket类型的client对象进行关闭的
        client.shutdownOutput();

        //还需要有一个输入流,用来读取服务器返回来的数据
        InputStream inputStream = client.getInputStream();
        byte[] arr = new byte[1024];
        int read = inputStream.read(arr);
        //要先对接收奥德数据进行编码
        String message = new String(arr,0,read);
        System.out.println(message);

    }
}

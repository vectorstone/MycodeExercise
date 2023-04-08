package com.atguigu.exercise.tcpdemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/7/2023 9:26 PM
 */
public class TcpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8989,50, InetAddress.getByName("192.168.10.206"));

        //不停的循环接收来自客户端的消息
        while(true){
            //接收客户端的连接,然后创建一个Socket对象(有点像客户端了)
            Socket accept = serverSocket.accept();

            //连接客户端
                //接收客户端的信息
            InputStream serverInputStream = accept.getInputStream();
            byte[] arr = new byte[1024];
            int length = serverInputStream.read(arr);
            System.out.println(new String(arr,0,length));
                //记得使用完成后要关闭流
            accept.shutdownInput();

            //返回给客户端的信息
            OutputStream outputStream = accept.getOutputStream();
            String respond = "sss";
                //对信息进行解码
            byte[] bytes = respond.getBytes();
            outputStream.write(bytes);
                //同样的记得要关闭流
            accept.shutdownOutput();

        }
    }
}

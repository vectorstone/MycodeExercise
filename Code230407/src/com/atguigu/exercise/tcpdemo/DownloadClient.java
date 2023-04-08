package com.atguigu.exercise.tcpdemo;

import java.io.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/7/2023 9:26 PM
 */
public class DownloadClient {
    public static void main(String[] args) throws IOException {
        // 创建socket
        Socket clientSocket = new Socket();
        // 服务端IP和端口
        SocketAddress server = new InetSocketAddress(InetAddress.getByName("192.168.10.206"), 9898);
        // 连接服务端
        clientSocket.connect(server);

        //输入要下载的文件的路径
        Scanner input = new Scanner(System.in);
        System.out.print("请输入要下载的文件的路径:");
        String next = input.next();
        input.close();

        //发送文件路径给服务端
        OutputStream outputStream = clientSocket.getOutputStream();
        outputStream.write(next.getBytes());
        clientSocket.shutdownOutput();

        //读取从服务端获取到的数据
        InputStream inputStream = clientSocket.getInputStream();
        byte[] arr = new byte[1024];
        String s = new String(arr, 0, inputStream.read(arr));
        if(!s.trim().equals("OK        ")){
            System.out.println("要下载的文件不存在");
            clientSocket.shutdownInput();
            clientSocket.close();
            return;
        }
        FileOutputStream fw = new FileOutputStream(next);
        byte[] content = new byte[1024];
        int length;
        while((length = inputStream.read(content))!= -1){
            fw.write(content,0,length);
        }
        fw.close();
        clientSocket.shutdownOutput();
        clientSocket.close();


    }
}

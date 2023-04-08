package com.atguigu.exercise.tcpdemo;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/7/2023 10:27 PM
 */
public class DownloadServer {
    public static void main(String[] args) throws IOException {
        //创建serverSocket
        ServerSocket server = new ServerSocket(9898,50, InetAddress.getByName("192.168.10.206"));

        //接收客户端的信息
        while(true){
            //接收客户端连接
            Socket accept = server.accept();

            //获取文件下载的路径
            InputStream inputStream = accept.getInputStream();
            byte[] arr = new byte[1024];
            int read = inputStream.read(arr);
            String path = new String(arr,0,read);
            accept.shutdownInput();

            //获取客户端的输出流
            OutputStream outputStream = accept.getOutputStream();

            //发送确认内容
            String head = "OK        ";
            try{
                FileInputStream fis = new FileInputStream(path);
                //返回文件内容之前,先返回一个head
                outputStream.write(head.getBytes());
                //发送文件
                while((read = fis.read(arr)) != -1){
                    outputStream.write(arr,0, read);
                }
                fis.close();
            }catch (FileNotFoundException e){
                System.out.println("用户下载的文件不存在");
                head = "not exists";
                outputStream.write(head.getBytes());
                e.printStackTrace();
            }
            accept.shutdownOutput();
            accept.close();
        }
    }
}

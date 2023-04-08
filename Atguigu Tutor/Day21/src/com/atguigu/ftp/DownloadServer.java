package com.atguigu.ftp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
文件下载服务器
 */
public class DownloadServer {
    public static void main(String[] args) throws IOException {
        // 1. 创建一个ServerSocket
        ServerSocket serverSocket = new ServerSocket(7788);

        while (true) {
            // 2. 接收客户端的socket连接
            Socket clientSocket = serverSocket.accept();

            // 3. 从客户端的socket连接里获取到需要下载的文件路径
            InputStream inputStream = clientSocket.getInputStream();
            byte[] bytes = new byte[1024 * 1024];
            int len = inputStream.read(bytes);
            String path = new String(bytes, 0, len);
            clientSocket.shutdownInput();

            // 4. 从客户端的socket连接里获取到 输出流
            OutputStream outputStream = clientSocket.getOutputStream();

            String header = "ok             ";
            // 5. 将文件读取出来写会给客户端
            try {
                FileInputStream fis = new FileInputStream(path);
                outputStream.write(header.getBytes());  // 在返回文件内容之前，先返回一个header

                while ((len = fis.read(bytes)) != -1) {
                    outputStream.write(bytes, 0, len);
                }
                fis.close();
            } catch (FileNotFoundException e) {
                System.out.println("用户下载的文件不存在");
                header = "not exists     ";
                outputStream.write(header.getBytes());
                e.printStackTrace();
            }

            clientSocket.shutdownOutput();
            clientSocket.close();
        }
    }
}
